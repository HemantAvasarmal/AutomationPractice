package day11.Overridings;
class parent4{
	static void m1() {
		System.out.println("from parent"+" static m1()");
	}
	void m2() {
		System.out.println("from parent"+"Non-static m2()");
	}
}
class child4 extends parent4{
	static void m1() {
		System.out.println("from child"+" static m1()");
	}
	void m2() {
		System.out.println("from child"+" Non-static m2()");
	}
}
public class Overriding7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent4 P4= new parent4();
		P4.m1();
		parent4 P2=new child4();//static method can't overridden;
		P2.m1();//only non static method can be Overridden;
		P2.m2();
	}

}
