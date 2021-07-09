import java.util.Comparator;

public class CollegeExBranchComparator implements Comparator<College> {
	 public int compare(College obj1,College obj2) {
		String s1=obj1.getBranch();
		String s2=obj2.getBranch();
		return -s1.compareTo(s2);				
	}
}
