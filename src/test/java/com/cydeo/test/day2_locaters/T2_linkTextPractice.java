package com.cydeo.test.day2_locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_linkTextPractice {
    public static void main(String[] args) throws InterruptedException {
//        1- Open a Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2- Go to: https://practice.cydeo.com/

        driver.get("https://practice.cydeo.com/");

//        3- Click to A/B Testing from top of the list.

        Thread.sleep(2000);
        WebElement abLinkText = driver.findElement(By.linkText("A/B Testing"));
        abLinkText.click();

//        4- Verify title is:
//        Expected: No A/B Test

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        System.out.println(actualTitle.equals(expectedTitle) ? "No A/B Test Title verification passed!" : "No A/B Test Title verification failed!");

//        5- Go back to home page by using the .back();
    Thread.sleep(2000);
    driver.navigate().back();

//        6- Verify title equals:
//        Expected: Practice

        expectedTitle = "Practice";
        actualTitle = driver.getTitle();
        System.out.println(actualTitle.equals(expectedTitle) ? "Title verification passed!" : "Title verification failed!");

        driver.quit();
    }
}
