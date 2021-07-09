import java.util.Comparator;

public class CollegeExCodeComparator implements Comparator<College>{
	public int compare(College obj1,College obj2) {
		Integer s1 =obj1.getCode();
		Integer s2=obj2.getCode();
		return s1.compareTo(s2);
		
	}
}
