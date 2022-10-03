package com.cydeo.practice_tests;

import com.cydeo.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Selenium extends TestBase {

//    WebDriver driver;
//
//    @BeforeMethod
//    public void setup(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }
//
//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }


    @Test
    public void googleTitle(){
        driver.get("https://google.com");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "Google title is not matching!");
    }
}
