package collectionList;

import java.util.ArrayList;
import java.util.List;

public class Example0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1= new ArrayList();
		l1.add(123);
		l1.add("Hemant");
		l1.add(34.87);
		l1.add(true);
		l1.add("Hemant");
		l1.add(4,"Shaurya");
		System.out.println("Element list :"+l1);
		System.out.println("Element size :"+l1.size());
		System.out.println(l1.get(2));
		System.out.println("**********************************");
		List l2= new ArrayList();
		l2.add(45);
		l2.add("Shaurya");
		l2.add(false);
		l2.add(null);
		l2.add(67.34);
		System.out.println("List2 Elements size :"+l2.size());
		System.out.println("List2 Elements are :"+l2);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		l2.addAll(l1);
		System.out.println("Adding List :"+l2);
		System.out.println("#####################################");
		l1.addAll(l2);
		System.out.println(l1);
		System.out.println(l1.get(6));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		for(int i=0;i<=l1.size();i++) {
		System.out.println("Element at:"+i+"List Element"+l1);
		l1.removeAll(l2);
		System.out.println(l1);
		System.out.println(l2.size());
		System.out.println(l2);
		l2.set(2, true);
		System.out.println(l2);
		System.out.println(l2.isEmpty());
		System.out.println(l1.isEmpty());
		l1.add(2337);
		l1.add("Pune");
		l1.add("shaurya");
		l1.add(true);
		System.out.println(l1.isEmpty());
		System.out.println(l1.size());
				
		}
	}
}
