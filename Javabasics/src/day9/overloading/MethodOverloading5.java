package day9.overloading;

public class MethodOverloading5 {

	public static void main(int num) {
		System.out.println("int Num="+num);
	}
	public static void main(double C) {
		System.out.println("char="+C);
	}
	public static void main(String[] args) {
		MethodOverloading5.main(25);
		MethodOverloading5.main('A');
		System.out.println("********************************************");
		MethodOverloading2 B1=new MethodOverloading2();
		B1.square(5);
		B1.square();
		B1.square(5.5f);
	}
	

}
