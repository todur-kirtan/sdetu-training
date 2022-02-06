package exceptionsfiles;

import java.util.Scanner;

public class PaymentsApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		double payment = 0;
		boolean positivePymt = true;

		

		do {
			  // 1. Ask User for input
			  System.out.print("Enter the Payment amount:");
			
			
		     // 2. Get the amount and test the value.
		     Scanner in = new Scanner(System.in);
		     // 3. Handle Exceptions appropriately
		     try {
			        payment = in.nextDouble();
		 	         if (payment < 0) {
				        throw new NegativePaymentException(payment);
			         }
		 	         else {
		 	        	    positivePymt = true;
		 	         }
		     }   catch (NegativePaymentException e) {
			System.out.println(e.toString());
			System.out.println("Please try again...");
			positivePymt = false;
		}
		
		}while(!positivePymt);
		
		// 4. Print confirmation
		System.out.println("Thank You for your payment of: $"+payment);
		
	}

}
