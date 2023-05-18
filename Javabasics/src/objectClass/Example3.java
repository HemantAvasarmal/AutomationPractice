package objectClass;
class Demo123{
	void display() {
		System.out.println("I am display() of class Demo123");
	}
}
public class Example3 extends Demo123 {
	static int last_roll=100;
	int roll_no;
	Example3(){
		roll_no=last_roll;
		last_roll++;
	}
	void display() {
	System.out.println("i am Display method() of Object class 2");	
	}
	public int hashcode() {
		return roll_no;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 e1=new Example3();
		System.out.println(e1);
		System.out.println(e1.toString());
		System.out.println("hashcode value from object class 2"+e1.hashcode());
		e1.display();
		Demo123 d1= new Demo123();
		System.out.println(d1);
		//System.out.println("hashcode value from Demo123"+d1.hashcode());
		//It gives Complile time Error;
	}

}
