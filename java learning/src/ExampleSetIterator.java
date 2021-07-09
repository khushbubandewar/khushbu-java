import java.util.LinkedList;
import java.util.ListIterator;

public class ExampleSetIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l= new LinkedList<>();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("e");
		System.out.println(l);
		ListIterator litr = l.listIterator();
		while(litr.hasNext()) {
			String s = (String)litr.next();
			if(s.equals("b")) {
				litr.remove();
			}
			if(s.equals("c")) {
				litr.set("Cat");
			}
			if(s.equals("d")) {
				litr.add("-DOG");
			}
		}
		System.out.println(l);
	}

}
