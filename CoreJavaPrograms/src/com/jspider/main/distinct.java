package com.jspider.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.HashSet;

public class distinct {

	public static void main(String[] args) {
		
	 String s = "chetanjadhavchetanjadhav";

	  HashSet<Character> list = new HashSet<Character>();

	  for(int i=0;i<s.length();i++){
	    list.add(s.charAt(i));
	  }
	   Iterator<Character> it = list.iterator();

	   while(it.hasNext()){

	     char temp = it.next();
	     int count = 0;
	     for(int i = 0; i<s.length();i++){
	      if(temp == s.charAt(i)){
	        count++;
	      }
	    }
	System.out.println(temp + ": =" + count + " ");
	  }
	}
}
