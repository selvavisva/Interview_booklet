package com.ds.sort.algorithms;

public class MergeSort {
	public static void main(String[] args) {
		
		int[] input = {20,10,50,70,40,60,30};
		
		mergesort(input,0,input.length);
		 for (int num : input) {
	            System.out.print(num + " ");
	        }
	}
	
	public static void mergesort(int[] input, int left, int right) {
		
		if(right-left<2) {
			return;
		}
		
		 int mid = (right + left) / 2;
		
		mergesort(input,left,mid);
		mergesort(input,mid,right);
		
		merge(input,left,mid,right);
	}
	
	private static void merge(int[] input, int left, int mid, int right) {	
		System.out.println("left="+left+" mid="+mid+" right="+right);
		for (int num : input) {
            System.out.print(num + " ");
        }
		System.out.println("\n");
	
		int n1 = mid - left;
	    int n2 = right - mid;

	    int[] L = new int[n1];
	    int[] R = new int[n2];

	    for (int i = 0; i < n1; i++) {
	        L[i] = input[left + i];
	    }

	    for (int j = 0; j < n2; j++) {
	        R[j] = input[mid + j];
	    }

	    int i = 0, j = 0, k = left;

	    while (i < n1 && j < n2) {
	        input[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
	    }

	    while (i < n1) input[k++] = L[i++];
	    while (j < n2) input[k++] = R[j++];
	    System.out.println("------------------------------------");
	}
}