package com.cydeo.practice_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertTrue;

public class P02_Hard_Soft_Assertion {

    @Test
    public void  hardAssertion(){
        Assert.assertEquals("apple", "app"); // dont have to create an object, see below soft assertion
        System.out.println("After Assertion failed");
        assertTrue("orange".equals("oranger"));
        System.out.println("After Assertion failed");
    }

    @Test
    public void softAssertion(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("apple", "app");
        System.out.println("After Assertion failed");
        softAssert.assertTrue("orange".equals("oranger"));
        System.out.println("After Assertion failed");

        softAssert.assertAll();
    }


}
