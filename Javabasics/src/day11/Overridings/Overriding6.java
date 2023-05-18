package day11.Overridings;
class parent2{
 private void m1(){
		System.out.println("from parent m1()");
	}

protected void m2() {
	System.out.println("Form parent m2()");
   }
}

class child2 extends parent2{
	public void m1() {
		System.out.println("From child class m1()");	
	}
	public void m2() {
		
		System.out.println("from child class m2()");
	}
	
}
public class Overriding6 {
	public static void main(String args[]) {
		parent2 p2=new child2();
		p2.m2();
	}
}
  

