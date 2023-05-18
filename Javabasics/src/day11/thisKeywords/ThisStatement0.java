package day11.thisKeywords;

 class Test101{
	 Test101(){
		 System.out.println("Hello zero");
	 }
	 Test101(int i){
		 System.out.println("Hello int="+i);
	 }
	 Test101(double d){
		 System.out.println("Hello double d="+d);
	 }
 }
 public class ThisStatement0 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test101 t1=new Test101();
		Test101 t2=new Test101(34);
		Test101 t3=new Test101(67.87);
	}
 }	




