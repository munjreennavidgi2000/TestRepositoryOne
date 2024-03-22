package com;

public class StrringRev {
	public static void main(String[] args) {
		String str="hello";
		char[] s=str.toCharArray();
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(s[i]);
		}
		System.out.println();
		
		String string ="hello World";
		
		String[] st=string.split(" ");
		//System.out.println(st.length);
		for (int i=string.length()-1; i>=0; i--) {
			System.out.print(string.charAt(i));
		}
		
		String stri ="abcdefghik";
	}

}
