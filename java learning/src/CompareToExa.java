
public class CompareToExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 =new String("ABC");
		String S2 =new String("LMN");
		
		System.out.println(S1.equals(S2));
		System.out.println(S2.equals(S1));
		
		System.out.println(S1==S2);
		System.out.println(S2==S1);
		
		System.out.println(S1.compareTo(S2));
		System.out.println(S2.compareTo(S1));
	}

}
