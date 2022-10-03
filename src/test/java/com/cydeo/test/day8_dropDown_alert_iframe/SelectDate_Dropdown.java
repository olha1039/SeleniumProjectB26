package com.cydeo.test.day8_dropDown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelectDate_Dropdown {
//    Open Chrome browser
//    Go to https://practice.cydeo.com/dropdown
//    Select “December 1st, 1923” and verify it is selected.
//    Select year using: visible text
//    Select month using: value attribute Select
//    day using : index number

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void dateDropDownTest(){

        Select yearDropdown = new Select(driver.findElement(By.id("year")));
        Select monthDropdown = new Select(driver.findElement(By.id("month")));
        Select dayDropdown = new Select(driver.findElement(By.id("day")));

        yearDropdown.selectByVisibleText("1923");
        monthDropdown.selectByValue("11");
        dayDropdown.selectByIndex(0);

        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "1";

        Assert.assertTrue(actualYear.equals(expectedYear), "Year selection did not pass");
        Assert.assertTrue(actualMonth.equals(expectedMonth));
        Assert.assertTrue(actualDay.equals(expectedDay));

        /// Assert.assertEquals(actualYear, expectedYear);

        for (WebElement eachYearDropdownOption : yearDropdown.getOptions()) {
            System.out.println(eachYearDropdownOption.getText());
        }
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }


}
