package day1.printexamples;

public class Example11 {
	public static void main(String args[]) {
		Example11 ex=new Example11();
		ex.displayPersonalInfo("Hemant","Engineer","Pune");
		
		
	}
	

	public void displayPersonalInfo(String Name,String Proffession,String Location) {
		System.out.println("Hi i am "+Name);
		System.out.println("I am an "+Proffession);
		System.out.println("I am from "+Location);

	}

 }


