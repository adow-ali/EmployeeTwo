package com.adow;

public abstract class EmployeeReport implements EmpUtil {

    public abstract void displayEmplyeeData();

    public void displayHeading() {

        System.out.println("ABC Engineering");

    }
}
