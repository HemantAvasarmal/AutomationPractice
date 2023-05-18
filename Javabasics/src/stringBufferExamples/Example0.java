package stringBufferExamples;

public class Example0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer("Hello ");
		System.out.println(sb);
		sb.append("java,");
		System.out.println(sb);
		sb.append(" I am Selenium.");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.delete(1,6));
		System.out.println(sb.replace(1,3,"Hemant"));
		System.out.println(sb.delete(0, 11));
		System.out.println(sb.reverse());
		System.out.println(sb.reverse());
		
	}

}
