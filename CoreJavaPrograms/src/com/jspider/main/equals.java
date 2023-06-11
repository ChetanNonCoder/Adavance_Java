package com.jspider.main;

public class equals {
 class book{
	 String name ;
	 int pages;
	public book(String name, int pages) {
		super();
		this.name = name;
		this.pages = pages;
	}
	@Override
	public boolean equals(Object o) {
		book temp = (book)o;
		
		if (this.name ==  temp.name && this.pages == temp.pages) {
			return true;
		} else {
			return false;
		}
	}
 }
 	public static void main(String[] args) {

		
	}
}
