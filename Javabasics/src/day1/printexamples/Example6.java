package day1.printexamples;

public class Example6 {
	public static void main(String [] args) {
	double res=simpleInterest(10000,7.5,12);
	System.out.println("simple Interest is="+res);
	double area=areaOfCircle(3.14,7);
	System.out.println("Area of circle is="+area);
	double res2=degreeToFahrenheit(28);
	System.out.println("DegreeCelciusToFahrenheit is="+res2);
	}
	
	public static double simpleInterest(int a, double b, int c) {
	System.out.println("a is Principle="+a);
	System.out.println("b is Rate of interest="+b);
	System.out.println("c is time="+c);
	double res=a*b*c/100;
	return res;
	}
	static double areaOfCircle(double pi, double r) {
		System.out.println("\n\nPi is="+pi);
		System.out.println("Redius is="+r);
		double area=pi*r*r;
		return area;
		
	}
	static double degreeToFahrenheit(double degreeCelcius) {
		System.out.println("\n\nDegreeCelcius is="+degreeCelcius);
		double res2=(degreeCelcius*1.8)+32;
		return res2;
	}
}