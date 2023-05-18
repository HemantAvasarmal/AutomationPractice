package day5.nonstaticmethodexamples;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example7 v1 = new Example7();
		v1.getQoutientAndRemainder(25,7);
		
	}
		 void getQoutientAndRemainder(int num1, int num2) {
			System.out.println("number 1 is :"+num1);
			System.out.println("number 2 is :"+num2);
			 int Qoutient =num1/num2;
			 int Remainder =num1%num2;
			 System.out.println("Qoutient is :"+Qoutient);
			 System.out.println("Remainder is :"+Remainder);	
		}
}
