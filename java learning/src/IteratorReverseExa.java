import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorReverseExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add('h');
		al.add("aa");
		al.add("bb");
		al.add("cc");
		al.add(13);
		Iterator i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		LinkedList l = new LinkedList();
		l.addAll(al);
		System.out.println(l);
//		Collections.reverse(l);
//		System.out.println(l);
		
		for(int j=l.size()-1; j>0; j--) {
			System.out.println(l.get(j));
		}
		
	}

}

