import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList AL = new ArrayList();
		AL.add("k");
		AL.add(1);
		AL.add("*");
		AL.addAll(AL);
		AL.add(8);
		AL.add("u");
		AL.add(null);
		System.out.println(AL);
		AL.remove(1);
		System.out.println(AL);
		AL.removeAll(AL);
		System.out.println(AL);
		
	LinkedList L  = new LinkedList();
	L.add("k");
	L.add(1);
	L.add("*");
	L.addAll(AL);
	L.add(8);
	L.add("u");
	L.add(null);
	System.out.println(L);
	L.set(3, "khushbu");
	L.addFirst("xxxxxx");
	System.out.println(L);
	L.removeLast();
	System.out.println(L);
	L.removeAll(L);
	System.out.println(L);
	
	}

}
