
public class StringSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is program  of String start With method";
		
		if (str.startsWith("This") == true) {
			System.out.println("String Strats with This :" + true);
		} else {
			System.out.println("String does not Starts with This :" + false);
		}

		if (str.endsWith("method") == true) {
			System.out.println("String ends with method :"+true);
		} else {
			System.out.println("String ends with method :"+false);
		}

	}

}
