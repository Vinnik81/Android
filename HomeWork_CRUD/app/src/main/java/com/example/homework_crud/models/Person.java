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


    protected Person(Parcel in) {
        fullName = in.readString();
        age = in.readInt();
        phoneNumber = in.readString();
        email = in.readString();
        text = in.readString();
        imageId = in.readInt();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

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

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(fullName);
        dest.writeInt(age);
        dest.writeString(phoneNumber);
        dest.writeString(email);
        dest.writeString(text);
        dest.writeInt(imageId);
    }
}
