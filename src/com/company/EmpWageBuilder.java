package com.company;

public class EmpWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome To EmpWageBuilder ");
        int IS_PRESENT = 1;
        double empCheck = Math.floor(Math.random() * 10 ) % 2;
        if (empCheck == IS_PRESENT)
            System.out.println("Employee Is Present");
        else
            System.out.println("Employee Is Absent");
    }

}
