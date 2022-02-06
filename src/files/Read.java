package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// 1.Define the file path that we want to read.
		String filename = "C:\\SDETuniversity\\Files\\FilesToRead.txt";
		
		String text = null;
		
		// 2.Create the file in java
		File file = new File(filename);
		
		
		try {
			// 3.Open the file
			BufferedReader br = new BufferedReader(new FileReader(file));
			// 4.Read the file
			
			  text = br.readLine(); 
			// 5. Close the resources
			  br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR file not found" + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read the file"+ filename);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("Finished reading the file");
		}
		
		System.out.println(text);
 
	}

}
