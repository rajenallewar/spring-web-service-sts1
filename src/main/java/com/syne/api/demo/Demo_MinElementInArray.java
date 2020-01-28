package com.syne.api.demo;

import java.util.Arrays;

public class Demo_MinElementInArray {

	    int minimum(int[] A, int[] B) {
	        int n = A.length;
	        int m = B.length;;
	        Arrays.sort(A);
	        Arrays.sort(B);
	        int i = 0;
	        for (int k = 0; k < n; k++) {
	            if (i < m - 1 && B[i] < A[k])
	                i++;
	            if (A[k] == B[i])
	                return A[k];
	        }
	        return -1;
	    }
	    
	    public static void main(String[] args) {
	    	Demo_MinElementInArray demo = new Demo_MinElementInArray();
	    	int[] intArrayA = new int[]{ 1,7,2,3 }; 
	    	int[] intArrayB = new int[]{ 3,10,9,11,2,5,13,49 }; 
	    	System.out.println(demo.minimum(intArrayA, intArrayB));
		}

}
