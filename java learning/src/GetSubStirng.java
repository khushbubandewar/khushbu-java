import java.util.Scanner;

public class GetSubStirng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the String  : ");
		String str= new String();
		str=sc.next();
		
		System.out.print("Enter Start Index  : ");
		int startIndex = sc.nextInt();
		System.out.print("Enter End Index  : ");
		int EndIndex = sc.nextInt();
		
		String str1=str.substring(startIndex, EndIndex);
		System.out.print(" String is   : "+str1);

	}

}
