import java.util.Scanner;

public class pyramidExaWhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  length of pyramid : ");
		int length = sc.nextInt();
		int i = 1;
		while (i <= length) {
			int j = 1;
			while (j <= length-i) {
				System.out.print(" ");
				j++;
			}

			int k = 1;
			while (k <= i) {
				System.out.print(" * ");
				k++;
			}
			System.out.println(" ");
			i++;
		}
	}
}
