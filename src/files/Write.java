package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		//1. Define the path the we want to write 
		String filename = "C:\\SDETuniversity\\Files\\FileToWrite.txt";
		String message = "Im writing data that will be placed in a file";
		
		//2. Create the file in Java
		File file = new File(filename);
		
		
		try {
			//3. Open the file  
			FileWriter fw;
			
			fw = new FileWriter(file);
			//4. Write to the file
			fw.write(message);
			
	        //4. Close the resources
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ERROR: Could not write file: "+filename);
		}finally {
			System.out.println("Closing the filewriter");
		}
		
		

	}

}
