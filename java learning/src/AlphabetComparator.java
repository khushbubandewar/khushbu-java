import java.util.Comparator;


public	class AlphabetComparator implements Comparator {
		public int compare(Object obj1, Object obj2) {
			String s1 = (String) obj1;
			String s2 = obj2.toString();
			return -s1.compareTo(s2);

		}

	}

