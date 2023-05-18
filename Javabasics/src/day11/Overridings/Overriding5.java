package day11.Overridings;
class parent{
	void show() {
		System.out.println("Parent's show()");
	}
	
}
class child extends parent{
	void show() {
		
		System.out.println("childs show()");
	}
	
}
public class Overriding5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent P1=new parent();
		P1.show();
		parent P2=new child();
		P2.show();
		
     }
  }

