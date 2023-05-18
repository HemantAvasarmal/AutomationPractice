package stringBuilderExamples;

public class Example0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1= new StringBuilder("Hemant");
		System.out.println(s1);
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		s1.append(" Java");
		System.out.println(s1);
		System.out.println(s1);
		StringBuilder s2 =new StringBuilder("Shaurya");
		System.out.println(s2);
		StringBuilder s3 = new StringBuilder("Shaurya");
		System.out.println(s3);
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		System.out.println(s2.toString().equals(s3.toString()));
		s3.append(" is very Clever.");
		System.out.println(s3);
	}

}
