package exceptionsfiles;

public class Demo {
	
	public static void main(String[] args) {
		
		doMath(3,0);
		
	}
	
	static void doMath(int a, int b) {
		answer(a,b);
		
	}
	
	static double answer(int x, int y) {
		
		return x/y;
	}

}
