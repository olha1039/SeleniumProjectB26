package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigations {
    public static void main(String[] args) throws InterruptedException {

        // 1 - Setting up WebDriver Manager
        WebDriverManager.chromedriver().setup();

        // 2 - Create instance of WebDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com");

        // 3 Make our page full screen

        Thread.sleep(3000);
        driver.manage().window().maximize();

       // driver.navigate().to("https://www.etsy.com"); same thing as above, navigating to the web page

        Thread.sleep(3000); // giving us time to see what's happening on web page

        driver.navigate().back(); // navigate().back() method is for navigating back from Web page

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh(); // method is for refreshing the page

        System.out.println("Etsy page driver.getTitle() = " + driver.getTitle()); // need a println to see title

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.get("https://www.tesla.com");

        System.out.println("Tesla page driver.getTitle() = " + driver.getTitle());

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());


        // driver.close(); // this will close the currently opened page

        driver.quit(); // this will close all of the tabs/pages
    }
}
