package com.bridgelabz;
import java.util.*;

public class LineComparison {

	public static void main(String[] args) {
		
	
		
		int x1,x2,y1,y2,m1,m2,n1,n2;
		System.out.println("enter the number x1,x2,y1,y2,m1,m2,n1,n2.");
		Scanner sc=new Scanner(System.in);
		 x1=sc.nextInt();
		 x2=sc.nextInt();
		 y1=sc.nextInt();
		 y2=sc.nextInt();
		 m1=sc.nextInt();
		 m2=sc.nextInt();
		 n1=sc.nextInt();
		 n2=sc.nextInt();
		 double firstLineLength=Math.sqrt((x2-x1)^2 +(y2-y1)^2);
		 double secondLineLength=Math.sqrt((m2-m1)^2 +(n2-n1)^2);
		 System.out.println("length of first line is="+firstLineLength);
		 System.out.println("length of second line is="+secondLineLength);
		 if (firstLineLength==secondLineLength) {
			 System.out.println("Two lines are equal");
			 
		 }
		 else if(firstLineLength > secondLineLength) {
			 System.out.println("First line is grater than second line");
			 
		 }else {
			 System.out.println("Second line is greater than first line");
			 
			 sc.close();
		 }
		 
		

	}

}
