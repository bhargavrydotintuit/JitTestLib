package com.bb.jittestlib;

public class MyTestModel {

    String Name,Number,Email,Password;

    public MyTestModel() {
    }

    public MyTestModel(String name, String number, String email, String password) {
        Name = name;
        Number = number;
        Email = email;
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
