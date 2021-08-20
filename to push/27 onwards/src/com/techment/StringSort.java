package com.techment;
import java.util.*;


public class StringSort {
	
	static void sort_elements(String []my_str, int n){
	      for (int i=1 ;i<n; i++){
	         String temp = my_str[i];
	         int j = i - 1;
	         while (j >= 0 && temp.length() < my_str[j].length()){
	            my_str[j+1] = my_str[j];
	            j--;
	         }
	         my_str[j+1] = temp;
	      }
	   }
	   public static void main(String args[]){
	      String []my_arr = {"This", "is", "a", "sample"};
	      int len = my_arr.length;
	      sort_elements(my_arr,len);
	      System.out.println("The sorted array is : ");
	      for (int i=0; i<len; i++)
	      System.out.println(my_arr[i]+" ");
	   }

}
