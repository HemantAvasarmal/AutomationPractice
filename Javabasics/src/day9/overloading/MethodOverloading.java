package day9.overloading;

public class MethodOverloading {
	static double res;
 
	 static public void square() {
		 int res=20*20;
		 System.out.println("No parameterized method called="+res);
	 }
	 static public void square(int num) {
		  res=num*num;
		 System.out.println("Int parameterized method called="+res);
	 }
	 static void square(double number) {
		 res=number*number;
		 System.out.println("double parameterized method called="+res);
	 }
	 
	public static void main(String[] args) {
		MethodOverloading.square();
		MethodOverloading.square(3.0);
		MethodOverloading.square(2);
		MethodOverloading.square(1);
		
	}
	
}
	
			

