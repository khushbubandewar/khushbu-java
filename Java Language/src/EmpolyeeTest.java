import java.util.LinkedList;

public class EmpolyeeTest {

	private static int size;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> l = new LinkedList<Employee>();

		Employee employee = new Employee();
		employee.setName("Anil");
		employee.setDepartment("CS");
		employee.setID(12345);
		employee.setAddress("Banglore");
		employee.setPhoneNo(987876899);

		Employee employee1 = new Employee();
		employee1.setName("Gudiya");
		employee1.setDepartment("EC");
		employee1.setID(67890);
		employee1.setAddress("Nagpur");
		employee1.setPhoneNo(87654321);

		l.add(employee);
		l.add(employee1);

		for (Employee emp : l) {
			System.out.println("Employee Data" + emp);
		}
		
		int size = l.size();
		for(int i=0; i<size; i++) {
			System.out.println(" Employee "+i+" Value "+l.get(i));
		}
	}

}
