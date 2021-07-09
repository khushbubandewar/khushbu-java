import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapIterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> l=new LinkedHashMap<String, String>();
		l.put("a", "Apple");
		l.put("b", "Boll");
		l.put("c", "Cat");
		l.put("d", "Dog");
		l.put("e", "Elephat");
		Set<String> set = l.keySet();
		Iterator<String> itr =set.iterator();
		while(itr.hasNext()) {
		String key =itr.next();
		System.out.println(key+"  "+l.get(key));
		}
		
		System.out.println("----------------------------------------------------");
		Set<Entry<String,String>> set1 = l.entrySet();
		Iterator<Entry<String,String>> itr1 = set1.iterator();
		while(itr1.hasNext()) {
			Entry<String,String> entry = itr1.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		System.out.println("----------------------------------------------------");
		
		for(Entry<String,String> entry:set1) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		System.out.println("----------------------------------------------------");
		
		Collection<String> c=l.values();
		for(String str:c) {
			System.out.println(str);
		}
	}

}
