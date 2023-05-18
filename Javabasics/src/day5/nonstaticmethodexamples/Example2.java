package day5.nonstaticmethodexamples;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 S1=new Example2();
		S1.displayPersonalInfo("Hemant","Engineer","Raver");
		S1.displayPersonalInfo("Aman","doctor","Pune");
		S1.displayPersonalInfo("Shaurya","MD","U.S");
		Example2 S2=new Example2();
		S2.personalinfo();
		S1.calling(12345);
		S1.calling(456789);
		int i=786;
		S1.calling(i);
	}
		public void personalinfo() {
			System.out.println("Hi I am Hemant");
			System.out.println("I am from Dubai");
			
		}
		public void displayPersonalInfo(String name, String prof, String location ) {
		System.out.println("Hi, I Am "+name);
		System.out.println("I am a "+prof);
		System.out.println("I am from "+location);
		}
		public void calling(int num) {
			System.out.println("calling "+num);
		}

}
