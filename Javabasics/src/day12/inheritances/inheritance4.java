package day12.inheritances;
class fourwheeler {
	//default constructor
	public void wheels() {
		System.out.println("I have 4 wheels");
	}
}
//child class of fourwheeler and parent of maruti
class car1 extends fourwheeler {
	//default constructor with default super()
	public void type() {
		System.out.println("I'm a car");
	}
}
//child class of car class
class maruti extends car1 {
	//default constructor with default super()
	public void company() {
		System.out.println("I'm maruti");
	}
}
public class inheritance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maruti fr = new maruti(); // object of child class
		fr.wheels();
		fr.type();
		fr.company();
	}
}

	
