package com.cydeo.test.day11_webtables_utilities;

import com.cydeo.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class T1_Multiple_Windows extends TestBase {

//    TC #2: Window Handle practice


    @Test
    public void windowsHandleTest(){

        //2. Goto:https://www.amazon.com/

        driver.get("https://www.amazon.com/");

        //3. Copy paste the lines from below into your class

        //_blank will opr=en url in new tab/window
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

        //4. Create a logic to switch to the tab where Etsy.com is open

        Set<String> allWindowsHandles = driver.getWindowHandles();
        for (String eachWindow : allWindowsHandles) {
            driver.switchTo().window(eachWindow); // will switch each window and driver will see each window
            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains("etsy")){
                break;
            }
        }
        //5. Assert:Title contains “Etsy”

        String actualTitle = driver.getTitle();
        String expectedTitle = "Etsy";
        Assert.assertTrue(actualTitle.contains(expectedTitle), "Title verification failed!");

      //  BrowserUtils.verifyTitle(driver, "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");
       // BrowserUtils.switchWindowAndVerify(driver, "amazon", "Amazon"); came from utilities class to handle it dynamically
    }










}
