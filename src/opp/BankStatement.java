package opp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BankStatement {

	public static void main(String[] args) {
		
		//this method read data from a CSV file
		String filename = "C:\\SDETuniversity\\Files\\CCStatement.csv";
		String dataRow;
		List<String[]> transcations = new ArrayList<String[]>();
		double balance = 0;


		try {
			//Open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));

			//Read as long as its not empty
			while ((dataRow = br.readLine())!= null ) {

				//parse the data by commas
				String[] line = dataRow.split(",");
				//Add the data to the collection
				transcations.add(line);

			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("DATE  |  TYPE  |  VENDOR  |  BALANCE  ");
		for (String[] transaction : transcations) {
			String date = transaction[0];
			String type = transaction[1];
			String vendor = transaction[2];
			double amount = Double.parseDouble(transaction[3]);
			System.out.print(date+ " | " + type + " | " + vendor+ " | $" + amount);

			if (type.equalsIgnoreCase("credit")) {
//				System.out.println("Add to balance");
				balance = balance + amount;
			}
			else if(type.equalsIgnoreCase("debit")) {
//				System.out.println("Substrating from balance");
				balance = balance - amount;
			}
			else {
//				System.out.println("Some other transcation");
			}
			System.out.print(" Balance: $" + balance + "\n");
		}
		
		if (balance > 0) {
			System.out.println("You have a balance of :" + balance);
			System.out.println("You are charged with 10% fee of " + balance*0.10);
			System.out.println("Your new balance is :" + balance*1.1);
		}
		else if(balance < 0) {
			System.out.println("Thank you for your payment");
			System.out.println("You have an Overpayment of -" +balance);
		}
		else {
			System.out.println("Thank you for your payment!");
		}

	}

}
