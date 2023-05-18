package day11.Overridings;
class human{
	 void eat() {
		System.out.println("Human is eating");
	}
}
class boy extends human{
	protected void eat() {
		System.out.println("Boy is Eating");
	}
}
public class Overriding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boy c= new boy();
		c.eat();
		
	}

}
