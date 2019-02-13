package com.zipcodewilmington.person;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name = "";
    private int age = Integer.MAX_VALUE;
    private Boolean isFemale = true;
    private Boolean hasFacialHair = false;
    private Double weight = 200.0;
    private String eyeColor = "Brown";
    private Boolean isAwesome = true;




    public Person() {


    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
       this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getFemale() {
        return isFemale;
    }

    public void setFemale(Boolean female) {
        isFemale = female;
    }

    public Boolean getHasFacialHair() {
        return hasFacialHair;
    }

    public void setHasFacialHair(Boolean hasFacialHair) {
        this.hasFacialHair = hasFacialHair;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Boolean getAwesome() {
        return isAwesome;
    }

    public void setAwesome(Boolean awesome) {
        isAwesome = awesome;
    }
}
