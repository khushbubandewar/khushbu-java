import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1=new Student("Khushbu",001);
		Student S2=new Student("xxxxx",702);
		List<Student> studentList = new ArrayList<>();
		studentList.add(S1);
		studentList.add(S2);
		Student S3=new Student("abc",123);
		Student S4=new Student("def",456);
		List<Student> studentList1 = new ArrayList<>();
		studentList1.add(S3);
		studentList1.add(S4);
		for(Student student : studentList) {
			System.out.println("Data of studentList   "+student);
		}
		studentList.addAll(studentList1);
//		for(Student student : studentList1) {
//			studentList.add(student);
////			System.out.println("Data of studentList1   "+student);
//		}
		
		for(Student student : studentList) {
			System.out.println("After adding Data of studentList   "+student);
		}
	}
	

}