package com.cydeo.test.day13_configuration_reader;

import com.cydeo.base.TestBase;
import com.cydeo.test.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_Config_Practice extends TestBase {

//    T1_Config_Practice
//1. Create new test and make set ups
//2. Go to : https://login1.nextbasecrm.com/
//            3. Enter valid username
//4. Enter valid password
//5. Click to Log In button
//6. Verify title is as expected:
//    Expected: Portal

    @Test
    public void login_crm_app(){

       // driver.get("https://login1.nextbasecrm.com/");
        driver.get(ConfigurationReader.getProperty("env")); // using configuration property


        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
       // inputUsername.sendKeys("helpdesk1@cybertekschool.com");
        inputUsername.sendKeys(ConfigurationReader.getProperty("username")); // using configuration property

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
      //  inputPassword.sendKeys("UserUser");
        inputPassword.sendKeys(ConfigurationReader.getProperty("password")); // using configuration property

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

      //  BrowserUtils.verifyTitle(driver,"(1) Portal");


    }


}
