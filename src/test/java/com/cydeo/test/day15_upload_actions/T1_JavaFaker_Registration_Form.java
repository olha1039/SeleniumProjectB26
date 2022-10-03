package com.cydeo.test.day15_upload_actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_JavaFaker_Registration_Form {

    @Test
    public void registration_form_test(){
//    Note: Use JavaFaker OR read from configuration.properties file when possible.
//    1. Open browser
//    2. Go to website: https://practice.cydeo.com/registration_form

        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
        Faker faker = new Faker();

//    3. Enter first name
        WebElement firstName = Driver.getDriver().findElement(By.name("firstname"));
        firstName.sendKeys(faker.name().firstName());

//    4. Enter last name
        WebElement lastname = Driver.getDriver().findElement(By.name("lastname"));
        lastname.sendKeys(faker.name().lastName());
//    5. Enter username
        WebElement username = Driver.getDriver().findElement(By.name("username"));
        username.sendKeys(faker.bothify("????####"));
//    6. Enter email address
        WebElement email = Driver.getDriver().findElement(By.name("email"));
        email.sendKeys(faker.internet().emailAddress());

//    7. Enter password
        WebElement password = Driver.getDriver().findElement(By.name("password"));
        password.sendKeys(faker.internet().password());

//    8. Enter phone number
        WebElement phoneNumber = Driver.getDriver().findElement(By.name("phone"));
        phoneNumber.sendKeys(faker.numerify("###-###-####"));

//    9. Select a gender from radio buttons
        WebElement gender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        gender.click();

//    10.Enter date of birth
        Driver.getDriver().findElement(By.xpath("//input[@name='birthday']")).sendKeys(faker.numerify("0#/1#/19##"));

//    11.Select Department/Office
        Select office = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        office.selectByIndex(faker.number().numberBetween(1,9));
//    12.Select Job Title
        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(faker.number().numberBetween(1,7));

//    13.Select programming language from checkboxes
        WebElement language = Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        language.click();
//    14.Click to sign up button
        WebElement signUpBtn = Driver.getDriver().findElement(By.id("wooden_spoon"));
        signUpBtn.click();

//    15.Verify success message “You’ve successfully completed registration.” is displayed.




    }
}
