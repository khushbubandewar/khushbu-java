import java.util.ArrayList;

public class StringBuilderE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This a program of StringBuilder";
		String[] s1 = s.split(" ");
		ArrayList al = new ArrayList();
		al.add(s);
		
		for(String obj:s1) {
			System.out.println(obj);
			System.out.println(obj.length());
		}
		
	}

}
