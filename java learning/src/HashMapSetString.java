import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class HashMapSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new TreeSet(new AlphabetComparator());
		set.add("boll");
		set.add("cat");
		set.add("apple");
		set.add("dog");
		set.add("fish");
		for (String str : set) {
			System.out.println(str);
		}
	}
}


