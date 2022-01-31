package basics;

public class Fibonacci {

	public static void main(String[] args) {
		
		
	  fib(8);
		
	}
	
	
	public static void fib(int count) {
		
		
		int a = 0;
		int b = 1;
		int num=0;
		
			
			for(int i=0;i<=count;i++) {
				
					
					num = a + b;
					System.out.println(num);
					a = b;
					b = num;
				
		
		}
		
		
		 
	}

	

}
