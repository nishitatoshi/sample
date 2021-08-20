package com.techment;
import java.util.Scanner;

public class RightAngleTriangle {
	
	@SuppressWarnings("resource")
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the 1st side");
	int side1 = sc.nextInt();

	System.out.println("Enter the 2nd side");
	int side2 = sc.nextInt();

	System.out.println("Enter the 3rd side");
	int side3 =sc.nextInt();


	{
	if(side1 * side2 == side2 * side2 + side3 * side3 || side2 * side2 == side1 * side1 + side3 * side3 || side3 * side3 == side1 * side1 + side2 * side2)
	   {
	    	System.out.print("Right Angled Triangle");
	}
	else
	{
		System.out.print("Not a Right Angled Triangle");	
	}
	}
 }
}