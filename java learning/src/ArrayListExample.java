import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al= new ArrayList();
		al.add(122);
		al.add("string");
		al.add("a");
		al.add(10);
		System.out.println(al);
		al.remove(0);
		al.add(1,2);
		ArrayList al1 = new ArrayList(al);
		System.out.println(al);
		
	}

}
