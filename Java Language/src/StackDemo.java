import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack S = new Stack();
		S.push("A");
		S.push(1);
		S.push("C");
		S.push("D");
		S.push("E");
		S.push("F");
		System.out.println(S);
		S.pop();
		System.out.println(S);
		S.peek();
		System.out.println(S);
		System.out.println(S.search("p"));
		System.out.println(S.empty());
	}

}
