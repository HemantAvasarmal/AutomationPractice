package day4.staticmethodexamples;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=multiplyTwoNumbers(10,20,30);
		System.out.println("result is:"+res);
		int finalvalue=res+100;
		System.out.println("updated final value is :"+finalvalue);
	}
		public static int multiplyTwoNumbers(int n1,int n2,int n3) {
		System.out.println("number 1 is: "+n1);
		System.out.println("number 2 is :"+n2);
		System.out.println("number 3 is :"+n3);
		int res=n1*n2*n3;
		return res;
		
	}

}
