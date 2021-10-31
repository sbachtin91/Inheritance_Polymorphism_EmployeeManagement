package com.company;

public class Secretary extends Employee {

    private int numberOfBookedAppointments;

    public Secretary(String name, String phoneNumber, int id, int age, double salary, String gender, String jobTitle, int numberOfBookedAppointments) {
        super(name, phoneNumber, id, age, salary, gender, jobTitle);
        this.numberOfBookedAppointments = numberOfBookedAppointments;
    }

    public String toString(){
        return super.toString() + ", Number of booked appointments: " + numberOfBookedAppointments;
    }
    public void showWorkTasks(){
        System.out.println("The Secretary books appointments");
    }

    public void calculateBonus(){
        double bonus = 10 * numberOfBookedAppointments;
        System.out.println(" And has a bonus of " + bonus + " from having booked " + numberOfBookedAppointments + " appointments.");
    }
}
