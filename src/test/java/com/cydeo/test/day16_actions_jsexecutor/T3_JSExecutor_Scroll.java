package com.cydeo.test.day16_actions_jsexecutor;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_JSExecutor_Scroll {

    @Test
    public void etsy_scroll_test(){

// Goto Etsy homepage https://www.etsy.com/
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy.url"));

// Scroll down
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        // (x,y) x stands for horizontal line and y stands for vertical line, positive - down, negative - up
        // js.executeScript("window.scrollBy(0,5000)");

        WebElement email = Driver.getDriver().findElement(By.id("email-list-signup-email-input"));
        js.executeScript("arguments[0].scrollIntoView(true)",email); // argument[0] meaning it will pass me to email that I passed as an argument, it has index 0, if I have another email next to it, it will be index 1

// Generate random email and enter into subscribe box
// Click on Subscribe
        Faker faker = new Faker();
        email.sendKeys(faker.internet().emailAddress() + Keys.ENTER);

// Verify "Great! We've sent you an email to confirm your subscription." is displayed

        WebElement message = Driver.getDriver().findElement(By.xpath("//div[@class='wt-alert wt-alert--inline wt-alert--success-01 wt-text-body-01']"));
        Assert.assertEquals(message.getText(), "Great! We've sent you an email to confirm your subscription.");




    }


}
