package day5.nonstaticmethodexamples;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example6 s1= new Example6();
		s1.swapTwoNumbers(20,30);
	}
		void swapTwoNumbers(int num1,int num2) {
			System.out.println("Before swap number 1 is : "+num1);
			System.out.println("Before swap number 2 is :"+num2);
			num1=num1+num2;
			num2=num1-num2;
			num1=num1-num2;
			System.out.println("After swap number 1 is :"+num1);
			System.out.println("After swap number 2 is :"+num2);
		}
}
