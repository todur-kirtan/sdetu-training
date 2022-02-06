package opp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordCriteriaApp {

	public static void main(String[] args) {
		// Read password file 
		
		String filename = "C:\\SDETuniversity\\Files\\Passwords.txt";
		String[] passwords = new String[13];
		
		File file = new File(filename);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for(int i=0 ;i<passwords.length; i++) {
				passwords[i] = br.readLine();
			}
		} catch (FileNotFoundException e) { System.out.println("ERROR: Could not find file");}
		
		catch (IOException e) { System.out.println("ERROR: Could not read file");}
		
		//test criteria
		for(String password : passwords) {
			System.out.println("********\n" +password+ "\n");
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasSpecialChar = false;
			
			
			for (int n=0;n<password.length();n++) {
				
				//Condition 1. Contains numbers 
				if("0123456789".contains(password.substring(n,n+1))) {
					hasNumber = true;
//					System.out.println("Position "+ n + "contains a number");
				}
				
				//Condition 2. Contains letters

				else if("abcdefghijklmnopqrstuvwxyz".contains(password.substring(n,n+1).toLowerCase())) {
					hasLetter = true;
//					System.out.println("Position"+n+"contains letter");
				}
				
				//Condition 3. Contains special character
				else if("!@#$%+()_-[]{}:;^&*".contains(password.substring(n,n+1))) {
					hasSpecialChar = true;
//					System.out.println("Position"+n+"contains special Character");
				}
				else {
					try { throw new InvalidCharacterException(password.substring(n, n+1)); }
					catch(InvalidCharacterException e) { e.toString();  }
//					System.out.println("Position"+n+"has Invalid Character");
				}
			}
			
			//test and exception handeling
			try {
				if(!hasNumber) {throw new NumberCriteriaException(password);}
				else if(!hasLetter) {throw new LetterCriteriaException(password);}
				else if(!hasSpecialChar) {throw new SpecialCharException(password);}
				else { System.out.println("Valid Password!"); }
			}	catch (NumberCriteriaException | LetterCriteriaException | SpecialCharException e) {
				System.out.println("Invlaid Password!");
				System.out.println(e.toString());

			}
		}

	}

}

class InvalidCharacterException extends Exception {
	String ch;
	public InvalidCharacterException(String ch) {
		this.ch = ch;
	}
	public String toString() {
		return "Invalid Character Exception"+ ch;
	}
	
}

class NumberCriteriaException extends Exception {
	String password;
	public NumberCriteriaException(String password) {
		this.password = password;
	}
	public String toString() {
		return "NumberCriteriaException: "+ password;
	}
	
}

class LetterCriteriaException extends Exception {
	String password;
	public LetterCriteriaException(String password) {
		this.password = password;
	}
	public String toString() {
		return "LetterCriteriaException: "+ password;
	}
	
}

class SpecialCharException extends Exception {
	String password;
	public SpecialCharException(String password) {
		this.password = password;
	}
	public String toString() {
		return "SpecialCharException: "+ password;
	}
	
}