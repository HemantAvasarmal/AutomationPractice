package day12.inheritances;
class A1{
	static int a=10;
	int b=20;
	double c=13.45;
}
class B1 extends A1{
	static int x=23;
	int y=77;
	double z=67.13;
}
public class inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Static member of both class access:
		System.out.println("class A1 static int member="+A1.a);
		System.out.println("class B1 static int member="+B1.x);
		//non-static member of both class access:
		A1 a= new A1();
		System.out.println("class A1 non-static int member="+a.b);
		System.out.println("class A1 non-static double member"+a.c);
		B1 b=new B1();
		System.out.println("Class B1 non-static int member"+b.y);
		System.out.println("class b1 non-static double member="+b.z);
		System.out.println("class A1 non-static int member="+b.b);
		System.out.println("class A1 non-static double member="+b.c);
	}

}
