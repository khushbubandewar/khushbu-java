import java.util.ArrayList;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =  "The program of StringEx1 ";
		String[] strr = str.split(" ");
		ArrayList al = new ArrayList();
		al.add(str);
		
		for(String s :strr) {
			System.out.println(s);
		}
		
		int size=al.size();
		for(int i=0;i<size;i++) {
			System.out.println("Print  :  "+al.get(i));
		}
		
	}

}
