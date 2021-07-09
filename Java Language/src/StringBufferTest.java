
public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("Durga").insert(3, "xysdfghjz").reverse().delete(7, 8).append("solution");
		System.out.println(sb);
		
		final StringBuffer sb1 = new StringBuffer("magic");
//		sb1=new StringBuffer("ooooo");
		sb1.append("MAGIC");
		System.out.println(sb1);
	}

}
