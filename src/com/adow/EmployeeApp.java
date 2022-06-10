package com.adow;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee myEmpOne = new Employee(99, "Adow", 45000);
        myEmpOne.displayEmplyeeData();
        myEmpOne.deleteEmployee();
        myEmpOne.updateEmployee();

        Employee myEmpTwo = new Employee(100, "Ali", 50000);
        myEmpTwo.displayEmplyeeData();
        myEmpTwo.deleteEmployee();
        myEmpTwo.updateEmployee();

        myEmpOne.displayHeading();
        myEmpTwo.displayHeading();

    }
}
