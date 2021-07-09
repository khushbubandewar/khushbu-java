import java.util.Comparator;

import com.test.tokenizer.Student;

public class StAddressComparator implements Comparator<Student>{

	public int  compare(Student obj1,Student obj2) {
		String s1= obj1.getAddress();
		String s2=obj2.getAddress();
		return -s1.compareTo(s2);
	}
}

