import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String  :  ");
		String str = new String();
		str = sc.nextLine();

		StringTokenizer st = new StringTokenizer(str, " ");
		String reverseLine = "";
		while (st.hasMoreTokens()) {
			reverseLine = st.nextToken() + " " + reverseLine;
		}
		System.out.print(reverseLine);

	}
}
