import java.util.Scanner;

public class CpitalStringFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter an String Sentence : ");
		String str=new String();
		str="this is a program of String";
		String[] strArr =str.split(" ");
		StringBuilder  sb = new StringBuilder();
		for(int i=0;i<strArr.length; i++) {
			String str1  = strArr[i];
			String[] str1Arr =str1.split("");
			for(int j=0; j<str1Arr.length; j++) {
				if(j==0) {
					sb.append(str1Arr[j].toUpperCase());
				}else {
					sb.append(str1Arr[j]);
				}
			}
			sb.append(" ");			
		}
		System.out.println(sb.toString());
	}

}
