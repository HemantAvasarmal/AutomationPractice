package day5.nonstaticmethodexamples;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example10 v1= new Example10();
		v1.swapTwoNumbers(25,15);
		
	}
		void swapTwoNumbers(int num1, int num2) {
			System.out.println(" Before swap number 1 is :"+num1);
			System.out.println(" Before swap number 2 is :"+num2);
			num1=num1+num2;
			num2=num1-num2;
			num1=num1-num2;
			System.out.println(" After swap number 1 is :"+num1);
			System.out.println(" After swap number 2 is :"+num2);
		
		}
}
