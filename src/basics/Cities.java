package basics;

public class Cities {

	public static void main(String[] args) {
		
		String[] cities = {"New York","San Francisco","Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		
		
		String[] states = new String[3];
		states[0] = "California";
		states[1] = "Texas";
		states[2] = "Kansas";
		
		System.out.println(states[1]);
		
		System.out.println("\nWhile loop\n");
		
		int i =0;
		do {
			
			System.out.println(cities[i]);
			i++;
			
		}while(i<=2);
		
		boolean Statefound = false;
		int n = 0;
		while(!Statefound) {
			
			String state = states[n];
			if(state == "Texas") {
				System.out.println("State Found\n");
				Statefound = true;
			}
			n++;
		}
		
	
		

	}

}
