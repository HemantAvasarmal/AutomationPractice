package day6.operators;

public class UnaryExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 55, b;
			b = a++;//
			int x = a, y;//
			System.out.println(x);// 
			y = ++x;// 
			System.out.println(a);// 
			System.out.println(b);// 
			System.out.println(x);// 
			System.out.println(y);// 
			
			int p = -10, q = 20, res;

			res = p++ + --q;// res = 
			System.out.println("res: " + res);// 
			System.out.println("p: " + p);// 
			System.out.println("q: " + q);// 
			System.out.println("*****************************");
			int res1 = ++p + ++q;// res1 =
			System.out.println(res1);// 
			System.out.println("p: " + p);// 
			System.out.println("q: " + q);//

	}

}
