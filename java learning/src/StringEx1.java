
public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" ";
		char[] charArr= new char[]{'S','t','r','i','n','g','p','r','o','g','r','a','m'};
		str=new String(charArr);
		System.out.println("Print String  :  "+str);
		System.out.println("String Length   :  "+str.length());
		String str1="    TRIM  METHOD     ";
		System.out.println("before trim :"+str1);
		System.out.println("after trim    :"+str1.trim());
	}

}
