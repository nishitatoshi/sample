package com.techment;
import java.util.*;

public class HeronsFormula {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a ");
		int a=scanner.nextInt();
		
		System.out.println("Enter b ");
		int b=scanner.nextInt();
		
		System.out.println("Enter c ");
		int c=scanner.nextInt();
		
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area is: "+area);

	}

}
