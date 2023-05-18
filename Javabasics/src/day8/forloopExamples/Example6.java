package day8.forloopExamples;

public class Example6 {

	public static void main(String[] args) {
	    for(int i=1; i<3;++i) {
	      System.out.println("hello i:"+i);
			for(int j=0; j<2; j++) {
				System.out.println("hi j:"+j);
				 for(int k=0; k<2; k++) {
					 System.out.println("bye k:"+k);
				 }
			}
	    }
	}
}
		