package basics;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			System.out.println(nfact(5));
		}
	
	public static int nfact(int n) {
		
		if (n==0) {
			return 1;
		}
		else
		{
			return nfact(n-1)*n;
		}
	}

	}
