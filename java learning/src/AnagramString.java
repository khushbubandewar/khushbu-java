import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S1 = new String();
		String S2 = new String();

		System.out.println("Enter First String  :  ");
		String str = sc.next();
		System.out.println("Enter Second String  :  ");
		String str1 = sc.next();

		char[] ArrayS1 = S1.toLowerCase().toCharArray();
		char[] ArrayS2 = S2.toLowerCase().toCharArray();
		Arrays.sort(ArrayS1);
		Arrays.sort(ArrayS2);
		
	
		boolean Anagram = Arrays.equals(ArrayS1, ArrayS2);  
		if (!(ArrayS1 == ArrayS2))
		{
			System.out.println("String is Anagram ");
		}
		else {
			System.out.println("String is not Anagram ");
		}
	}

}
