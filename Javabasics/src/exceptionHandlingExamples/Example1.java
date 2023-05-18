package exceptionHandlingExamples;

public class Example1 {
	public static void validateAge(int age) {
		if(age<=18) {
			System.out.println("Person is Not Eligible for voting");
			throw new ArithmeticException("Person is not Eligible for vote");
		}else {
			System.out.println("Person is Eligible for voting");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program start from Here");
		validateAge(10);
		System.out.println("Program End");
	}

}
