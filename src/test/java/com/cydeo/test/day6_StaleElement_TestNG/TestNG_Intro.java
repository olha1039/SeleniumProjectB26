package com.cydeo.test.day6_StaleElement_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setUp(){
        System.out.println("Before class is running...");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("Before class is running...");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running...");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After Method is running...");
    }


    @Test (priority = 2)
    public void test1(){
        System.out.println("Test1 is running...");
        String actual = "apple";
        String expected = "applee";
        Assert.assertEquals(actual,expected, "Test1 did not pass!");

    }

    @Test (priority = 1, dependsOnMethods = "test1") // depends on test1 name, if one fail the second will not even run
    public void test2(){
        System.out.println("Test2 is running...");
        Assert.assertEquals("orange","orange", "Test2 didn't pass");
    }
}
