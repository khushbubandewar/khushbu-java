
public class StringExa4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char[] ch = {'a','b','c','d'};
//		String s =  new String(ch);
//		System.out.println(s);
//		//String s1 = new String(byte[] b);
//		byte[] b = {100,101,102,103};
//		String s1 = new String(b);
//		System.out.println(s1);
//		
//		//public char charAt(int index);
//		String s = "sdfghrty";
//		System.out.println(s.charAt(5));
//		System.out.println(s.length());
//		//System.out.println(s.charAt(9));
//		
////		public String concat(String S);
//		String S= "Durga";
//		 S=S.concat("wertyu");
//		// S+=concate("kjhgf");
//		System.out.println(S);
//	}
//
//	private static String concate(String string) {
//		// TODO Auto-generated method stub
//		return null;
		
		String s="java";
		System.out.println(s.equals("JAVA"));
		System.out.println(s.equalsIgnoreCase("jAVa"));
		
		String s1 = "wertyuiolkjhgfds";
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(8, 10));
		
//		public String replace(char old,char new);
		String s2 = "    xxxxxrKJGYUIJKrrrruuuuujjjj       ";
		System.out.println(s2.replace('x','Q'));
		System.out.println(s2.trim());
		
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toLowerCase( ));		
		
	}

}
