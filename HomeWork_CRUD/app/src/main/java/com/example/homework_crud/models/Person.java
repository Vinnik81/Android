package com.example.homework_crud.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Person implements Parcelable {
    public String fullName;
    public int age;
    public String phoneNumber;
    public String email;
    public String text;
    public int imageId;

    public Person() {
    }
    public Person(String fullName, int age, String phoneNumber, String email, String text ,int imageId) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.text = text;
        this.imageId = imageId;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {

    }
}
