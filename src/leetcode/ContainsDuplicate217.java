package leetcode;

import java.util.*;
public class ContainsDuplicate217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,1};
		int found=0;
		Set<Integer> s=new HashSet<>();
		for(int i:nums) {
			if(s.contains(i)) {
				found=1;
				System.out.println("TRUE DUPLICATE IS PRESENT");
				break;
			}else {
				s.add(i);
			}
		}
		if(found==0) {
			System.out.println("FALSE NO DUPLICATE");
		}
		
		
	}

}
