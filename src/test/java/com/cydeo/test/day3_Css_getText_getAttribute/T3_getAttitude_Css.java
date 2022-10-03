package com.cydeo.test.day3_Css_getText_getAttribute;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttitude_Css {
    public static void main(String[] args) {

//        TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        2- Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");

//        3- Verify “Log in” button text is as expected:
//        Expected: Log In

        // located using type attribute
       // WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));

        // located using value attribute
        // WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        // located using class attribute
        WebElement loginButton = driver.findElement(By.cssSelector("input[class='login-btn']"));

        String expectedBtnText = "Log In";
        String actualBtnText = loginButton.getAttribute("value");
        System.out.println("actualBtnText = " + actualBtnText);

        System.out.println(actualBtnText.equals(expectedBtnText) ? "Log In button text verification passed!" : "Log In button text verification failed!");

        driver.quit();

    }
}
