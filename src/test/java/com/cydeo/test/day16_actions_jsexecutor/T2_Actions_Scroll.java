package com.cydeo.test.day16_actions_jsexecutor;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T2_Actions_Scroll {

    @Test
    public void actions_scroll_rest(){

//    1- Open a chrome browser
//    2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get(ConfigurationReader.getProperty("practice.page.url"));

//    3- Scroll down to “Powered by CYDEO”
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

//    4- Scroll using Actions class “moveTo(element)” method
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(cydeoLink).perform();

//    1- Continue from where the Task 4 is left in the same test.
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
     //   actions.moveToElement(homeLink).perform(); first way to scroll up is to find an element and moveToElement

        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform(); // second way to use the method page up


//    2- Scroll back up to “Home” link using PageUP button


    }



}
