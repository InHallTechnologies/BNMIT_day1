package com.example.example1.Samples;

import java.util.ArrayList;
import java.util.List;

public class SampleUsers {

    public List<SampleUserClass> userClasses;

    public SampleUsers() {
        userClasses = new ArrayList<>();
        userClasses.add(new SampleUserClass("info@inhall.in", "1234567890"));
        userClasses.add(new SampleUserClass("rishabh@inhall.in", "0987654321"));
    }

    public List<SampleUserClass> getUserClasses() {
        return userClasses;
    }




}


