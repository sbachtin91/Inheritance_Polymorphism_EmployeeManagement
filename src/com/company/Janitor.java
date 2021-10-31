package com.company;

public class Janitor extends Employee{

    private int numberOfCleanToilets;

    public Janitor(String name, String phoneNumber, int id, int age, double salary, String gender, String jobTitle, int numberOfCleanToilets) {
        super(name, phoneNumber, id, age, salary, gender, jobTitle);
        this.numberOfCleanToilets = numberOfCleanToilets;
    }

    public String toString(){
        return super.toString() + ", Number of cleaned toilets: " + numberOfCleanToilets;
    }

    public void showWorkTasks(){
        System.out.println("The Janitor cleans the hospital");
    }


    public void calculateBonus(){
        double bonus = 5 * numberOfCleanToilets;
        System.out.println(" And has a bonus of " + bonus + " from having cleaned " + numberOfCleanToilets + " toilets.");
    }
}
