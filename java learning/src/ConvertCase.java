import java.util.Scanner;

public class ConvertCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter any string : ");
		str=sc.next();
		System.out.println("Given string is : "+str);
		System.out.println("Given string is : "+str.toLowerCase());
		System.out.println("Given string is : "+str.toUpperCase());
	}

}
