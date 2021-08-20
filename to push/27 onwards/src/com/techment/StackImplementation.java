package com.techment;
import java.util.Stack;

public class StackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s1= new Stack();
		s1.push(1);
		s1.add(2);
		s1.add(3);
		
		System.out.println(s1);
		int i=3;
		while(i>=0)
		{
			System.out.println("popped element"+s1.peek());
			s1.pop();
			i--;
		}

	}

}
