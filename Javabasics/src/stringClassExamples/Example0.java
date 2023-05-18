package stringClassExamples;

public class Example0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Mumbai";
		System.out.println(""+s1);
		System.out.println(""+s1.length());
		System.out.println(""+s1.substring(2,5));
		String s2= new String("Mumbai");
		System.out.println(""+s2);
		String s3="Mumbai";
		System.out.println(""+s3);
		String s4="CorejavaBasics";
		System.out.println(s4);
		System.out.println(s4.length());
		System.out.println(s4.substring(3,9));
		System.out.println(s4.indexOf("java"));
		System.out.println(s4.indexOf("B"));
		System.out.println(s4.indexOf('J',7));
		System.out.println(s4.lastIndexOf('j',7));
		String s5="corejavaBasics";
		System.out.println(s4.equals(s5));
		System.out.println(s4.equalsIgnoreCase(s5));
		System.out.println(s4==s5);
		String s6= "singapur";
		System.out.println(s6);
		System.out.println(s6.toUpperCase());
		String s7=" SINGAPURA ";
		System.out.println(s7.toLowerCase());
		System.out.println(s7.length());
		System.out.println(s7);
		System.out.println(s7.trim());
		System.out.println(s7.trim().length());
		System.out.println(s7.trim().replace('b','a'));
		System.out.println(s7.replaceFirst("A","D"));
		System.out.println(s7.trim().replaceAll("A","Z"));
		System.out.println(s7.replace("nga","abc"));
		String s8= " Singapur is very beautiful ";
		System.out.println(s8);
		System.out.println(s8.replace("beautiful", "Bad"));
		System.out.println(s8.trim());
		System.out.println(s8.replace('a', 'b'));
		System.out.println(s8.trim());
		System.out.println(s8.trim().length());
		

	}

}
