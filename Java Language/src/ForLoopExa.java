
public class ForLoopExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] a = { { "kj", "hf","gh", "lp","er" }, { "fd", "hg", "se", "fg" } };
		for (String[] obj : a) {
			 for(String obj1: obj) {
			 System.out.println("Enhance for loop  :  "+obj1);
			 }
			 }
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.println("for loop  :  "+a[i][j]);
				}
			}
		}

	}

