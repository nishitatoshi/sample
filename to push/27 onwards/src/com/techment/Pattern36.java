package com.techment;

public class Pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=(i*2); j++)
			{
				if(j<=i)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print((i*2-j+1)+" ");
				}
			}
			System.out.println();

		}

	}

}
