import java.util.ArrayList;
import java.util.Iterator;

public class StringExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "String Example";
		String[] strr = str.split("");

		 for(int i=str.length();i>0;i--) {
		 System.out.print(str.charAt(i-1));
		 }

		 for(int i=strr.length; i>0; i--) {
		 System.out.print(strr[i-1]);
		 }

	}
}