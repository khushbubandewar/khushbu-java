import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector V = new Vector();
		System.out.println(V.capacity());
	
		for(int i=0; i<10; i++) {
			V.addElement(i);
		}
		System.out.println(V.capacity());
		V.addElement("khushbu");
		System.out.println(V.capacity());
		System.out.println(V);
		V.addElement("Rameshvar");
		System.out.println(V.capacity());
		System.out.println(V);
		V.addElement("Bandewar");
		System.out.println(V.capacity());
		System.out.println(V);
	}

}
