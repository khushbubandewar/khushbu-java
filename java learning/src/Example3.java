
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		String str ="this is a program of string";
		String[] strArr=str.split("");
		System.out.println("Duplicate words in a String  :  ");
		for(int i=0; i<strArr.length; i++) {
			count=1;
			for(int j=i+1;j<strArr.length;j++) {
				if(strArr[i].equals(strArr[j])) {
					count++;
					strArr[j]="0";
				}
			}
			if(count>1 && strArr[i]!="0") {
				System.out.println(strArr[i]);
			}
			
		}
	}

}
