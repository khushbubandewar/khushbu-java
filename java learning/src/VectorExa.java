import java.util.Vector;

public class VectorExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v= new Vector();
		v.capacity();
		System.out.println(v);

		v.add(989);
		v.add("fghjk");
		v.add("rtyuijk");
		System.out.println(v);
		v.get(1);
		
		System.out.println(v);
		v.clear();
		System.out.println(v);

		
		
	}

}
