package day10.constructors;

public class Cons4 {
	int age;
	double salary;
	Cons4(){
		age=23;
		salary=45000.00;
		
		System.out.println("***********************************");
		System.out.println("user define zero param const--start");
		
		System.out.println("user define zero param const--End");
		System.out.println("****************************************");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons4 c1=new Cons4();
		System.out.println(c1.age);
		System.out.println(c1.salary);
		
	}

}
