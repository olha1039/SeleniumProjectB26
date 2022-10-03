package com.cydeo.test.day7_testNG_dropdown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_StateDropdown {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
//        1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @Test
    public void stateDropdownTest() {

        Select stateDropdown = new Select(driver.findElement(By.id("state")));

//        3. Select Illinois with selectByValue()
        stateDropdown.selectByValue("IL");

//        4. Select Virginia with selectByVisibleText()
        stateDropdown.selectByVisibleText("Virginia");

//        5. Select California with selectByIndex()
        stateDropdown.selectByIndex(5);


//        6. Verify final selected option is California.
//        Use all Select options. (visible text, value, index)
        // getFirstSelectedOption will return to current selected option

        String actualStateOption = stateDropdown.getFirstSelectedOption().getText();
        String expectedStateOption = "California";

        Assert.assertEquals(actualStateOption, expectedStateOption, "Verification is failed!");

        // Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(), "California", "Verification is failed"); another way to write it, but first way is more preferred

        System.out.println();

//        1. Open Chrome browser done is before method
//        2. Go to https://practice.cydeo.com/dropdown  done in before method
//        3. Select all the options from multiple select dropdown.
//        4. Print out all selected values.
//        5. Deselect all values.
    }


        @Test
        public void multiSelectDropdownTest() {

        Select languages = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

            System.out.println("languages.isMultiple() = " + languages.isMultiple()); // checking if dropdown allows multiple selections

//          languages.selectByValue("java");
//          languages.selectByVisibleText("C#");
//          languages.selectByIndex(3);



          //  4. Print out all selected values.

       //     List<WebElement> allOptions = languages.getOptions(); just to show what is getOptions method;

            for(WebElement each : languages.getOptions()){ // getOptions are list of web elements
                each.click();
                System.out.println("each.getText() = " + each.getText());
            }


            languages.deselectAll();




        }





}
