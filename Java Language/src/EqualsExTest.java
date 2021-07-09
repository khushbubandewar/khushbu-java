
public class EqualsExTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualsEx E1 = new EqualsEx(111, "khushbu");
		EqualsEx E2 = new EqualsEx(222, "Muskan");
		EqualsEx E3 = new EqualsEx(333, "Xxxx");
		EqualsEx E4 = new EqualsEx(444, "Yyyy");
		EqualsEx E5 = E1;

		System.out.println(E5.equals(E1));
		System.out.println(E5.equals(E2));
		System.out.println(E5.equals(E3));
		System.out.println(E5.equals(E4));
	}

}
