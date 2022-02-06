package exceptionsfiles;

public class CommonException {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		
		try {
			int c = a/b;
			System.out.println("hello");
		} catch(ArithmeticException e) {
			
			System.out.println("CANNOT DIVIDE BY ZERO");
			System.out.println(e.toString());
			
		}
		
		String[] states = {"CA","NY","TX","FL","OH"};
		
		for (int i=0;i<=states.length;i++) {
			try {
				System.out.println(states[i]);
 			}catch (ArrayIndexOutOfBoundsException e) {
 				System.out.println("ERROR: Index outside of array domain");
 				System.out.println(e.toString());
 			} finally {
 				System.out.println("Iterating through array");
 			}
		}
		

	}
	
	

}
