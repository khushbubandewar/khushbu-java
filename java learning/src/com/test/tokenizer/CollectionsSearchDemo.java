package com.test.tokenizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al= new ArrayList();
		al.add("m");
		al.add("h");
		al.add("z");
		al.add("c");
		al.add("f");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, "z"));
		System.out.println("------------------------------------------------");
		int[] a= {12,898,47,999,73};
		for(int a1:a) {
			System.out.println(a1);
			}
		System.out.println("------------------------------------------------------");
		Arrays.sort(a);
		System.out.println(a);
		for(int a1:a) {
			System.out.println(a1);
		}
	}

}
