package com.test.tokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokanizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StringTokenizer st = new StringTokenizer("");
		// while(st.hasMoreElements()) {
		// String token = st.nextToken();
		// System.out.println(token+" ");
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();		
		StringTokenizer st = new StringTokenizer(str," ");
		while (st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}

// }
