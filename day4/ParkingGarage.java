package day4;

import java.util.Scanner;

public class ParkingGarage {
	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       int Hours = 0;
       
      

       System.out.println("Enter hours parked for each customer");
       Hours= input.nextInt();
        
        input.close();


       double ParkingCharges = calParkingGarage (Hours);

       System.out.println("The Results level is  " + ParkingCharges );


}
	public static double  calParkingGarage (int Hours) {
          double ParkingCharges = 0;
	    if (Hours > 0 && Hours <= 3){ 
	     ParkingCharges = 2.00;
	    } 
	      if (Hours >3){ 
	         ParkingCharges = 3*2.00 + Hours *2.00; 
	    } 
	     if (Hours == 24){ 
	         ParkingCharges = 24*10.00; 
	    }
	    
	    return ParkingCharges;
	    
	}
}


