import java.util.Scanner;

public class StringLastValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String();
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter String  :  ");
		str=sc.next();
		int  index;
		index=str.lastIndexOf('h');
		System.out.println("Last index is  : "+index);
//		System.out.print(str.lastIndexOf(""));
	}

}
