import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapIterator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> m = new HashMap<String,String>();
		m.put("a", "Apple");
		m.put("b", "Boll");
		m.put("c", "Cat");
		m.put("d", "Dog");
		m.put("e", "Elephant");
		Set<Entry<String,String>> set = m.entrySet();
		Iterator<Entry<String,String>> itr = set.iterator();
		for(Entry<String,String> entry:set) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
	}

}
