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

public class AlertPractice {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //        1. Open browser
//        2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/javascript_alerts");
    }


    @Test
    public void InformationAlertTest(){

//        3. Click to “Click for JS Alert” button
//        4. Click to OK button from the alert
//        5. Verify “You successfully clicked an alert” text is displayed.

        WebElement jsAlertBtn = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsAlertBtn.click();

       // driver.switchTo().alert().accept(); another way to use, but below is better to store first
        Alert alert = driver.switchTo().alert();
        alert.accept(); // method from the alert to handle it, will click on ok button


        WebElement resultText = driver.findElement(By.id("result"));
        // assertTrue() method will check if inside argument is true or false
        Assert.assertTrue(resultText.isDisplayed(), "Result text did not display");

        String actualResultText = resultText.getText();
        String expectedResultText = "You successfully clicked an alert";

        Assert.assertEquals(actualResultText,expectedResultText, "Result text did not appear correctly!");



    }

}
