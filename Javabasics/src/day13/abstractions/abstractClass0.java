package day13.abstractions;
 abstract class Demo3{
	abstract void print();
	void display() {
		System.out.println("I am non abstract method display");
	}
}
class Demo extends Demo3{
	void print() {
		System.out.println("I am non-abstract method display()..");
	}
	void display2() {
		System.out.println("I am non-abstract method display()..");
	}
}
abstract class Demo2{
	abstract void print();
	abstract void print1();
	abstract void print2();
}
public class abstractClass0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d1= new Demo();
		d1.display();
		d1.print();
		System.out.println("**************************************");
		Demo d2=new Demo();
		d2.display2();
		d2.display();
		d2.print();
		System.out.println("*************************************");
		
		
	}

}
