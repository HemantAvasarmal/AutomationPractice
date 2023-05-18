package immutableClassExamples;
final class Immutable{
	final int age;
	final double salary;
	final String name;
	Immutable(int a,double b,String c){
		age=a;
		salary=b;
		name=c;
		
	}
	public int getAge() {
		return age;	
	}
	public double getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public void display() {
		System.out.println(age);
		System.out.println(salary);
		System.out.println(name);
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Immutable s1= new Immutable(23,100000,"Hemant");
		System.out.println(s1.getAge());
		System.out.println(s1.getSalary());
		System.out.println(s1.getName());
		System.out.println("***********************************");
		s1.display();
		}
	}


