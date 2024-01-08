package com.example.adapters.models;

public class Person {
    public String fullName;
    public int age;
    public int imageId;

    public Person(String fullName, int age, int imageId) {
        this.fullName = fullName;
        this.age = age;
        this.imageId = imageId;
    }

    public Person() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
