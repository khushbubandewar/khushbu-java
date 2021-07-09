import java.util.Scanner;

public class CapitalFirstWordInLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sentence Here  :  ");
		String str=sc.nextLine();
		String upper_case_line ="";
		 Scanner strScan  = new Scanner(str);
		 while(strScan.hasNext()) {
			 String  word= strScan.next();
			 upper_case_line=upper_case_line+Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
			 
		 }
		 System.out.println("Sentence After Convert  :  "+upper_case_line);
	}

}
