package opp;

class Person {
	
	String Name;
	String Email;
	String Phone;
	
	void Walk() {
		
		System.out.println(Name+ " is Walking");	
		
	}
	
	void Eat() {
		
		System.out.println(Name+ " is Eating");
		
	}
	
	void Sleep() {
		
		System.out.println(Name+ " 	is Sleeping");
		
	
	}
}
 


public class Demo {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.Name = "Joe";
		person1.Email = "Joe@Test.com";
		person1.Phone = "999324234";
		
		person1.Walk();
		person1.Sleep();
		person1.Eat();
				
			
		
	}

}
