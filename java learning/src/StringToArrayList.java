import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This Is A Program Of String ";
		Object[] objAr = new Object[10];
	    List<String> list1 = Arrays.asList("a","b","c","d");
		List<String> list = Arrays.asList(str.split(" "));
		List<String> strList = new ArrayList<>();
		String[] strArr = str.split(" ");
		for(int i=0; i<strArr.length; i++) {
			strList.add(strArr[i]);
			System.out.println(strList.get(i));
		}
//		for(int i=0; i<strArr.length; i++) {
//			System.out.println(strList.get(i));
//		}
		for(String s : strList) {
			System.out.println(s);
		}
		
	}

}
