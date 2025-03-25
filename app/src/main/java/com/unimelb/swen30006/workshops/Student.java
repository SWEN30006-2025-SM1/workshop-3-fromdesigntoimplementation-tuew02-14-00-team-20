package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Student extends Person{
    private String email;
    private final String studentID;

    public Student(String address, Date dob, String name, String studentID, String email) {
        super(address, dob, name);
        this.studentID = studentID;
        this.email = email;
    }

    public void sendEmailMSG(String msg) {
        /* No Implementation yet */
    }

    public float totalGrade() {
        /* No Implementation yet */
        return 0;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentID() {
        return studentID;
    }
}
