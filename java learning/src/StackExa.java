import java.util.Stack;

public class StackExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.add(12);
		s.add(20);
		s.add(38);
		s.add(56);
		System.out.println(s);
		s.search(3);
		System.out.println(s);
		System.out.println(s.search(2));
		System.out.println(s.set(2, "wertyujkmnbgf"));
	}

}
