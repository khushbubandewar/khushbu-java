import java.util.HashMap;

public class IdentityHasMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap h=new HashMap();
		Integer i= new Integer(10);
		Integer i1= new Integer(10);
		h.put(i, "abc");
		h.put(i1, "xyz");
		System.out.println(h);
		
	}

}
