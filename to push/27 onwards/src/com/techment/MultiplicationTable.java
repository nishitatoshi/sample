package com.techment;
import java.util.Scanner;

public class MultiplicationTable {
public static void main(String args[]) {
		
		int tableNum, tableLimit;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter table value");
		tableNum= sc.nextInt();
		System.out.println("enter table limit");
		tableLimit= sc.nextInt();
		
		for(int i = 1;i<=tableLimit;i++) {
			System.out.println(tableNum+"*"+i+"="+(tableNum*i));
		}
		
		
	}

}