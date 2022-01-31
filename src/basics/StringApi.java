package basics;

public class StringApi {
	public static void main(String[] args) {
		
		String bookTitle = "The Lord Of The Rings";
		
		
		
		if (bookTitle.contains("Ring")) {
			System.out.println("contains the word Ring!");
			
			System.out.println(bookTitle.substring(0,1));
			System.out.println(bookTitle.substring(16));
		}
	}

}
