package objectClass;
class TestSample{
	void callMe() {
		System.out.println("Hello");
	}
}
public class Example4 extends TestSample {
	static int last_roll = 100;
	int roll_no;
	// Constructor
	Example4()
    {
        roll_no = last_roll;
        last_roll++;
    }
	public int hashcode() {
	return 505;
	}
	public String toString() {
		return "Basic Core Java";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example4 e4= new Example4();
		System.out.println(e4);
		System.out.println(e4.hashcode());
		TestSample t1= new TestSample();
		System.out.println(t1);
		
	}

}
