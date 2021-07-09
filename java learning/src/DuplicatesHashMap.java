import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ThIs is a program to fine Duplicates in the given string sentance";
		String[] strArr = str.split("");
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].trim().isEmpty()) {
				continue;
			}
			if (map.get(strArr[i]) == null) {
				map.put(strArr[i], 1);
			} else {
				map.put(strArr[i], map.get(strArr[i]) + 1);
			}
		}
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
