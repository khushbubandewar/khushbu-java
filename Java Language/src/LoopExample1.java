
public class LoopExample1 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum=0;
		 for(int i=1; i<=1000; i++) {
			sum = sum+i;
			 if( i%2==0) {
				 System.out.println("even number"+i);
			 }else {
				 System.out.println("odd number"+i);
			 }
		 }
		 System.out.println("Sum = "+sum);
	}
	

}
