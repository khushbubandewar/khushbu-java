import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String  : ");
		str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			String strWord = strArr[i];
			String[] strWordArr = strWord.split("");
			for (int j = 0; j < strWordArr.length; j++) {
				if (j == 0) {
					sb.append(strWordArr[j].toUpperCase());
				} else {
					sb.append(strWordArr[j]);
				}
			}
			sb.append(" ");

			System.out.println(sb.toString());

			// String sentence = "";
			// String[] strArr = str.split(" ");
			/*
			 * for (int i=0; i<strArr.length; i++) { String word = ""; String strWord =
			 * strArr[i]; String[] strWordArr = strWord.split(""); for(int j=0;
			 * j<strWordArr.length; j++) { if(j==0) { word = strWordArr[j].toUpperCase();
			 * }else { word = word + strWordArr[j]; }
			 * 
			 * } sentence = sentence + word+" "; System.out.print(word);
			 * System.out.print(" ");
			 * 
			 * }
			 */
			/*
			 * for (int i=0; i<strArr.length; i++) { //String word = ""; String strWord =
			 * strArr[i]; System.out.print(strWord.replace(strWord.charAt(0),
			 * String.valueOf(strWord.charAt(0)).toUpperCase().charAt(0))+" "); }
			 */

		}
	}
}
