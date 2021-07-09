
public class ImmutableMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String S = new String("khushbu");
		//S.concat("Software");
		//System.out.println(S);
		//StringBuffer S1 = new StringBuffer("khushbu");
		//S1.append("Software");
		//System.out.println(S1);
		
		String S1 = new String("khushbubandewar");
		String S2 = new String("khushbubandewar");
		System.out.println(S1==S2); //false
		
		String S3 = "khushbubandewar";
		String S4 = "khushbubandewar";
			
		System.out.println(S1==S4); //false
		System.out.println(S1.equals(S4));  //true
		
		System.out.println(S1==S3);    				//false
		System.out.println(S1.equals(S3));   //true
		
		String S5 = "khushbu"+"bandewar";
		System.out.println(S3==S5);  //true
		System.out.println(S3.equals(S5));   //true
		
		String S6 = "khushbu";
		String S7 = S6+"bandewar";
		System.out.println(S7==S3);  //false
		System.out.println(S7.equals(S3));  //true
		
		final String S8 = "khushbu";
		String S9 = S8+"bandewar";
		System.out.println(S3==S9);  //true
		System.out.println(S3.equals(S9)); //true
		
		
		System.out.println(S8==S6);  //true
		System.out.println(S7==S9);
		
	}
	
}