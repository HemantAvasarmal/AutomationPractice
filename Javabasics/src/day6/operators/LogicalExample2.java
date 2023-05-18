package day6.operators;

public class LogicalExample2 {
	public static void main(String[] args) {
	int num1=30,num2=24;
	boolean bool1=(num1==num2);
	boolean bool2=(num1>=num2);
	System.out.println("bool1 && bool2="+(bool1 && bool2));
	System.out.println("bool1 || bool2="+(bool1 || bool2));
	System.out.println("!(bool1 && bool2=)"+!(bool1 && bool2));
   }
}
