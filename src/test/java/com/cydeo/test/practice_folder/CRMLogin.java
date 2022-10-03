package com.cydeo.test.practice_folder;

import com.cydeo.base.TestBase;
import com.cydeo.test.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CRMLogin extends TestBase {



    public void crm_login(){

        driver.get(ConfigurationReader.getProperty("env"));

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(ConfigurationReader.getProperty("username"));

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();
    }
}
