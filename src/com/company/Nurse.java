package com.company;

public class Nurse extends Employee {

    private int numberOfMedicationsGiven;

    public Nurse(String name, String phoneNumber, int id, int age, double salary, String gender, String jobTitle, int numberOfMedicationsGiven) {
        super(name, phoneNumber, id, age, salary, gender, jobTitle);
        this.numberOfMedicationsGiven = numberOfMedicationsGiven;
    }

    public String toString(){
        return super.toString() + ", Number of administered medications: " + numberOfMedicationsGiven;
    }

    public void showWorkTasks(){
        System.out.println("The Nurse helps the doctor treat patients");
    }

    public void calculateBonus(){
        double bonus = 10 * numberOfMedicationsGiven;
        System.out.println(" And has a bonus of " + bonus + " from having administered " + numberOfMedicationsGiven + " medications.");
    }
}
