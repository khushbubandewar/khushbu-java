import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.add("theSDY");
		l.add("qwer");
		l.add("kjhg");
		l.add("h");
		LinkedList l1 = new LinkedList();
		l1.add("theSDY");
		l1.add("qwer");
		l1.add("kjhg");
		l1.add("h");
		l.addAll(l1);
		System.out.println("Print list   "+l);
		int size= l.size();
		System.out.println("SIZE  "+size);
		Iterator iterator= l.iterator();
		while(iterator.hasNext()) {
			String s = (String)iterator.next();
			System.out.println("Iterator printing  element : "+s.toUpperCase());
		}
		System.out.println("ITERETOR  "+l);
		l.add(2, "eeeeee");
		System.out.println("ADD  "+l);
		l.addLast("m");
		System.out.println("ADDLAST  "+l);
		//l.clone();
		//System.out.println("CLONE   "+l);

		System.out.println("CONTAINS  "+l.contains("m"));
		//l.descendingIterator();
		//System.out.println("REVRSE  "+l);
		
		 l.remove("h");
		System.out.println("REMOVE  "+l);
	
		System.out.println("GETFIRST  "+	l.getFirst());
		
		System.out.println("GETLAST  "+l.getLast());
		
		System.out.println("GET  "+l.get(3));
		int hashcode=l.hashCode();
		System.out.println("HASHCODE  "+hashcode);
		boolean isEmpty = l.isEmpty();
		System.out.println("EMPTY   "+isEmpty);
		//l.listIterator();
		//System.out.println("ITERATOR  "+l);
//		l.notify();
//		System.out.println("NOTIFY  "+l);
		l.indexOf(4);
		System.out.println("INDEXOF  "+l);
		
	}

}
