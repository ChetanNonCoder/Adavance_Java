package com.jspider.main;

class book{
	String name;
    int pages;

    book(String name , int pages){
        this.name = name;
        this.pages = pages;
    }
     
    @Override
    public String toString(){
        return "Name:"+name+",Pages:"+pages;
    }


    public static void main(String[] args) {
		book b1 = new book("Python",1000);
	}
}
