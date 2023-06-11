package com.jspider.main;

public class AarrayPeak {

	public static void main(String[] args) {
		
		  int arr[] = {1,3,20,4,1,0};
		  
		  int n=arr.length-1;
		  
		  System.out.println(array(arr, n));
		}
		  static int array(int arr[],int n) {
			  
			if(n == 1)
				 return 0;
			if(arr[0]>=arr[1])
				return 0;
		    if(arr[n-1]>=arr[n-2])
		    	return 0;
		    
		   for(int i = 1 ; i<arr.length; i++) {
			   
			  if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
				  
				  return i;
				 
			  }
		   }
		return -1; 
			  
		  }

}
