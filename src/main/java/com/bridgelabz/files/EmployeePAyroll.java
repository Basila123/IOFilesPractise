package com.bridgelabz.files;

public class EmployeePAyroll {
    int id;
    String name;
    int salary;

    public EmployeePAyroll(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Name:"+name+" Id:"+id+" Salary:"+salary;
    }
}
