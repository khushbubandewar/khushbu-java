import java.util.ArrayList;
import java.lang.StringBuffer;
public class StringBufferExa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		StringBuffer str = new StringBuffer( );
		String str1 = "The program of StringBufferExa1";
		String[] strr = str1.split(" ");
		ArrayList al = new ArrayList();
		al.add(str1);
		
		for(String st : strr) {
			System.out.println(st.length());
		}
		
		
		int size =  al.size();
		for(int i=0;i<size;i++) {
			System.out.println("Print  :  "+al.get(i));
		}
	}

}
