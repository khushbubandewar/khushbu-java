import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorArrayExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.add(90);
		l.add(564);
		l.add(909);
		l.add(89);
		l.add(13);
		Iterator i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Collections.sort(l);
		System.out.println(l);
	}

}
