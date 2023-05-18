package day5.nonstaticmethodexamples;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example4 M1= new Example4();
		int res=M1.multiplyTwoNumbers(10,20);
		System.out.println("result is: "+res);
		int finalvalue=res+300;
		System.out.println("updated final value is: "+finalvalue);
	}
		int multiplyTwoNumbers(int num1,int num2){
		System.out.println("number 1 is: "+"num1\n");
		System.out.println("number 2 is: "+"num2\n");
		int res=num1*num2;
		
		return res;
		}

}
