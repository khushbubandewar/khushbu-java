import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,str1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First String  : ");
		str=sc.next();
		System.out.println("Enter the Second String  : ");
		str1=sc.next();
		
		if(str.compareTo(str1)==0) {
			System.out.println(" String are Equal  ");
		}else {
			System.out.println(" String areABC not Equal   ");

		}

	}

}
