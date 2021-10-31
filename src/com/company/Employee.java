package com.company;

public class Employee {

    private int id;
    private int age;
    private String gender;
    private double salary;
    private String name;
    private String phoneNumber;
    private String jobTitle;



    public Employee(String name, String phoneNumber, int id, int age, double salary, String gender, String jobTitle) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.jobTitle = jobTitle;
    }

    public String toString() {

        return "ID: " + id + " , Name: " + name + " , Phone Number: " + phoneNumber + " , Age: " + age + " , Salary: " + salary + " , Gender: " + gender + " Profesion: " + jobTitle;
    }

    public void showWorkTasks(){}

    public void calculateBonus(){}

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
