package day4;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       int Number = 0;
       
      

       System.out.println("Enter number");
        Number= input.nextInt();
        
        input.close();


       boolean EvenOddNo = isEvenOdd (Number);

       System.out.println("The number is  " + EvenOddNo );


}
			public static boolean isEvenOdd (int Number) {

		    if ((Number % 2)== 0){ 
		        return true; 
		    } 
		    else { return false; }

		} 
		
	}
	


