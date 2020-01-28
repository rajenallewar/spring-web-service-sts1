package com.syne.api.demo;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		int[] array = { 1, 3, 5, 7 };
		int[] array1 = { 0, 0, 1, 4, 6 };
		Solution s = new Solution();
		int result = s.solution(array, array1);
		System.out.println(result);

	}
}

class Solution {

	int solution(int[] A, int[] B) {
		int n = A.length;
		int m = B.length;
		Arrays.sort(A);
		Arrays.sort(B);

		int i = 0;
		for (int k = 0; k < n; k++) {
			while (i < m - 1 && B[i] < A[k]) {
				i += 1;
			}
			if (A[k] == B[i])
				return A[k];
		}
		return -1;
	}
}
