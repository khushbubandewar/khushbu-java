
public class StringReplaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="this is first String";
		String str1="this is second String";
		System.out.println("Before replacing String : ");
		System.out.println("String :"+str1);
		System.out.println("String :"+str);
		
		str1=str1.replace(str1, str);
		System.out.println("after replacing :");
		System.out.println("String :"+str1);
		System.out.println("String :"+str);
		
	}

}
