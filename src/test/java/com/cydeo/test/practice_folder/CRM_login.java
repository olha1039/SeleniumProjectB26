package com.cydeo.test.practice_folder;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRM_login {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://login2.nextbasecrm.com/");

        String expectedTitle = "Authorization";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed!");
        } else{
            System.out.println("Title verification failed!");
        }

        WebElement userNameBox = driver.findElement(By.name("USER_LOGIN"));
        userNameBox.sendKeys("helpdesk57@cybertekschool.com");


        WebElement passwordBox = driver.findElement(By.name("USER_PASSWORD"));
        passwordBox.sendKeys("UserUser");

        WebElement loginBtn = driver.findElement(By.className("login-btn"));
         loginBtn.click();


       driver.quit();


    }
}
