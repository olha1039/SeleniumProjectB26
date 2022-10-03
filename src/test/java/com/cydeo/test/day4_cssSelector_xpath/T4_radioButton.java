package com.cydeo.test.day4_cssSelector_xpath;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T4_radioButton {
    public static void main(String[] args) {
//        1. Open Chrome browser
//        2. Go to https://practice.cydeo.com/radio_buttons

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

//        3. Click to “Hockey” radio button

        WebElement hockeyRadioBtn = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyRadioBtn.click();

//        4. Verify “Hockey” radio button is selected after clicking.

        System.out.println("hockeyRadioBtn.isSelected() = " + hockeyRadioBtn.isSelected());

//  Locate green button and verify if it is enabled
// green button is disabled, we are using isEnable method to see it is enabled;

        WebElement greenRadioBtn = driver.findElement(By.xpath("//input[@id='green']"));
        System.out.println("greenRadioBtn.isEnabled() = " + greenRadioBtn.isEnabled());

        driver.quit();
    }
}

