package com.bridgelabz;
import java.util.*;



public class EqualityOfTwoline {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x1,x2,y1,y2,m1,m2,n1, n2;
	System.out.println("enter the numbers x1,x2,y1,y2,m1,m2,n1,n2:");
	x1 =sc.nextInt();
	x2=sc.nextInt();
	y1=sc.nextInt();
	y2=sc.nextInt();
	m1=sc.nextInt();
	m2=sc.nextInt();
	n1= sc.nextInt();
	n2=sc.nextInt();
	double firstLineLength=Math.sqrt((x2-x1)^2 +(y2-y1)^2);
	 double secondLineLength = Math.sqrt((m2-m1)^2 +(n2-n1)^2);
	 System.out.println("the length of first line is :"+firstLineLength);
	 System.out.println("the length of second line is :" +secondLineLength);
	 if (firstLineLength==secondLineLength) {
		 System.out.println("Equality of two lines are prefarable");
		 
	 }else {
		 System.out.println("length of two lines are not equal");
	 }
		 
	
	
	

	}

}
