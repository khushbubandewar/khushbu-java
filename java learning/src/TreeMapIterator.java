import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> t = new TreeMap<>();
		t.put("a", "Apple");
		t.put("b", "Boll");
		t.put("c", "Cat");
		t.put("d", "Dog");
		t.put("e", "Elephat");
		
		Set<String> set = t.keySet();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String key =itr.next();
			System.out.println(key+" "+t.get(key));
		}
//		System.out.println("----------------------------------------------------");
//		
//		Set<Entry<String,String>> set1= t.entrySet();
//		Iterator<Entry<String,String>> itr1 = set1.iterator();
//		while(itr1.hasNext()) {
//			Entry<String,String> entry = itr1.next();
//			System.out.println(entry.getKey()+"  "+entry.getValue());
//					}
//	
//	
//		System.out.println("----------------------------------------------------");
//
//		for(Entry<String,String> entry:set1) {
//			System.out.print(entry.getKey()+"  "+entry.getValue());
//		}
//		
//		System.out.println("----------------------------------------------------");
//		
//		for(String key :set) {
//			System.out.println(key+"  "+t.get(key));
//		}
//		
//		System.out.println("----------------------------------------------------");
//	
//		Collection<String> c = t.values();
//		for(String obj :c ) {
//			System.out.println(obj);
//			
//			
//		}
		
			
	
	}
	
	
	
	

}
