import java.util.Scanner;

public class LoopDynamicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  length = Integer.parseInt(args[0]);
//		System.out.println("Enter  length of pyramid : ");
//		Scanner sc = new Scanner(System.in);
//		int length =sc.nextInt();
		
		for(int i=length; i>=0; i--) {
			for(int j=length; j>=i-length; j--) {
				System.out.print(" ");
			}
			for(int k=i; k>=1; k--) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

}