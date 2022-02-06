package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		//This will read text file and retrieve the phone number
		
		String filename = "C:\\SDETuniversity\\Files\\PhoneNumber.txt";
		
		File file = new File(filename);
		String PhoneNum = null;
		String[] PhoneNums = new String[9];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i=0;i<PhoneNums.length;i++) {

				PhoneNums[i] = br.readLine();
			}
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: File not found"+filename);
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file:" +filename);

		}

		

		//valid phone number
		  //1. 10-digits long
		  //2. cannot start with 0 or 9
		  //3. can have 911
		
		for(int i=0;i<PhoneNums.length;i++) {
			PhoneNum = PhoneNums[i];
			try {
				if (PhoneNum.length() != 10) {
					throw new TenDigitException(PhoneNum);

				}
				if ((PhoneNum.substring(0).equals("0")) || (PhoneNum.substring(0,1).equals("9"))) {
					throw new AreaCodeException(PhoneNum);
				}

				for (int n=0;n<PhoneNum.length()-2;n++) {
					if (PhoneNum.substring(n,n+1).equals("9")) {
						if (PhoneNum.substring(n+1,n+3).equals("11")) {
							throw new EmergencyException(PhoneNum);

						}
					}
				}

				System.out.println(PhoneNum);
			} catch(TenDigitException e) {
				System.out.println("ERROR: Phone Number is not 10-digit long");
				System.out.println(e.toString());
			} catch(AreaCodeException e) {
				System.out.println("ERROR: Phone Number has invalid area code");
				System.out.println(e.toString());

			} catch (EmergencyException e) {
				System.out.println("ERROR: Invalid 991 found");
				System.out.println(e.toString());
			}
		}
        

	}

}


class TenDigitException extends Exception{
	 String num;
	
	 TenDigitException(String num) {
		 this.num = num;
		
	
	}
	public String toString() {
		return ("TenDigitException:"+num);
	}
}
class AreaCodeException extends Exception{
	 String num;
		
	 AreaCodeException(String num) {
		 this.num = num;
		
	
	}
	public String toString() {
		return ("AreaCodeException:"+num);
	}
	
}

class EmergencyException extends Exception {
	 String num;
		
	 EmergencyException(String num) {
		 this.num = num;
		
	
	}
	public String toString() {
		return ("EmergencyException:"+num);
	}
	
}