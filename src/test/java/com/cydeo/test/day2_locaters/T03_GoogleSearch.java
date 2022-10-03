package com.cydeo.test.day2_locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T03_GoogleSearch {
    public static void main(String[] args) {

//        1- Open a Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2- Go to: https://google.com/

        driver.get("https://google.com/");

//        3- Write “apple” in search box
//        4- Click google search button

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple" + Keys.ENTER); // sendKeys puts words to the search and keys helps to click enter


//        5- Verify title:
//        Expected: Title should start with “apple” word

        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();

        System.out.println(actualTitle.startsWith(expectedTitle) ? "Title verification passed!" : "Title verification failed!");

        driver.quit();

    }
}
