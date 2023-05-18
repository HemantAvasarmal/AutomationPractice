package day5.nonstaticmethodexamples;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 v1= new Example3();
		v1.addTwoNumbers(10,20);
	}
	public void addTwoNumbers(int n1, int n2) {
		System.out.println("number 1 is "+n1);
		System.out.println("number 2 is "+n2);
		int res=n1+n2;
		System.out.println("result is "+res);
		
	}
}
