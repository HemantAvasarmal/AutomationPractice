package vectorExamples;

import java.util.Vector;

public class Example0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vec=new Vector();
		vec.add("Hemant");
		vec.add(23);
		vec.add("Shaurya");
		System.out.println(vec);
		System.out.println(vec.capacity());
		System.out.println(vec.size());
		System.out.println(vec.isEmpty());
		System.out.println(vec.remove(1));
	}

}
