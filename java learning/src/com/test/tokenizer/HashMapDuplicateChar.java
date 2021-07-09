package com.test.tokenizer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The fundamental difference between WeakHashMap and other Map classes like HashMap, IdentityHashMap and EnumMap is that its keys are WeakReferences, which means both key and value becomes eligible to garbage collection if a key is no longer referenced from elsewhere in the program.\r\n"
				+ "\r\n"
				+ "This property makes WeakHashMap a good candidate for using as Cache in memory constraint environment because Map itself will take care of removing unused Mapping. On the other hand, this can cause unusual behavior if later removed key is passed from the different part of a program. See Core Java Volume 1 - Fundamentals by Cay S. Horstmann to learn more about WeakHashMap and its practical usage.";
		String[] strArr = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].trim().isEmpty()) {
				continue;
			}
			if (map.get(strArr[i]) == null) {
				map.put(strArr[i], 1);
			} else {
				map.put(strArr[i], (map.get(strArr[i]) + 1));
			}
		}
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}

}
