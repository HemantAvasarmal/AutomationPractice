package day3.nonstaticvariableexamples;

public class Example2 {
	 static double salary=24000;
	int age=38;
	char grade;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 H=new Example2();
		H.grade='A';
		System.out.println("salary="+salary);
		System.out.println("age="+H.age);
		System.out.println("grade="+H.grade);
		
		
	}

}
