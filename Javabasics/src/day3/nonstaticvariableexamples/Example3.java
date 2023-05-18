package day3.nonstaticvariableexamples;

public class Example3 {
	int age;
	double salary;
	public static void main(String[] args) {
		Example3 c1=new Example3();
		c1.age=45;
		Example3 b1=new Example3();
		b1.salary=34000;
		System.out.println("Age is :"+c1.age);
		System.out.println("Salary is :"+b1.salary);
	}
}
	