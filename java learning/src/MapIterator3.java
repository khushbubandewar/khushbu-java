import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapIterator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String > m = new HashMap<String,String>();
		m.put("99", "a");
		m.put("67", "v");
		m.put("8", "f");
		m.put("90", "e");
		m.put("56", "a");
		Set<Entry<String,String>> set = m.entrySet();
		Iterator<Entry<String,String>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<String,String> entry = itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
			
		}
		
		
		
	}

}
