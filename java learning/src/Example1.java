import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :  ");
		String str = "";
		str = sc.nextLine();
		String[] strArr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strArr.length; i++) {
			String str1 = strArr[i];
			String[] strArr1 = str1.split("");
			for (int j = 0; j < strArr1.length; j++) {
				if (j==0) {
					sb.append(strArr1[j].toUpperCase());
				} else {
					sb.append(strArr1[j]);
				}
			}
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}

}
