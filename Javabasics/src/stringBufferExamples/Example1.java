package stringBufferExamples;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1= new StringBuffer();
		System.out.println(s1.capacity());
		s1.append("Java");
		System.out.println(s1);
		s1.append(" Hi, I am Hemant , I am from Raver");
		System.out.println(s1);
		System.out.println(s1.length());
		s1.append(" & Hi, I Am Shaurya, My father name is Hemant");
		System.out.println(s1);
		System.out.println(s1.length());
		StringBuffer s2=new StringBuffer("Hello Java");
		StringBuffer s3=new StringBuffer("Hello Java");
		System.out.println(s2);
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		System.out.println(s2.toString().equals(s3.toString()));
		System.out.println(s2.toString());
	
		
		
	}

}
