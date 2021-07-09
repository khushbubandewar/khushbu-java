package com.test.tokenizer;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetComparator  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Set<Integer> set = new TreeSet(new StNameComparator());
      set.add(10);
      set.add(9);
      set.add(1);
      set.add(8);
      set.add(110);
      set.add(1025);
      set.add(2);
      for(Integer in : set) {
    	  System.out.println(in);
      }
      
	}

}
 class StNameComparator implements Comparator<Integer>{
	 @Override
		public int compare(Integer std1, Integer std2) {
			if( std1>std2) {
				return 1;
			}else if(std1<std2) {
				return -1;
			}else {
				return 0;
			}
			
		}
 }