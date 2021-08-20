package com.techment;
import java.util.Scanner;

public class MatrixAddition {
	
	public static void main(String[] args) 
    {
        int p, q;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of first matrix:");
        p = s.nextInt();
        System.out.print("Enter size of second matrix:");
        q = s.nextInt();

        if (p == q) 
        {
            int a[][] = new int[p][p];
            int b[][] = new int[q][q];
            int c[][] = new int[p][p];
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < p; j++) 
                {
                    a[i][j] = s.nextInt();
                }
            }
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i < q; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    b[i][j] = s.nextInt();
                }
            }
            System.out.println("First Matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < p; j++) 
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("Second Matrix:");
            for (int i = 0; i < q; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < p; j++) 
                {
                    for (int k = 0; k < p; k++) 
                    {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
            }
            System.out.println("Matrix after addition:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < p; j++) 
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Addition would not be possible");
        }
    }

}
