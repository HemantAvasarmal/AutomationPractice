package day10.constructors;

public class Cons1 {
	Cons1(){
	System.out.println("This is zero para constructor");
	}
	public Cons1(char c) {
		System.out.println("This is single para constructor");
	}
	Cons1(int num1, int num2){
		System.out.println("This is Int-Int para constructor ");
	}
	Cons1(int num1,double num2){
		System.out.println("This is Int-double para constructor");
	}
	Cons1(double num1,int num2){
		System.out.println("This is double-int para constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons1 c1=new Cons1();
		Cons1 c2=new Cons1('A');
		Cons1 c3=new Cons1(23,45);
		Cons1 c4=new Cons1(23,45.2);
		Cons1 c5=new Cons1(26.34,78);
		
	}

}
