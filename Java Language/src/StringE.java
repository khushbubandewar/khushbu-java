import java.awt.List;
import java.util.ArrayList;

public class StringE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a program of string";
		String[] strr = str.split(" ");

		for (String s : strr) {
			System.out.println(s +"  "+ s.length());

			int length = s.length();
			System.out.println(length);
		}

	}

}
