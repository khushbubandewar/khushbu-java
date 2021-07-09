import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("1", "a");
		hm.put("3", "a");
		hm.put("abc","sfsdsfsdf");
		
		//1
		System.out.println("====iterator=====");
		Set<String> set = hm.keySet();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String key =  itr.next();
			System.out.println("Key-"+key+" Value-"+hm.get(key));
		}
		//2
		System.out.println("====Enhanced for loop=====");
		for(String key : set) {
			System.out.println("Key-"+key+" Value-"+hm.get(key));
		}
		
		//3
		System.out.println("====iterator=====");
		Set<Entry<String,String>> set1 =  hm.entrySet();
		Iterator<Entry<String,String>> itr1 = set1.iterator();
		while(itr1.hasNext()) {
			Entry<String,String> entry =  itr1.next();
			System.out.println("Key-"+entry.getKey()+" Value-"+entry.getValue());
		}
		//4
		System.out.println("====Enhanced for loop=====");
		for(Entry<String,String> entry : set1) {
			System.out.println("Key-"+entry.getKey()+" Value-"+entry.getValue());
		}
		//5
		Collection<String> col = hm.values();
		for(String value : col) {
			System.out.println(value);
		}
	}

}
