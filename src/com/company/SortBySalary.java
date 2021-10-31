package com.company;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2){
        int intValue = (int) (Math.round(e1.getSalary() - e2.getSalary()));
        return intValue;
    }
}
