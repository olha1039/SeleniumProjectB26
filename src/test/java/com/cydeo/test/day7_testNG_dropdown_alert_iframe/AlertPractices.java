package com.cydeo.test.day7_testNG_dropdown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractices {
//
//    TC #2: Confirmation alert practice
//1. Open browser
//2. Go to website: http://practice.cydeo.com/javascript_alerts
//            3. Click to “Click for JS Confirm” button
//4. Click to OK button from the alert
//5. Verify “You clicked: Ok” text is displayed.

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void confirmAlertTest(){
        WebElement confirmAlertBtn = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        confirmAlertBtn.click();

        Alert alert = driver.switchTo().alert();
        // for clicking OK button in JS alert we are using accept() method
        alert.accept();

        // for clicking Cancel in JS we are using dismiss() method
      //  alert.dismiss();

        WebElement resultText = driver.findElement(By.id("result"));
        Assert.assertTrue(resultText.isDisplayed(), "result text did not appear");

        Assert.assertEquals(resultText.getText(), "You clicked: Ok");

        //or

//        String actualText = resultText.getText();
//        String expectedText = "You clicked: OK";
//        Assert.assertEquals(actualText, expectedText, "result text did not appear correctly");


    }





}
