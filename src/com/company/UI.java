package com.company;

import java.util.Scanner;

import static com.company.EmployeeManagement.*;

public class UI {

    static boolean secondLoop = true;

    public static Scanner sc = new Scanner(System.in);

    public static void runUI() {

        boolean loop = true;

        while (loop) {

            secondLoop = true;

            int choice = firstMenu();

            if (choice == 1) {

                while (secondLoop) {

                    int secondChoice = showManagementMenu();
                    runManagementProgram(secondChoice);
                }

            } else if (choice == 2) {
                while (secondLoop){

                    int secondChoice = showStatisticsMenu();
                    runStatisticsProgram(secondChoice);
                }

            } else if (choice == 3){
                while (secondLoop){
                    int secondChoice = showSortingMenu();
                    runSortingProgram(secondChoice);
                }
            }

            else if (choice == 0) {
                loop = false;

            } else {
                System.out.println("Not a valid option, try again!");
            }

        }
        System.out.println("Exiting program");

    }

    public static int firstMenu() {
        System.out.println("========== Menu ============");
        System.out.println("1. Management");
        System.out.println("2. Statistics");
        System.out.println("3. Show Sorted Lists");
        System.out.println("0. Exit");
        System.out.println("============================\n");

        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    public static int showManagementMenu() {

        System.out.println("\n=========Management Menu==========");
        System.out.println("1. Add Employee");
        System.out.println("2. Show Employee by ID");
        System.out.println("3. Show Employee by Name");
        System.out.println("4. Show All Employees");
        System.out.println("5. Update Name of Employee");
        System.out.println("6. Update Phone Number of Employee");
        System.out.println("7. Delete Employee");
        System.out.println("8. Show Work Tasks of Employee (Polymorphism)");
        System.out.println("9. Show Bonus of Employee (Polymorphism)");
        System.out.println("0. Exit\n");

        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    public static void runManagementProgram(int secondChoice) {

        if (secondChoice == 1) {
            addPerson();
        } else if (secondChoice == 2) {
            showPersonById();
        } else if (secondChoice == 3) {
            showPersonByName();
        } else if (secondChoice == 4) {
            showAllPersons();
        } else if (secondChoice == 5) {
            updateName();
        } else if (secondChoice == 6) {
            updatePhoneNumber();
        } else if (secondChoice == 7) {
            removePerson();
        } else if (secondChoice == 8) {
            showTasks();
        } else if (secondChoice == 9) {
            showBonus();
        }else if (secondChoice == 0) {
            secondLoop = false;
        } else {
            System.out.println("There is no such option, try again!");
        }


    }

    public static int showStatisticsMenu() {

        System.out.println("1. Show Average Salary");
        System.out.println("2. Show Average Age");
        System.out.println("3. Show Employees by Gender");
        System.out.println("4. Show Average Salary by Profession");
        System.out.println("0. Exit");

        int choice = sc.nextInt();
        sc.nextLine();
        return choice;

    }

    public static void runStatisticsProgram(int choice) {
        if (choice == 1) {
            showAverageSalary();
        } else if (choice == 2) {
            showAverageAge();
        } else if (choice == 3) {
            showGenderPercentage();
        }
        else if (choice == 4 ){
            showAverageSalaryByProfession();
        }
        else if (choice == 0) {
            secondLoop = false;
        } else {
            System.out.println("There is no such option, try again!");
        }
    }

    public static int showSortingMenu() {

        System.out.println("\n=========Sorting Menu==========");
        System.out.println("1. Sort by Name Alphabetically");
        System.out.println("2. Sort by Name in Reverse Order");
        System.out.println("3. Sort by Salary in Ascending Order");
        System.out.println("4. Sort by Salary in Descending Order");
        System.out.println("0. Exit\n");

        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }
    public static void runSortingProgram(int choice) {
        if (choice == 1) {
            sortByNameAlphabetically();
        } else if (choice == 2) {
            sortByNameReverse();
        } else if (choice == 3) {
            sortBySalary();
        }
        else if (choice == 4 ){
            sortBySalaryReverse();
        }
        else if (choice == 0) {
            secondLoop = false;
        } else {
            System.out.println("There is no such option, try again!");
        }
    }
}

