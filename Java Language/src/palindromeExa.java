import java.util.Scanner;

public class palindromeExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Palindrome String : ");
		String str=sc.next();                                                                                                               
		
		int length = str.length();
		String str1 = str.substring(0, length/2);//str.substring(0,5);
		StringBuilder sb = new StringBuilder(str.substring(length/2+1, length));
		String str2 = sb.reverse().toString();
		if(str1.equals(str2)) {
			System.out.println(str+" String is  palindrome");
		}else {
			System.out.println(str+"  String is not palindrome");
		}
//		String[] strArr =str.split("");
//		boolean palindrome = true;
//		int length = strArr.length;
//		for(int i=0; i<length/2;i++) {
//			if(!strArr[i].toUpperCase().equals(strArr[length-i-1].toUpperCase())){
//				 palindrome = false;
//						break;
//			}
//			
//		}
//		if(palindrome) {
//			System.out.println(str+" String is  palindrome");
//		}else {
//			System.out.println(str+"  String is not palindrome");
//		}
		
				
	}

}
