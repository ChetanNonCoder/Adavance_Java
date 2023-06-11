package com.jspider.main;

import java.util.HashSet;

public class program1 {

	public static void main(String[] args) {
		String str = "abcdaABCDdbc";
		
		char [] arr = str.toCharArray();
		
		HashSet<Character> hs = new HashSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			hs.add(str.charAt(i));
		}
		
		System.out.println(hs);
	
		
		for (Character character : hs) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (character==arr[i]){
					count++;
				}
			}
			System.out.print(character+" -> "+count+" ");
		}
	}
	
}
