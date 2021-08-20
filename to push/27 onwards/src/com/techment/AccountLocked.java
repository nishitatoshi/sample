package com.techment;

import java.util.Scanner;

public class AccountLocked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int pin = 12345;

		
		System.out.print("Enter your pin: ");
		int entry = sc.nextInt();
        int count=0;
		while ( entry != pin )
		{
			System.out.println("Incorrect pin");
			count++;
			if(count==3)
			{
				System.out.println("Locked!!!!");
				break;
			}
			if(count==3)
        	{
        	break;
        	}
			System.out.print("Enter your pin ");
			entry = sc.nextInt();
		}
          if(count!=3)
          {
      		System.out.println("\nCorrect pin");
  
          }
		}

	}

