package day11.thisKeywords;
class Student101 {
	int rollno;
	float fee;
	Student101(int rollno) {
		this.rollno = rollno;
	}
	Student101(int rollno, float fee) {
		this(rollno);// reusing constructor
		this.fee = fee;
	}
	void display() {
		System.out.println(rollno + " " + fee);
	}
}
public class ThisStatement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**********************Creating S1 object***************************");
		Student101 s1 = new Student101(110);//
		System.out.println(s1.rollno + " " + s1.fee);//
		System.out.println("**********************Creating S2 object***************************");
		Student101 s2 = new Student101(105, 6000f);//
		System.out.println(s2.rollno + " " + s2.fee);//
		System.out.println("*****************Display()*************************");
		s1.display();//
		s2.display();//
	}


/**
 * One constructor calls another constructor of the class called Constructor
 * Chaining
 */
}


