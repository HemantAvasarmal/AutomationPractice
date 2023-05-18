package day13.abstractions;
abstract class Animal{
	public abstract void animalSound();
	public void sleep() {
		System.out.println("Zzz");
	}
}
class Pig extends Animal{
	public void animalSound() {
		System.out.println("The Pig says: wee wee");
	}
}
class Dog8 extends Animal{
	public void animalSound() {
		System.out.println("The Dog says: Bow Bow");
	}
}
public class abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig p1= new Pig();
		p1.animalSound();
		p1.sleep();
		System.out.println("*************************");
		Dog8 d1=new Dog8();
		d1.animalSound();
		d1.sleep();
		System.out.println("****************************");
		Animal a1= new Dog8();
		a1.sleep();
		a1.animalSound();
		
	}

}
