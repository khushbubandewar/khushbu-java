
public class LoopExampl3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] vowels  = {'a','e','i','o','u'};
		for(int i=0;  i<vowels.length; i++) {
			System.out.println(vowels[i]);
		}
		
		for(char value:vowels) {
			System.out.println(value);
		}
	}

}
