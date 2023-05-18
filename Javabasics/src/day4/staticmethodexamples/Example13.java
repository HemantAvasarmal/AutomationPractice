package day4.staticmethodexamples;

public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	displayAdressInfo("78","Shrikrushna nagar","Raver");
		calling(1234);
	}
	public static void displayAdressInfo(String plot,String area,String city) {
		System.out.println("Plot no :"+plot);
		System.out.println("Area :"+area);
		System.out.println("city :"+city);
	}
	static void calling(int num) {
		System.out.println("\ncalling number is :"+num);
	}

}
