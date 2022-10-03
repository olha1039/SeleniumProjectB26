package com.cydeo.test.day10_utilities_windows;

import com.cydeo.base.TestBase;
import com.cydeo.test.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Iframe_CRM_AppreciationTest extends TestBase {


    @Test
    public void sendingAppreciationMsg(){

//        2- Go to: https://login2.nextbasecrm.com/
        driver.get("https://login2.nextbasecrm.com/");

//        3- Login Homepage ( Login with valid username and password)
       // CRM_Utilities.crm_login(driver); logging in with driver same username and password from crm utilities
        CRM_Utilities.crm_login(driver, "hr1@cydeo.com", "UserUser"); // entering username and password

//        4- Click the MORE tab and select APPRECIATION

        WebElement moreBtn = driver.findElement(By.cssSelector("span[id*='link-text']")); //xpath "//span[contains(@id,'link-text-)]"
        moreBtn.click();

//        5- Write an Appreciation message

        WebElement appreciation = driver.findElement(By.xpath("//span[.='Appreciation']"));
        appreciation.click();

//        6- Click the SEND button

        driver.switchTo().frame(driver.findElement(By.cssSelector(".bx-editor-iframe")));
        driver.findElement(By.tagName("body")).sendKeys("Hello from the other side!");

        // if you have nested frame going one frame up will be parent frame, otherwise default is main html frame

        driver.switchTo().defaultContent();
        WebElement sendBtn = driver.findElement(By.id("blog-submit-button-save"));
        sendBtn.click();

//        7- Verify the Appreciation message is displayed on the feed

        WebElement feedText = driver.findElement(By.xpath("//div[starts-with(@id, 'blog_post_body')]"));
        String actualText = feedText.getText();
        String expectedText = "Hello from the other side!";
        Assert.assertEquals(actualText,expectedText,"Feed message did not appear correctly!");




    }



}
