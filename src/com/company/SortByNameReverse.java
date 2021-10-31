package com.company;

import java.util.Comparator;

public class SortByNameReverse implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2){
        return e2.getName().compareTo(e1.getName());
    }
}
