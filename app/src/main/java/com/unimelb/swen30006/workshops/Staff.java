package com.unimelb.swen30006.workshops;


import java.util.Date;

public class Staff extends Person{
    private String[] roles;
    private final String staffID;

    public Staff(String address, Date dob, String name, String staffID, String[] roles) {
        super(address, dob, name);
        this.staffID = staffID;
        this.roles = roles;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String getStaffID() {
        return staffID;
    }
}
