package com.adak.step_defenitions;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class USSD_steps {


    public AndroidDriver driver;
    public UiAutomator2Options options;
    private AppiumDriverLocalService service;
    
    @SuppressWarnings("deprecation")
    @Before
    public void configureAppium() throws MalformedURLException{

    //connecting to appium server programatically
    service = new AppiumServiceBuilder()
    .withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
    .withIPAddress("127.0.0.1")
    .usingPort(4723)
    .build();

    service.start();

    //initionalizing uiAutomator for real device and set 'mymci' as base app
    options = new UiAutomator2Options()
    .setPlatformName("Android")
    .setPlatformVersion("13")
    .setAutoGrantPermissions(true)
    .setNoReset(true);

    //initionalizing android driver
    driver = new AndroidDriver(
    new URL("http://127.0.0.1:4723"), options);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Given("I open phone app")
    public void i_open_phone_app(){
        // driver.findElement(AppiumBy.accessibilityId("Phone")).click();
        driver.activateApp("com.google.android.dialer");
    }
    
    @When("I open the key pad")
    public void i_open_the_key_pad() {
        driver.findElement(AppiumBy.accessibilityId("key pad")).click();
    }

    @When("I enter code and call")
    public void i_enter_code_and_call() {
        driver.findElement(AppiumBy.accessibilityId("*")).click();
        driver.findElement(AppiumBy.accessibilityId("1,")).click();
        driver.findElement(AppiumBy.accessibilityId("#")).click();
        driver.findElement(AppiumBy.accessibilityId("dial")).click();
    }

    @When("I choose internet")
    public void i_choose_internet() {
        driver.findElement(By.id("com.android.phone:id/input_field")).sendKeys("5");
        driver.findElement(By.id("android:id/button1")).click();
    }

    @When("I choose hamrah aval")
    public void i_choose_hamrah_aval(){
        driver.findElement(By.id("com.android.phone:id/input_field")).sendKeys("1");
        driver.findElement(By.id("android:id/button1")).click();
    }

    @When("I choose CIP")
    public void i_choose_cip() {
        driver.findElement(By.id("com.android.phone:id/input_field")).sendKeys("8");
        driver.findElement(By.id("android:id/button1")).click();
    }

    @Then("It should not available")
    public void it_should_not_available() {
       driver.findElement(By.id("android:id/button1")).click();
    }
    

   @After
    public void tearDown(){
        //stop service and quit driver after all
        driver.terminateApp("com.google.android.dialer");
        driver.quit();
    }
}