package opp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		//this method read data from a CSV file
		String filename = "C:\\SDETuniversity\\Files\\accounts.csv";
		String dataRow;
		List<String[]> data = new ArrayList<String[]>();

		
		try {
			//Open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			//Read as long as its not empty
			while ((dataRow = br.readLine())!= null ) {
				
				//parse the data by commas
				String[] line = dataRow.split(",");
				//Add the data to the collection
				data.add(line);
				
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (String[] account : data) {
			System.out.print("[ ");
			for (String field : account) {
				System.out.print(field);

			}
			System.out.println(" ]");
		}
	}

}
