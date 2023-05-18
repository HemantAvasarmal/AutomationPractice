package day11.thisKeywords;
class A1 {
	A1() {	
		this(25.35);
		System.out.println("hello zero");
	}
	A1(double d) {
		this(25);
		System.out.println("hello double " + d);
	}
	A1(int x) {
		System.out.println("Hello int " + x);
	}
}
public class ThisStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 A1 a1=new A1();
		 A1 a2=new A1(10);
		 A1 a3=new A1(10.23);
			//or
	//	A1 a1= new A1();
	}

}


