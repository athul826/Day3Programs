package com.bridgelabz;
import java.util.Scanner;

public class LineComparisonUc1 {

	public static void main(String[] args) {
		System.out.print("ESnter the numbers: X1 ,x2 Y1, Y2.");
		Scanner sc=new Scanner(System.in);
		int x1,x2,y1,y2;
		x1= sc.nextInt();
		x2=sc.nextInt();
		y1=sc.nextInt();
		y2=sc.nextInt();
		
		double length=Math.sqrt((x2-x1)^2+(y2-y1)^2);
		System.out.println("the length of line ="+ length);
		sc.close();
		

	}


}
