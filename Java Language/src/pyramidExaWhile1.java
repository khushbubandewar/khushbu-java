import java.util.Scanner;

public class pyramidExaWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the length of pyramid : ");
		int length = sc.nextInt();
		int i=length;
		while(i>=1) {
			int j=1;
			while(j>=i-length) {
				System.out.print(" ");
				j--;
			}
			int k=i;
			while(k>=1) {
				System.out.print(" * ");
				k--;
			}
			System.out.println(" ");
			i--;
		}
	}

}
