package day8.forloopExamples;

public class Example10 {
	public static void main(String[] args) {
	int i=50;
	if (i%2==0) {
		System.out.println("The given number is even="+i);
	}
		else {
			System.out.println("The given number is odd="+i);
		}
	  checkEvenOrOddNumber(50);
	}
		static void checkEvenOrOddNumber(int num) {
			if(num%2==0) {
				System.out.println("Given Number is Even Number="+num);	
			}else {
				System.out.println("Given Number is Odd Number="+num);
			}
		int sub1=45,sub2=37;
		if (sub1>35 && sub2>35) {
			System.out.println("Pass");
		}else {
			System.out.println("fail");
    }
		
  }
}