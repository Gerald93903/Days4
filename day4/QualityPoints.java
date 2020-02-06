package day4;

import java.util.Scanner;

public class QualityPoints {
	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       int StudentAvg = 0;
       
      

       System.out.println("Enter Student Average");
       StudentAvg= input.nextInt();
        
        input.close();


       int Results = QualityPonts (StudentAvg);

       System.out.println("The Results level is  " + Results );


}

	public static int QualityPonts (int StudentAvg) {

    if (StudentAvg >= 90 && StudentAvg<=100){ 
        return 4; 
    } 
    else if (StudentAvg >= 80 && StudentAvg<=89){ 
        return 3; 
    } 
    else if (StudentAvg >= 70 && StudentAvg<=79){ 
        return 2; 
    }
    else if (StudentAvg >= 60 && StudentAvg<=69){ 
        return 1; 
    }
    else 
        return 0; 
    }

} 



