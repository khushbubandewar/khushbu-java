import java.util.*;
public class TeacherDOB {

	private static int size;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Teacher> al = new ArrayList<Teacher>();
		
		Teacher teacher = new Teacher();
		teacher.setName("Khushbu");
		teacher.setFatherName("ABC");
		teacher.setAddress("DYTTT");
		teacher.setAge(50);
		teacher.setID(1234);
		
		Teacher teacher1 = new Teacher();
		teacher1.setName("Muskan");
		teacher1.setFatherName("fdghyu");
		teacher1.setAddress("vvcgjh");
		teacher1.setAge(28);
		teacher1.setID(334564);
		
		Teacher teacher2 = new Teacher();
		teacher2.setName("Bittu");
		teacher2.setFatherName("ftynh");
		teacher2.setAddress("cgfh");
		teacher2.setAge(45);
		teacher2.setID(365778);		
		
		Teacher teacher3 = new Teacher();
		teacher3.setID(4567);
		teacher3.setAddress("Mohkhed");
		teacher3.setAge(87);
		teacher3.setFatherName("kjhujnj");
		teacher3.setName("nchgy");
	   
		Teacher teacher4 = new Teacher();
		teacher4.setAge(20);
		teacher4.setName("gyyfddd");
		teacher4.setAddress("iiwyrrqkx");
		teacher4.setFatherName("mxnvhiuy");
		teacher4.setID(446609);
		
		al.add(teacher);
		al.add(teacher1);
		al.add(teacher2);
		al.add(teacher3);
		al.add(teacher4);
		 
		int size = al.size();
		for(int i =0 ; i<size;i++) {
			System.out.println("Index "+i+" Value"+al.get(i));
			
		}
		
		for(Teacher teach : al) {
			System.out.println("Enhance For loop"+teach);	
		}
				
	}

}
