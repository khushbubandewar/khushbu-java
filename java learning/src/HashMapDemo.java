import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> h = new HashMap();
		h.put("aa", 1111);
		h.put("bb", 222);
		h.put("cc", 333);
		h.put("ddgf", 769);
		//h.put("fjht", "376698");
		System.out.println(h);
		//System.out.println(h.put("aa", "hutkjbkjg"));
		Set s=h.keySet();
		System.out.println(s);
		Collection c = h.values();
		System.out.println(c);
		Set  s1 = h.entrySet();
		Iterator i=s1.iterator();
		while(i.hasNext()) {
			Map.Entry m = (Map.Entry)i.next();
			System.out.print(m.getKey()+"   "+m.getValue());
			if(m.getKey().equals("bb")) {
				m.setValue("dfgthyjukjhgf");
			}
			System.out.println(m);
		}
				
	}

}
