package immutableClassExamples;
final class Immutableclass{
	final String name;
	final int age;
	Immutableclass(String s1,int a1){
		name=s1;
		age=a1;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class Example0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Immutableclass c1= new Immutableclass("pune",23);
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		Immutableclass c2= new Immutableclass("Hemant",567);
		System.out.println(c2.getName()+" "+c2.getAge());
		System.out.println(c2.getAge());
	}

}
