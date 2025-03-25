package com.unimelb.swen30006.workshops;

import java.util.Date;

public abstract class Person {
    private String address;
    private final Date dob;
    private String name;

    public Person(String address, Date dob, String name) {
        this.address = address;
        this.dob = dob;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
