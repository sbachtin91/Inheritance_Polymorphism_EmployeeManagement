package com.company;

import java.util.Comparator;

public class SortBySalaryReverse implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2){
        int intValue = (int) (Math.round(e2.getSalary() - e1.getSalary()));
        return intValue;
    }
}
