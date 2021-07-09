import java.util.Comparator;

import com.test.tokenizer.Student;

public class StNameComparator implements Comparator<Student>{

	public int  compare(Student obj1,Student obj2) {
		String s1= obj1.getName();
		String s2=obj2.getName();
		return s1.compareTo(s2);
	}
}
