import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable h =new Hashtable();
		h.put("1", "one");
		h.put("2", "two");
		h.put("5", "five");
		h.put("3", "three");
		h.put("0", "zero");
		Set<String> set =h.keySet();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			 String key=itr.next();
			 System.out.println(key+"  "+h.get(key));
		}
		System.out.println("------------------------------------------------------");
		Set<Entry<String,String>> set1 = h.entrySet();
		Iterator<Entry<String,String>> itr1 = set1.iterator();
		while(itr1.hasNext()) {
			Entry<String,String> entry = itr1.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		System.out.println("------------------------------------------------------");

		for(String str :set) {
			System.out.println(str+"  "+h.get(str));
		}
		System.out.println("------------------------------------------------------");

		for(Entry<String,String> entry:set1) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("------------------------------------------------------");

		Collection<String> c=h.values();
		System.out.println(c);
		
	}

}
