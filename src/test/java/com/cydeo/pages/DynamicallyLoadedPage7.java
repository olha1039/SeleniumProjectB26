package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicallyLoadedPage7 {

    public DynamicallyLoadedPage7() {
//    1. Go to https://practice.cydeo.com/dynamic_loading/7
//            2. Wait until title is “Dynamic title”
//            3. Assert: Message “Done” is displayed.
//            4. Assert: Image is displayed.

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath="//strong[.='Done!']")
    public WebElement doneMsg;

    @FindBy (xpath="//img")
    public WebElement image;

}