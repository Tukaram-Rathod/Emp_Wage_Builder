package com.company;

public class EmpWageBuilder {
    //constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;
    public static void main(String[] args) {
        System.out.println("welcome to employye wage builder program:");
        //Variable
        int empHrs = 0, empWage=0,totalEmpHrs = 0,totalEmpWage=0,totalWorkingdays =0;
        //computation
        while(totalEmpHrs <= MAX_HRS_IN_MONTH &&
                totalWorkingdays < NUM_OF_WORKING_DAYS) {
            totalWorkingdays++;
            int empCheck =(int) Math.floor(Math.random() * 10 ) % 3;
            switch(empCheck) {
                case IS_PART_TIME :
                    empHrs = 4;
                    break;
                case IS_FULL_TIME :
                    empHrs = 8;
                    break;
                default :
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Days#: " +totalWorkingdays+ "Emp Hrs :" + empHrs +":" );
        }
        totalEmpWage = totalEmpHrs *  EMP_RATE_PER_HOUR;
        System.out.println("Total EmpWage ==> " +totalEmpWage);
    }
}
