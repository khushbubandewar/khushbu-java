
public class StringSplitExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " this is a program of Split ";
		String[] arrstr;
		arrstr = str.split(" ");
		for(int i=0; i<=arrstr.length;  i++) {
			System.out.println(arrstr[i]);
	}
//		for(String s:arrstr) {
//			System.out.println(s);
//			System.out.println(s.length());
//			
//		}
	}

}
