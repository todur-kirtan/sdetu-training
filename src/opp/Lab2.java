package opp;

public class Lab2 {

	public static void main(String[] args) {
		Student stu1 = new Student("Jenelle","88239994"); 
		Student stu2 = new Student("Thomas","2323423"); 
		Student stu3 = new Student("Liz","23423423");
		stu1.enroll("Math151");
		stu1.enroll("English255");
		stu1.enroll("History211");
		
		
//		stu1.showCources();
//		stu1.checkBalance();
		stu1.payTution(600);
//		stu1.checkBalance();
		System.out.println(stu1.toString());
		
     }

}
	
	
	class Student {
		//properties 
		private static int iD = 10;
		private String userId;
		private String ssn;
		private String name;
		private String phone;
		private String city;
		private String state;
		private String email;
		private String courses = "";
		private static final int costOfCourses = 800;
		private int balance=0;
		
		public Student(String name, String ssn) {
			iD++;
			this.name = name;
			this.ssn = ssn;
			setuserId();
			setEmail();
		}
		
		private void setEmail() {
			
			email = name.toLowerCase()+"."+ iD + "@sdetuniversity.com";
			System.out.println("Your Email:" + email);
			
		}
		public String getEmail() {
			return email;
		}
		
		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		private void setuserId() {
			int Max = 90;
			int Min = 10;
			int rand = (int) (Math.random() * (Max - Min));
			rand = rand + Min;
			userId = iD + "" + rand + ssn.substring(5);
			System.out.println("Your UserID: "+ userId);
		}
		
		public void enroll(String course) {
			
			this.courses = this.courses + " " + course;
			System.out.println(courses);
			balance = balance + costOfCourses;
			
		}
		
		public void payTution(int amount) {
			balance = balance -amount;
			System.out.println("Payment:$" + amount);
		}
		
		public void checkBalance() {
			System.out.println("Balance: $" + balance);
			
		}
		
		public void showCources() {
			System.out.println("Courses: "+courses);
		}
		
		public String toString() {
			return "[Name:" + name + "]\n[Courses:" + courses + "]\n[Balance:"+ balance;
			
		}
	}


