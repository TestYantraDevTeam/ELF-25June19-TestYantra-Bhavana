package com.testyantra;

import java.util.Arrays;

public class CountOfIncorrectPositionOfElemnt {
	
	static int count(int arr[], int n) {
		
		int arr1[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr1[i]=arr[i];
		}
		
		int count =0;
		Arrays.sort(arr);
		
		for(int i=0; i<n; i++) {
			if(arr1[i]!=arr[i]) {
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 6, 2, 4, 5 };  
        int n = arr.length;  
        System.out.println( count(arr, n));

	}

}
