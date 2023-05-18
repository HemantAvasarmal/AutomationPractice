package day3.nonstaticvariableexamples;

public class Example1 {
	double salary=9000;
	int age;
	char grade='A';
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 s=new Example1();
		Example1 a=new Example1();
		a.age=56;
		Example1 g=new Example1();
		a.age=37;
		System.out.println("salary="+s.salary);
		System.out.println("age="+a.age);
		System.out.println("grade="+g.grade);
	}
	
}
