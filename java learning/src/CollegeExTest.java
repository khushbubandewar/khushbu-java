import java.util.TreeSet;

public class CollegeExTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<College> t = new TreeSet<College>(new CollegeExBranchComparator());
		TreeSet<College> t1 = new TreeSet<College>(new CollegeExSalaryComparator());
		TreeSet<College> t2 = new TreeSet<College>(new CollegeExFacultyComparator());
		TreeSet<College> t3 = new TreeSet<College>(new CollegeExCodeComparator());
		
		College c =new College();
		c.setBranch("CSE");
		c.setCode(040);
		c.setFaculty("abc");
		c.setSalary(987);
		
		College c1 =new College();
		c1.setBranch("IT");
		c1.setCode(540);
		c1.setFaculty("ghf");
		c1.setSalary(5627);
		
		College c2 =new College();
		c2.setBranch("CIVIL");
		c2.setCode(194);
		c2.setFaculty("jho");
		c2.setSalary(1000);
		
		College c3 =new College();
		c3.setBranch("EC");
		c3.setCode(023);
		c3.setFaculty("vbny");
		c3.setSalary(500);
		
		t.add(c);
		t.add(c1);
		t.add(c2);
		t.add(c3);		
		t1.add(c);
		t1.add(c1);
		t1.add(c2);
		t1.add(c3);		
		t2.add(c);
		t2.add(c1);
		t2.add(c2);
		t2.add(c3);		
		t3.add(c);
		t3.add(c1);
		t3.add(c2);
		t3.add(c3);
		
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}

}
