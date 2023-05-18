package day4.staticmethodexamples;

public class Example15 {
	static int age;
	static double salary;
	int roll=23;
	static double getSalary( double salary) {
		System.out.println("salary is ="+salary);
		return salary;
	}
	public static int getAge(int Age) {
		System.out.println("Age is ="+Age);
		return age;
	}
	public int getRoll(int num) {
		System.out.println("Roll no is ="+roll);
		return roll;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSalary(36000);
		getAge(16);
		Example15 r1= new Example15();
		r1.getRoll(68);
		r1.getRoll(34);
		Example15 r2= new Example15();
		r2.getRoll(90);
	
	}

}
