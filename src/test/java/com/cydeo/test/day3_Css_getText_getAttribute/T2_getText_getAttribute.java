package com.cydeo.test.day3_Css_getText_getAttribute;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

//        TC #5: getText() and getAttribute() method practice
//        1- Open a chrome browser

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        2- Go to: https://practice.cydeo.com/registration_form

        driver.get("https://practice.cydeo.com/registration_form");

//        3- Verify header text is as expected:
//        Expected: Registration form

        //using cssSelector to go from parent to child
       // WebElement headerText = driver.findElement(By.cssSelector("div[class='page-header']>h2"));


        //locate headerText to get text between opening and closing tag
        WebElement headerText = driver.findElement(By.tagName("h2"));

        String expectedHeader = "Registration form";
        String actualHeader = headerText.getText(); // got from web element above

        System.out.println(actualHeader.equals(expectedHeader) ? "Header text verification passed" : "Header text verification failed");


//        4- Locate “First name” input box

        WebElement firstNameInput = driver.findElement(By.className("form-control"));

//        5- Verify placeholder attribute’s value is as expected:
//        Expected: first name

        String expectedPlaceHolder = "first name";

        // getAttribute() method is helping us to get value of attributes
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");

        System.out.println(actualHeader.equals(expectedHeader) ? "Placeholder text verification passed" : "Placeholder text verification failed");

        driver.quit();
    }
}
