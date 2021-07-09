import java.util.TreeSet;
import com.test.tokenizer.Student;

public class StudentEx1 {

	public static void main(String[] args) {
		TreeSet<Student> treeSet1 = new TreeSet<Student>(new StNameComparator());
		TreeSet<Student> treeSet2 = new TreeSet<Student>(new StAddressComparator());
		TreeSet<Student> treeSet3 = new TreeSet<Student>(new StRollNoComparator());

		Student s1 = new Student();
		s1.setAddress("s");
		s1.setName("bittu");
		s1.setRollNo(59);

		Student s2 = new Student();
		s2.setAddress("indore");
		s2.setName("khushbu");
		s2.setRollNo(67);

		Student s3 = new Student();
		s3.setAddress("bhopal");
		s3.setName("muskan");
		s3.setRollNo(21);

		Student s4 = new Student();
		s4.setAddress("banglore");
		s4.setName("ghfhgfhg");
		s4.setRollNo(12);

		treeSet1.add(s1);
		treeSet1.add(s2);
		treeSet1.add(s3);
		treeSet1.add(s4);
		treeSet2.add(s1);
		treeSet2.add(s2);
		treeSet2.add(s3);
		treeSet2.add(s4);
		treeSet3.add(s1);
		treeSet3.add(s2);
		treeSet3.add(s3);
		treeSet3.add(s4);
		System.out.println(treeSet1);
		System.out.println(treeSet2);
		System.out.println(treeSet3);
	}

}
