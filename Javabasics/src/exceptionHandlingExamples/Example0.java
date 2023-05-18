package exceptionHandlingExamples;

public class Example0 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=24;
		int num2=0;
		
		try {
			System.out.println("Inside the try block");
			int num3=(num1/num2);
			System.out.println("Result:"+num3);
			System.out.println("No Exception found");
		}catch(ArithmeticException obj) {
			System.out.println("inside the catch block");
			System.out.println(""+obj);
			System.out.println("Exception found");
		}
	}
}
	
	



