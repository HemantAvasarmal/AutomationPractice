package day4.staticmethodexamples;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		displayPersonalInfo("Aman","Doctor","Jalgaon");
		calling(256);
		speaking(123);
		
	}
		public static void displayPersonalInfo( String name,String Prof,String Location) {
		System.out.println("Hi, I am "+name);
		System.out.println("I am a "+Prof);
		System.out.println("I am from "+Location);
		}
		public static void calling(int num) {
		System.out.println("calling using number :"+num);
		}
		public static void speaking(int num) {
			System.out.println("speaking using number :"+num);
		
	}

}
