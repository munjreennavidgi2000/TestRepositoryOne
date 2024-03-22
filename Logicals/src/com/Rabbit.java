package com;

public class Rabbit {
	public static void main(String[] args) {
		String s="wfbakuiwefrkmacroajovbopbqwilkjjt";
		s=s.replaceAll("[^rabit]", "");
		System.out.println(s);
		System.out.println(s.contains("rabbit"));
	
		
		/*
		 * for (int i=0; i<s.length(); i++) { if(s.charAt(i)=='r'||
		 * s.charAt(i)=='a'||s.charAt(i)=='b'||s.charAt(i)=='i'|| s.charAt(i)=='t') {
		 * System.out.print(s.charAt(i)); }
		 * 
		 * }
		 */
	}

}
