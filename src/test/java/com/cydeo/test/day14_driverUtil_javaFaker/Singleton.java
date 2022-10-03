package com.cydeo.test.day14_driverUtil_javaFaker;

public class Singleton {

    // fist rule of singleton, create private constructor

    private Singleton(){
    }

    // this is referencing for null, no value assigned
    private static String word;

   public static String getWord(){
      if(word == null){
          System.out.println("First time calling. Word object is null. Now we are assigning the value");
          word = "something";
      } else {
          System.out.println("Word is already assigned and has a value");
      }
      return word;
    }



}
