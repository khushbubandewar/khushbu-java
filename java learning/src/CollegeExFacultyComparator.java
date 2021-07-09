import java.util.Comparator;

public class CollegeExFacultyComparator implements Comparator<College> {
	public int compare(College obj1,College obj2) {
		String s1 =obj1.getFaculty();
		String s2 =obj2.getFaculty();
		return s1.compareTo(s2);
		}

}
