package day11.Overridings;
class ABC{
	void myMethod() {
		System.out.println("method of Class ABC");
	}
}

public class Overriding4 extends ABC {
	public void myMethod() {
		super.myMethod();
		System.out.println("Overrriding method of class overriding4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding4 obj =new Overriding4();
		obj.myMethod();
	}

}
