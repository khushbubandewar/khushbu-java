import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIterator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> m = new HashMap<String, String>();
		m.put("5", "five");
		m.put("4", "four");
		m.put("3", "three");
		m.put("2", "two");
		m.put("1", "one");
		
		Set<String> set = m.keySet();
		for(String s : set) {
			System.out.println(s+"  "+m.get(s));
		}
	}

}
