package practicePrograms.forloop;
		
public class Example3 {
	//Display sum of n Natural Numbers.	
	public static void main(String[] args) {
		//numbers=1+2+3+....+n
		int num=6,sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("sum="+sum);
	}
}
