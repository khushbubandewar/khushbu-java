import java.util.Scanner;

public class ConvertString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String Sentence  : ");
		String str = new String();
		str = sc.nextLine();
// This is an Example of String ";
		StringBuffer sb = new  StringBuffer(str);
//		sb = sb.append(str);
		System.out.println(" Print StringBuffer  :  "+sb);
		
		StringBuilder SB  = new StringBuilder(str);
		//SB = SB.append(str);
		System.out.println(" Print StringBuilder : "+SB);
	}

}
