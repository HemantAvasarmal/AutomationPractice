package day13.abstractions;
abstract class Bike1{
	abstract void run();
	void speed(int spd) {
		System.out.println("Bike speed :"+spd);
	}
}
class Honda4 extends Bike1{
	void run() {
		System.out.println("running safely");
	}
	void speed(int spd) {
		System.out.println("Honda4 speed:"+spd);
		super.speed(120);
	}
	void color() {
		System.out.println("Honda1 color is blue");
	}
}
public class abstractClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda4 h1=new Honda4();
		h1.speed(60);
		h1.run();
		h1.color();
		System.out.println("************************************");
		Bike1 b1=new Honda4();
		b1.run();
		b1.speed(100);
	}

}
