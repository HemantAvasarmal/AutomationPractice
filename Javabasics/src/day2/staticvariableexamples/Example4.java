package day2.staticvariableexamples;

public class Example4 {
	int roll;
	static double salary;
	public static void main(String[] args) {
		int age=29;
		Example4 b1=new Example4();
		b1.roll=111;
		salary=200000;
		System.out.println("roll number is :"+b1.roll);
		System.out.println("salary is :"+Example4.salary);
		System.out.println("age is :"+age);
	}
}
		
	
		