import java.util.ArrayList;
import java.util.LinkedList;

public class CollegeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<College> al = new ArrayList<College>();
		LinkedList<College> l = new LinkedList<College>();
		
		College clg = new College();
		clg.setUniversity("Rgpv");
		clg.setDepartment("CSE");
		clg.setBranch("CS");
		clg.setFaculty("xxxxx");
		clg.setCode(321);
		
		College clg1 = new College();
		clg1.setUniversity("Rgut");
		clg1.setDepartment("EC ");
		clg1.setBranch("EC");
		clg1.setFaculty("yyyyy");
		clg1.setCode(678);
		
		al.add(clg);
		al.add(clg1);
		
		l.add(clg);
		l.add(clg1);
		
		for (College collage : al) {
			System.out.println("Employee Data Using  ArrayList " + collage);
		}
		
		for(College college1:l) {
			System.out.println("Employeee Data Using LinkedList "+college1 );
		}
	
		int size=al.size();
		for(int i=1; i<size; i++) {
			System.out.println("  Collage  "+i+" Value "+al.get(i));
		}
	}

}
