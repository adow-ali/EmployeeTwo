package com.adow;

public class Employee extends EmployeeReport implements EmpUtil {
    //Declaring variables
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // constructor builds the object
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;


    }

    @Override
    public void displayEmplyeeData() {
        System.out.println(" Employee Name: " + this.getName() + " Employee ID: " + this.getId() + " Employee Salary: " + this.getSalary());

    }

    @Override
    public void displayHeading() {
        super.displayHeading();
    }

    @Override
    public void updateEmployee() {

    }

    @Override
    public void deleteEmployee() {

    }
}
