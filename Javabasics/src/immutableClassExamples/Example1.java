package immutableClassExamples;
final class MyImmutableclass{
	final String name;
	final double salary;
	MyImmutableclass(String s1,double d2){
		name=s1;
		salary=d2;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyImmutableclass m1= new MyImmutableclass("Shaurya",45000);
		System.out.println(m1.getName()+ " "+m1.getSalary());
		
	}

}
