import java.util.Scanner;

public class CountWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String  : ");
		String str = sc.next();
		String[] strArr=str.split(" ");
		for(String sr:strArr) {
			System.out.println(sr.length());
		}
		System.out.println("Count  the words of String  : "+strArr.length); 
		
	}
//this is khushbu and i am a good girl
//This Is Khushbu And I am a Good Girl
}
