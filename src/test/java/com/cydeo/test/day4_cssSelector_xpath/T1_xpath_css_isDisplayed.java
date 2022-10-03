package com.cydeo.test.day4_cssSelector_xpath;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_css_isDisplayed {

    public static void main(String[] args) {
//        TC #1: XPATH and cssSelector Practices
//        1. Open Chrome browser

       WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        2. Go to https://practice.cydeo.com/forgot_password

        driver.get("https://practice.cydeo.com/forgot_password");

//        3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
//        a. “Home” link

        // locate Home link with cssSelector class value
        WebElement homeLink1 = driver.findElement(By.cssSelector("a[class='nav-link'"));

        // locate Home link with cssSelector hrf value
        WebElement homeLink2 = driver.findElement(By.cssSelector("a[href='/']"));

        // locate Home link with cssSelector class value, syntax 2
        WebElement homeLink3 = driver.findElement(By.cssSelector("a.nav-link"));

     // locate Home link with xPath with text element
     WebElement homeLink4 = driver.findElement(By.xpath("//a[.='Home']")); //xpath(text()='Home')

     // locate Home link with xPath
     WebElement homeLink5 = driver.findElement(By.xpath("//a[@class='nav-link']"));

//        b. “Forgot password” header

        // locate forgotPassword using cssSelector from parent to child with ">"
        WebElement forgotPassword1 = driver.findElement(By.cssSelector("div[class='example']>h2"));

        // locate forgotPassword using cssSelector from parent to child with ">", syntax 2
        WebElement forgotPassword2 = driver.findElement(By.cssSelector("div.example>h2"));

     // locate forgotPassword using xpath
     WebElement forgotPassword3 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

//       c. "E-mail" text

        WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));

        // Locate Email text using xpath
     WebElement emailText2 = driver.findElement(By.xpath("//label[@for='email']"));

//        d. E-mail input box

        WebElement emailBox = driver.findElement(By.cssSelector("input[name='email']"));

        WebElement emailBox2 = driver.findElement(By.xpath("//input[@name='email']"));

//        e. “Retrieve password” button

        WebElement retrievePassword = driver.findElement(By.cssSelector("button#form_submit"));

//        f. “Powered by Cydeo text

        WebElement poweredByCydeo = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

//        4. Verify all web elements are displayed.

        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("forgotPassword2.isDisplayed() = " + forgotPassword2.isDisplayed());
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
        System.out.println("emailBox.isDisplayed() = " + emailBox.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("poweredByCydeo.isDisplayed() = " + poweredByCydeo.isDisplayed());

    }
}
