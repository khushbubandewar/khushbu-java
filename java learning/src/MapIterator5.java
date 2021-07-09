import java.util.Collection;
import java.util.HashMap;

public class MapIterator5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> m = new HashMap<String,String>();
		m.put("0", "K");
		m.put("1", "H");
		m.put("2", "U");
		m.put("3", "S");
		m.put("4", "H");
		m.put("5", "B");
		m.put("6", "U");
		Collection<String> c = m.values();
		for(String s: c) {
			System.out.println(s);
		}
	}

}
