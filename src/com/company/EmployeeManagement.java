package com.company;

import java.util.ArrayList;

import static com.company.UI.sc;

public class EmployeeManagement {

    static ArrayList<Employee> employeeArray_hospital = new ArrayList<>();


    public static void loadDB() {

        Doctor p1 = new Doctor("Johan", "0762775900", 1, 27, 15700, "Man", "Doctor", 50);
        Doctor p2 = new Doctor("Erik", "0708998877", 2, 44, 55200, "Man", "Doctor", 40);
        Janitor p3 = new Janitor("Markus", "0732878899", 3, 42, 34200, "Man", "Janitor", 300);
        Nurse p4 = new Nurse("Lisa", "0888991289", 4, 33, 23000, "Woman", "Nurse", 150);
        Nurse p5 = new Nurse("Sara", "0763445675", 5, 64, 55900, "Woman", "Nurse", 400);
        Janitor p6 = new Janitor("Alfred", "0109983769", 6, 42, 42000, "Man", "Janitor", 700);
        Secretary p7 = new Secretary("Amanda", "02018892309", 7, 22, 16900, "Woman", "Secretary", 200);
        Doctor p8 = new Doctor("Lina", "0708839478", 8, 32, 33900, "Woman", "Doctor", 77);
        Doctor p9 = new Doctor("Peter", "0897736298", 9, 25, 59000, "Man", "Doctor", 55);

        employeeArray_hospital.add(p1);
        employeeArray_hospital.add(p2);
        employeeArray_hospital.add(p3);
        employeeArray_hospital.add(p4);
        employeeArray_hospital.add(p5);
        employeeArray_hospital.add(p6);
        employeeArray_hospital.add(p7);
        employeeArray_hospital.add(p8);
        employeeArray_hospital.add(p9);



    }
    public static void showTasks(){
        System.out.println("ID of Employee: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < employeeArray_hospital.size(); i++) {
            if (employeeArray_hospital.get(i).getId() == id){
                System.out.println("Employee with the ID number " + employeeArray_hospital.get(i).getId() + " is a " + employeeArray_hospital.get(i).getJobTitle());
                employeeArray_hospital.get(i).showWorkTasks();
            }
        }

    }

    public static void showBonus(){
        System.out.println("ID of Employee: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < employeeArray_hospital.size(); i++) {
            if (employeeArray_hospital.get(i).getId() == id){
                System.out.print("Employee with the ID number " + employeeArray_hospital.get(i).getId() + " is a " + employeeArray_hospital.get(i).getJobTitle() + ".");
                employeeArray_hospital.get(i).calculateBonus();
            }
        }
    }

    public static void addPerson() {

        boolean loop = true;

        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.println("Gender: ");
        String gender = sc.nextLine();

        while(loop) {

            System.out.println("Profession: \n (1.Doctor, 2.Nurse, 3.Janitor, 4.Secretary)");
            int profession = sc.nextInt();
            String jobTitle;

            if (profession == 1) {
                jobTitle = "Doctor";

                System.out.println("Number of Successful Operations: ");
                int numberOfSuccessfulOperations = sc.nextInt();
                sc.nextLine();

                Doctor p = new Doctor(name, phoneNumber, id, age, salary, gender, jobTitle, numberOfSuccessfulOperations);
                employeeArray_hospital.add(p);
                loop = false;
            } else if (profession == 2) {
                jobTitle = "Nurse";

                System.out.println("Number of Medications Given: ");
                int numberOfMedicationsGiven = sc.nextInt();
                sc.nextLine();

                Nurse p = new Nurse(name, phoneNumber, id, age, salary, gender, jobTitle, numberOfMedicationsGiven);
                employeeArray_hospital.add(p);
                loop = false;
            } else if (profession == 3) {
                jobTitle = "Janitor";

                System.out.println("Number of Toilets Cleaned: ");
                int numberOfCleanToilets = sc.nextInt();
                sc.nextLine();

                Janitor p = new Janitor(name, phoneNumber, id, age, salary, gender, jobTitle, numberOfCleanToilets);
                employeeArray_hospital.add(p);
                loop = false;
            } else if (profession == 4) {
                jobTitle = "Secretary";

                System.out.println("Number of Booked Appointments: ");
                int numberOfBookedAppointments = sc.nextInt();
                sc.nextLine();

                Secretary p = new Secretary(name, phoneNumber, id, age, salary, gender, jobTitle, numberOfBookedAppointments);
                employeeArray_hospital.add(p);
                loop = false;
            } else {
                System.out.println("Please Enter a Valid Profession");
            }

        }

    }

    public static void showPersonById() {

        System.out.println("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < employeeArray_hospital.size(); i++) {

            if (employeeArray_hospital.get(i).getId() == id) {
                System.out.println(employeeArray_hospital.get(i));
            }
        }
    }


    public static void showPersonByName() {

        System.out.println("Name: ");
        String name = sc.nextLine();

        for (int i = 0; i < employeeArray_hospital.size(); i++) {
            if (employeeArray_hospital.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println(employeeArray_hospital.get(i));
            }
        }

    }

    public static void showAllPersons() {

        for (int i = 0; i < employeeArray_hospital.size(); i++) {

            System.out.println(employeeArray_hospital.get(i));
        }
    }

    public static void updateName() {
        System.out.println("Select ID to change name: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < employeeArray_hospital.size(); i++) {
            if (employeeArray_hospital.get(i).getId() == id) {
                System.out.println("Enter New Name: ");
                String newName = sc.nextLine();
                employeeArray_hospital.get(i).setName(newName);
            }
        }
    }

    public static void updatePhoneNumber() {
        System.out.println("Select ID To Change Phone Number: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < employeeArray_hospital.size(); i++) {
            if (employeeArray_hospital.get(i).getId() == id) {
                System.out.println("Enter New Phone Number: ");
                String newNumber = sc.nextLine();
                employeeArray_hospital.get(i).setPhoneNumber(newNumber);
            }
        }
    }

    public static void removePerson() {
        System.out.println("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < employeeArray_hospital.size(); i++) {
            if (employeeArray_hospital.get(i).getId() == id) {
                employeeArray_hospital.remove(i);
            }
        }

    }

    //////////////////////////
    // Statistics Methods
    //////////////////////////

    public static void showAverageSalary() {

        double salarySum = 0;

        for (int i = 0; i < employeeArray_hospital.size(); i++) {

            salarySum += employeeArray_hospital.get(i).getSalary();
        }

        double salaryAverage = salarySum / employeeArray_hospital.size();

        System.out.println(" The average salary is " + Math.round(salaryAverage) +"\n");

    }

    public static void showAverageAge() {

        int ageSum = 0;

        for (int i = 0; i < employeeArray_hospital.size(); i++) {

            ageSum += employeeArray_hospital.get(i).getAge();
        }

        int ageAverage = ageSum / employeeArray_hospital.size();

        System.out.println(" The average age is " + ageAverage +"\n");

    }

    public static void showGenderPercentage() {

        int numberMen = 0;
        int numberWomen = 0;

        for (int i = 0; i < employeeArray_hospital.size(); i++) {

            if (employeeArray_hospital.get(i).getGender().equalsIgnoreCase("Man")) {
                numberMen++;
            } else if (employeeArray_hospital.get(i).getGender().equalsIgnoreCase("Woman")) {
                numberWomen++;
            }
        }

        double numberTotal = numberMen + numberWomen;

        System.out.println("There are " + numberMen + " men working in the company and " + numberWomen + " women.");
        System.out.println(Math.round(numberMen / numberTotal * 100) + "% of the workers are men and " + Math.round(numberWomen / numberTotal * 100 ) + "% are women" +"\n");
    }

    public static void showAverageSalaryByProfession(){

        int numberDoctor = 0;
        double salaryDoctor = 0;
        int numberNurse = 0;
        double salaryNurse = 0;
        int numberJanitor = 0;
        double salaryJanitor = 0;
        int numberSecretary = 0;
        double salarySecretary = 0;

        for (Employee e:employeeArray_hospital) {
            if (e instanceof Doctor){
                numberDoctor++;
                salaryDoctor+= e.getSalary();
            }
            else if (e instanceof Nurse){
                numberNurse++;
                salaryNurse+= e.getSalary();
            }
            else if (e instanceof Janitor){
                numberJanitor++;
                salaryJanitor+= e.getSalary();
            }
            else if (e instanceof Secretary){
                numberSecretary++;
                salarySecretary+= e.getSalary();
            }
        }


        System.out.println("Average salary of a doctor is " + salaryDoctor/numberDoctor);
        System.out.println("Average salary of a nurse is " + salaryNurse/numberNurse);
        System.out.println("Average salary of a janitor is " + salaryJanitor/numberJanitor);
        System.out.println("Average salary of a secretary is " + salarySecretary/numberSecretary +"\n");
    }

    ////////////////////////////
    //Sorting Methods///////////
    ////////////////////////////

    public static void sortByNameAlphabetically(){
        employeeArray_hospital.sort( new SortByNameAlphabetically() );

        for ( Employee e: employeeArray_hospital) {
            System.out.println(e);
        }

    }
    public static void sortByNameReverse(){
        employeeArray_hospital.sort( new SortByNameReverse() );

        for ( Employee e: employeeArray_hospital) {
            System.out.println(e);
        }

    }

    public static void sortBySalary(){
        employeeArray_hospital.sort( new SortBySalary() );

        for ( Employee e: employeeArray_hospital) {
            System.out.println(e);
        }
    }

    public static void sortBySalaryReverse(){
        employeeArray_hospital.sort( new SortBySalaryReverse() );

        for ( Employee e: employeeArray_hospital) {
            System.out.println(e);
        }

    }

}


