package com.techment;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st side ");
		a=sc.nextInt();
		System.out.println("Enter 2nd side ");
		b=sc.nextInt();
		System.out.println("Enter 3rd side ");
		c=sc.nextInt();
		
		if(a<b+c || b<a+c || c<a+b)
			System.out.println("Triangle can be formed");
		else
			System.out.println("Triangle cannot be formed");


	}

}
