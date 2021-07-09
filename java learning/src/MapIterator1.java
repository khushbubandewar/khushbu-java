import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> m = new HashMap<String,String>();
		m.put("1", "First");
		m.put("2", "Second");
		m.put("3", "Third");
		m.put("4", "Forth");
		m.put("5", "Fifth");
		Set<String> s = m.keySet();
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			String key=itr.next();
			System.out.println(key+"  "+m.get(key));
		}
	}

}
