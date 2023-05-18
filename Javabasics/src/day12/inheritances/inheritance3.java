package day12.inheritances;
class  vehicle{
	public void wheels() {
		System.out.println("I have a wheels");
	}
}
class Bike extends vehicle{
	public void countwl() {
		System.out.println("I am a bike and has 2 wheels");
	}
}
class car extends vehicle{
	public void countwl() {
		System.out.println("I am a car and has 4 wheels");
	}
}
class scooter extends vehicle{
	public void countwl() {
		System.out.println("I am a scooter and has 2 wheels");
	}
}
public class inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c =new car();
		c.countwl();
		c.wheels();
	}
  
}



