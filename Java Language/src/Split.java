import java.util.ArrayList;
import java.util.Iterator;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =  "This is a program of split example";
		String[] strArr = str.split(" ");
	    ArrayList al = new ArrayList();
	  
		
		for(String str1 : strArr) {
			//System.out.println(str1);
			al.add(str1);
			
			
		}
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			String s =(String)itr.next();
			System.out.println(s);
		}
		int size =al.size();
		for(int i=0; i<size; i++) {
			System.out.println("String value : "+al.get(i));
		}
	}

	
	
	
	
	
	
	
}
