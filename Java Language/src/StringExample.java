import java.util.ArrayList;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Name Is Khushbu";//M - 0 y-1 N -2
		char[]charArr = str.toCharArray();
		char[]value = {'M','y',' ','N','a','m','e',' ','I','s',' ','K','h','u','s','h','b','u'};
		str.length();
		ArrayList al = new ArrayList();
		
		for(int i=0; i<str.length();i++) {
			System.out.println(str.charAt(i)+ " - "+i);
		}
		
		
		for(int i=str.length(); i>0; i--) {
			System.out.println(str.charAt(i-1)+ "  - "+i);
		}
		
		
		
	}

}
