import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class palindromeExa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner sc=new Scanner(System.in);
		// int length=sc.nextInt();
		String strsen = "This is NITIN and i am testing palindrome word";
		String[] senArr = strsen.split(" ");
		boolean palindrome = true;
		for (int i = 0; i <= senArr.length; i++) {
			String palincheck = senArr[i];
			String[] senArr1 = palincheck.split(" ");
			for (int i1 = 0; i1 <= senArr1.length / 2; i1++) {
				if (!senArr1[i1].equals(senArr1[senArr1.length - i1 - 1])) {
					palindrome = false;
					break;
				}
			}
			if (palindrome) {
				System.out.println("it is palindrome");
			} else {
				System.out.println("it is not a palindrome");
			}
		}
	}
}
