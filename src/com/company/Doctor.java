package com.company;

public class Doctor extends Employee {

    private int numberOfSuccessfulOperations;

    public Doctor(String name, String phoneNumber, int id, int age, double salary, String gender, String jobTitle, int numberOfSuccessfulOperations) {
        super(name, phoneNumber, id, age, salary, gender, jobTitle);
        this.numberOfSuccessfulOperations = numberOfSuccessfulOperations;
    }

    public String toString(){
        return super.toString() + ", Number of successful operations: " + numberOfSuccessfulOperations;
    }

    public void showWorkTasks(){
        System.out.println("The Doctor treats the patients");
    }


    public void calculateBonus(){
        double bonus = 500 * numberOfSuccessfulOperations;
        System.out.println(" And has a bonus of " + bonus + " from having performed " + numberOfSuccessfulOperations + " successful operations.");

    }
}
