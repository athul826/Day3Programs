package com.bridgelabz;

public class EmpWageUc4 {

	public static void main(String[] args) {
		final int isPresent=1;
		
		final int fullTime=1;
		
		int wagePerHour=20;
		int partTimeHour=8;
	    int	fullDayHour=8;
		int dialyEmpWage;
		
		int checkEmp=(int)(Math.random() *10) % 2;
		
		// check employee is present or absent
		switch(checkEmp) {
		case isPresent :
			int empType=(int)(Math.random() *10 ) %2;
		int	dailyEmpWage=wagePerHour*fullDayHour;
		
		//check employee type
		
		switch(empType) {
		case fullTime :
			
			System.out.println("Employee Type: Full Time");
			System.out.println("Employee Wage :"+ dailyEmpWage);
			break;
			default:
				
				System.out.println("employee Type :part Time");
				System.out.println("Employee Wage : " +(dailyEmpWage/2));
				
					
		}
		break;
		default:
			System.out.println("The employee is Absent ");
		
		}

	}

}
