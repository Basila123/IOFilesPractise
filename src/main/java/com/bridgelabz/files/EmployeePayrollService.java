package com.bridgelabz.files;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    List<EmployeePAyroll> employeePayrolls;

    public EmployeePayrollService(List<EmployeePAyroll> employeePayrolls){
        this.employeePayrolls = employeePayrolls;
    }

    /**
     * This method reads the data from user
     * @param sc input from console
     */
    public void readEmployeePayroll(Scanner sc) {
        System.out.print("Enter your ID number : ");
        int id = sc.nextInt();
        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.print("Enter your salary : ");
        int salary = sc.nextInt();
        EmployeePAyroll employeePayroll = new EmployeePAyroll(id,name,salary);
        employeePayrolls.add(employeePayroll);
    }

    /**
     * This method writes the user data in console
     */
    public void writeEmployeePayroll(){
        System.out.println(employeePayrolls);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        ArrayList<EmployeePAyroll> employeeList = new ArrayList<>();
        EmployeePayrollService employeePayroll = new EmployeePayrollService(employeeList);
        employeePayroll.readEmployeePayroll(sc);
        employeePayroll.writeEmployeePayroll();
    }
}