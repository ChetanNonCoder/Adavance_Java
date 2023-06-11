package com.jspider.main;

class Secondlargest{
	 
	  public static void main(String[] args) {
		
	   int[]  number = {3,3,5,342,5,343,24,543245,34232343,4};

	    System.out.println(withodsorting(number));
	   
	  }
	    static int withodsorting(int[] number){
	     int largest = Integer.MIN_VALUE;
	     int second_largest = Integer.MIN_VALUE;

	     for(int i=0; i<number.length;i++){
	        if(number[i]>largest){
	             second_largest = largest ;
	             largest = number[i]; 
	        }else if(number[i] > second_largest && number[i] < largest){
	             second_largest = number[i];
	      }
	    }
	     return second_largest;
	  }
	}

