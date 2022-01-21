package com.bridgelabz;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		int isPresent= 1;
		double checkEmp=Math.floor(Math.random() *10) %2;
		if(checkEmp==1) {
			System.out.println("Employee is present");
		}else {
			System.out.println("Employee is absent");
		}

	}

}
