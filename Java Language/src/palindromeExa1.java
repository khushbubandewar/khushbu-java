import java.util.Scanner;

public class palindromeExa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String");
		String str = sc.next();
		String[] strArr = str.split("");
		boolean palindrome=true;
		
		for(int i=0; i<=str.length()/2; i++) {
			if(!strArr[i].equals(strArr[strArr.length-i-1])){
				palindrome=false;
				break;
			}
		}
		if(palindrome){
			System.out.println("it is palindrome");
		}else {
			System.out.println("it is not a palindrome");
		}
		
	}

}
