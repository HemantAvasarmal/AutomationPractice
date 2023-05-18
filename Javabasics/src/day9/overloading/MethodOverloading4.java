package day9.overloading;
class displayOverloading{
	
	public static void display(String Name) {
	System.out.println("Hi, I Am "+Name);
}
	public static void display(int num) {
	System.out.println("Int number is="+num);
}
static void display(double num) {
	System.out.println("Double number is="+num);
    }
}
public class MethodOverloading4 {
	public static void Method(String Name) {
		System.out.println("I am "+Name);
	}
	static void Method(int number) {
		System.out.println("Integer number is="+number);
	}
	static void Method(float Num) {
		System.out.println("Float value is="+Num);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading4.Method(23);
		MethodOverloading4.Method("Hemant");
		displayOverloading.display(23);
		MethodOverloading4.Method("Shaurya");
		MethodOverloading4.Method("Swarup");
	     }
	  
	}

