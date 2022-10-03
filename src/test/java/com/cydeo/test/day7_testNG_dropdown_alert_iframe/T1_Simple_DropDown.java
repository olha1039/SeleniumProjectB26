package com.cydeo.test.day7_testNG_dropdown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Simple_DropDown {


//    TC #1: Verifying “Simple dropdown” and “State selection”
//    dropdown default values
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/dropdown

   WebDriver driver;


    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void SimpleDropDownTest(){
        //       3. Verify “Simple dropdown” default selected value is correct
//    Expected: “Please select an option”

        driver.get("https://practice.cydeo.com/dropdown");
        Select simpleDropDown = new Select(driver.findElement(By.id("dropdown")));

        // getFirstSelectedOption( method will return to default selected option. Return type is WebElement
        String actualDefaultSimpleDropdown = simpleDropDown.getFirstSelectedOption().getText();
        String expectedDefaultSimpleDropdown = "Please select an option";

        Assert.assertEquals(actualDefaultSimpleDropdown, expectedDefaultSimpleDropdown);

//            4. Verify “State selection” default selected value is correct
//    Expected: “ Select a State”


            Select stateDropdown = new Select(driver.findElement(By.id("state")));
            String actualStateDefaultText = stateDropdown.getFirstSelectedOption().getText();
            String expectedStateDefaultText = "Select a State";

            Assert.assertEquals(actualStateDefaultText, expectedStateDefaultText);

        }


    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }

}
