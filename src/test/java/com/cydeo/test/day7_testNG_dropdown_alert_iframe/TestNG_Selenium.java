package com.cydeo.test.day7_testNG_dropdown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.quit();
    }


    @Test
    public void googleTitle() {

        // set up chrome and create WebDriver instance
        // Get "https://google.com/"
        // Assert: title is  "Google"

        driver.get("https://google.com/");

        String actual = driver.getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actual, expectedTitle, "Title verification failed"); // third argument is optional for failed message, only appear when test is failed

    }

    @Test
    public void yahooTitle() {
        driver.get("https://yahoo.com");
    }

    @Test
    public void etsyTitle() {
        driver.get("https://etay.com");
    }


}
