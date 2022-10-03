package com.cydeo.practice_tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class FakerPractice {

    @Test
    public void fakerTest(){
        // whenever you need fake test data for you testing you can use faker class
        Faker faker = new Faker();

        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.address().streetAddress() = " + faker.address().streetAddress());
        System.out.println("faker.address().cityName() = " + faker.address().cityName());
        System.out.println("faker.address().state() = " + faker.address().state());
        System.out.println("faker.address().zipCode() = " + faker.address().zipCode());

        System.out.println("faker.number().numberBetween(10000, 90000) = " + faker.number().numberBetween(10000, 90000));
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));

        System.out.println("faker.letterify(\"??????\") = " + faker.letterify("??????"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());

        System.out.println("faker.harryPotter().spell() = " + faker.harryPotter().spell());
        System.out.println("faker.harryPotter().house() = " + faker.harryPotter().house());
        System.out.println("faker.harryPotter().quote() = " + faker.harryPotter().quote());
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
        System.out.println("faker.finance().creditCard().replaceAll(\"-\", \"\") = " + faker.finance().creditCard().replaceAll("-", ""));
        System.out.println("faker.bothify(\"##??##?#?#?#-###\") = " + faker.bothify("##??##?#?#?#-###"));
        System.out.println("faker.chuckNorris().fact().replaceAll(\"Chuck Norris\", \"Olha\") = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Olha"));
    }



}
