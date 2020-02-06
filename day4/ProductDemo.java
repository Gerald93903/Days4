package day4;

import java.util.Scanner;

public class ProductDemo {
	 public static void main(String[] args) {
	        int num1 = 0,num2 = 0;
	        Scanner input = new Scanner (System.in);

	        System.out.println("Enter First integer");
	        num1 = input .nextInt() ;
	        
	        System.out.println("Enter second integer");
	        num2 = input .nextInt() ;

	       int product = calcProductDemo(num1,num2);
	       
	      System.out.println("Product is " +(product));
	        
	        input.close();

  } 
	 
public static int calcProductDemo(int num1,int num2) { // Method header or method signature
	
	int product = num1 *num2 ;
	return product;
	  
	
}
}
