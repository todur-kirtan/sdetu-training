package basics;

public class NumberCal {
	
	static void PrintName() {
		
		System.out.println("");
	}
	
	
    static int AddNum(int a, int b) {
    	
    	return a + b;
    	
    }
    
    static int Product(int a, int b) {
    	
    	return a * b;
    }
    
    public static void main (String[] args) {
    	
    	int num1 = 10;
    	int num2 = 20;
    	
    	System.out.println("Sum function of two numbers:" + AddNum(num1,num2));
    	System.out.println("product function of two numbers:" + Product(num1,num2));
    }

}
