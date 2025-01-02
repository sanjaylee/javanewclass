package week3;

import java.util.Arrays;
import java.util.Scanner;

public class test1 {
	
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);	
	System.out.println("enter the number");
	int num=sc.nextInt();
	    int [] a1= {5,6,7,5,5,6,7,7,7,7,8};
//		   Arrays.sort(a1);
			System.out.println(Arrays.toString(a1));
			  int count=0;
			  
			   for (int i = 0; i < a1.length; i++) {
			         if(a1[i]==num) {
			        	count++;
			        	 
			         }
				}
			   System.out.println(count+" => "+num);
			 
		
		// first program
			   
			   String str="sanjay@gmail.com";
			   
			   for(int i=0;i<str.length();i++) {
				   if(str.contains(".")) {
					 
				   }
			   }
			   
		
						
					
				
			   
			   
			   
	   }
	}
			   
	


