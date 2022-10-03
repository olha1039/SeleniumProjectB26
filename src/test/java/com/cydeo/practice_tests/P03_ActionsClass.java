package com.cydeo.practice_tests;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class P03_ActionsClass extends TestBase {

    @Test
    public void dragAndDropTest(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement smallCircle = driver.findElement(By.id("draggable"));

        WebElement bigCircle = driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);
       // actions.dragAndDrop(smallCircle, bigCircle).perform();
        actions.moveToElement(smallCircle).pause(1000).clickAndHold().pause(1000)
                .moveToElement(bigCircle).pause(1000)
                .release().perform();

        assertEquals(bigCircle.getText(), "You did great!");
    }

    @Test
    public void hoverTest(){
       driver.get("https://practice.cydeo.com/hovers");
       WebElement img1 = driver.findElement(By.xpath("(//img)[1]"));
       WebElement img1Text = driver.findElement(By.xpath("//h5[text() = 'name: user1']"));

       Actions actions = new Actions(driver);

       actions.moveToElement(img1).perform();
       assertTrue(img1Text.isDisplayed());

        List <WebElement> images = driver.findElements(By.tagName("img"));

        for(WebElement image : images){
            actions.moveToElement(image).pause(1000).perform();
        }
    }
}
