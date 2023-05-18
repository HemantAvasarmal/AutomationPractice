package day10.constructors;

public class Cons0 {
	int age;
	
	void display() {
		System.out.println("Hi, i Am display method");
	}
	Cons0(){
	age=21;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons0 c1=new Cons0();
		System.out.println(""+c1.age);
		c1.display();
	}

}
