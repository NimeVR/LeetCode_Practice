package leetcode;

import java.util.*;

public class RotateArray189 {
	
	public static void swap(int[] nums,int start,int end) {
		int temp=nums[start];
		nums[start]=nums[end];
		nums[end]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {-1,-100,3,99};
		int n=arr.length;
		int k=2;
		//Modulo operation is done so when rotation is 
		//more than n times array
		//index out off bound error should not happen
		k=k%n;
		int kk=k;

		int right=n-1,left=0;
		
		System.out.println("\nOriginal array:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		while(left<right) {
			swap(arr,left,right);
			left++;right--;
		}
		System.out.println("\nFINAL After Full array the reverse:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		left=0;
		k=k-1;
		while(left<=k) {
			swap(arr,left,k);
			left++;
			k--;
		}
		System.out.println("\nFINAL After K elements reverse:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		k=kk;
		left=k;
		right=n-1;
		while(left<=right) {
			swap(arr,left,right);
			left++;
			right--;
		}
		System.out.println("\nFINAL After Remaining n-k  the reverse:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}

}
