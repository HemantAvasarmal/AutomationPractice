package day4.staticmethodexamples;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		displayAmanPersonalInfo("Aman","doctor","Jalgaon");
		displayHemantPersonalInfo("Hemant","Engineer","Raver");
		displayYogeshPersonalInfo("Yogesh","Farmer","Bhusaval");
	}
		
		
		public static void displayAmanPersonalInfo(String name,String Prof,String City){
		System.out.println("Hi,I am "+name);
		System.out.println("I am a "+Prof);
		System.out.println("I am From "+City);
		
	}
		public static void displayHemantPersonalInfo(String name,String prof,String location) {
		System.out.println("\nHi,I am " + name);
		System.out.println("I am an " + prof);
		System.out.println("I am from" + location);
	}
		public static void displayYogeshPersonalInfo(String name,String Prof,String City){
			System.out.println("\nHi,I am "+name);
			System.out.println("I am a "+Prof);
			System.out.println("I am From "+City);
		}
	}


