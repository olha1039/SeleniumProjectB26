package com.cydeo.practice_tests;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecuter extends TestBase {

    @Test
    public void scrollingTest(){
        driver.get("https://practice.cydeo.com/");

        WebElement cydeoLink = driver.findElement(By.linkText("CYDEO"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);" + "arguments[0].click()",cydeoLink);

    }
}
