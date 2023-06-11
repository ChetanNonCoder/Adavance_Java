package com.jspider.main;

public class BinarySort {

     public static void main(String[] args) {
		
    	 int arr[] = {-1,-2,-3,4,5,6,7,8};
    	 
    	 System.out.println(Binary(arr,4));
     }    	
	 public static int Binary(int arr[] ,int key) {
		 
		int low = 0 , high = arr.length-1;
		
		while(low<=high) {
			int mid = (low + high)/2;
			if(arr[mid] == key) {
				return mid ;
			}else if(key >= arr[mid]){
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		return -1;
	 }
}
