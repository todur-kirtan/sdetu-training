package datastructures;

public class Arrays {

	public static void main(String[] args) {
		String[] alphabet = {"a","b","c","d","e","f"};
		
		System.out.println("Old Fashioned way");
		for (int i=0;i<5;i++) {
			System.out.print(alphabet[i]+" ");
		}
		
		System.out.println("\nUsing length variable");
		for(int n=0;n<alphabet.length;n++) {
			System.out.print(alphabet[n]+" ");
		}
		
		System.out.println("\nUsing For-Each method");
		for(String letter : alphabet) {
			System.out.print(letter+" ");
		}
		
		System.out.println("\n\nUsing Double-Array");
		
		String[][] users = {{"John","williams","jw@test.com","2938498233"},
				            {"Sarah","Jackson","sj@test.com","2993567939"},
				            {"Rachael","Wallace","rw@test.com","8948345883"} };
		 
		int numOfuser = users.length;
		int numOffield = users[0].length;
		System.out.println("number of users " + numOfuser);
		System.out.println("number of fields "+ numOffield);
		
		//Traverse the list
		
		for(int i=0;i<numOfuser;i++) {
			String firstname = users[i][0];
			String lastname = users[i][1];
			String email = users[i][2];
			String phone = users[i][3];
			System.out.println(firstname+ " " + lastname + " " + email + " " + phone);
		}
		
		
		System.out.println("\n\nUsing For-Each");
		for(String[] user : users) {
			System.out.print("[ ");
			for(String field : user) {
				System.out.print(field);
			}
			System.out.println(" ]");
		}
	}

}
