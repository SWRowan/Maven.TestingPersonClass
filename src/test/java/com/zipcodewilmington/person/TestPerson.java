package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        Double expectedWeight = 200.0;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Boolean actualSex = person.getFemale();
        Boolean actualFacialHair = person.getHasFacialHair();
        Double actualWeight = person.getWeight();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertTrue(actualSex);
        Assert.assertFalse(actualFacialHair);
        Assert.assertEquals(expectedWeight, actualWeight);

    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIsFemaleTest(){
        //Given
        Person person = new Person();


        //When
        Boolean actual = person.getFemale();

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void setIsFemaleTest(){
        //Given
        Person person = new Person();
        person.setFemale(false);

        //When
        Boolean actual = person.getFemale();

        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void getFacialHairTest(){
        //Given
        Person person = new Person();

        //When
        Boolean actual = person.getHasFacialHair();

        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void setFacialHairTest(){
        //Given
        Person person = new Person();
        person.setHasFacialHair(true);

        //When
        Boolean actual = person.getHasFacialHair();

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void getWeightTest(){
        //Given
        Person person = new Person();
        Double expected = 200.0;

        //When
        Double actual = person.getWeight();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setWeightTest(){
        //Given
        Person person = new Person();
        person.setWeight(255.8);
        Double expected = 255.8;

        //When
        Double actual = person.getWeight();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEyeColorTest(){
        //Given
        Person person = new Person();
        String expected = "Brown";

        //When
        String actual = person.getEyeColor();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setEyeColorTest(){
        //Given
        Person person = new Person();
        person.setEyeColor("Blue");
        String expected = "Blue";
        //When
        String actual = person.getEyeColor();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIsAwesomeTest(){
        //Given
        Person person = new Person();
        //When
        Boolean actual = person.getAwesome();
        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void setIsAwesomeTest(){
        //Given
        Person person = new Person();
        person.setAwesome(false);
        //When
        Boolean actual = person.getAwesome();
        //Then
        Assert.assertFalse(actual);
    }
}
