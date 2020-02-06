package day4;

import java.util.Scanner;

public class Radius {
	static final double Pie = 3.14159;
	public static void main(String[] args) {
	        Scanner input = new Scanner (System.in);
	       int Radius = 0;
	       
	      

	       System.out.println("Enter radius");
	        Radius= input.nextInt();
	        
	        input.close();


	       double CircleArea = calRadius(Radius);

	       System.out.printf("Area is " + CircleArea );




	    }
	 public static double calRadius (int Radius){
		 double CircleArea = Pie*Radius*2;
		 return CircleArea;
	 }

}
