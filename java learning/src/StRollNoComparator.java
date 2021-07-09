import java.util.Comparator;

import com.test.tokenizer.Student;

public class StRollNoComparator implements Comparator<Student> {
	public int compare(Student student1, Student student2) {
		Long i1 = (long) student1.getRollNo();
		Long i2 = (long) student2.getRollNo();;
		return -i1.compareTo(i2);
	
	}
}
