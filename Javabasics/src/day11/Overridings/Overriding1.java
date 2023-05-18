package day11.Overridings;
class animal{
	animal(){	
	}
	void move() {
		System.out.println("Animals can move");
	}
}
class Dog extends animal{
	Dog(){
		super.move();
	}
	void move() {
		System.out.println("Dogs can walk and Run");
	}
	void Bark() {
		System.out.println("Dogs can Bark");
	}
}
public class Overriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		animal a1= new Dog();
		a1.move();
	
		
		
		
	}

}
