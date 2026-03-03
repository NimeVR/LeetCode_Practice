package leetcode;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,1,1,2,2};
		int result=0;
		//XOR is used to detect the repetition
		for(int i=0;i<arr.length;i++) {
			result = result ^ arr[i];
		}
		System.out.println("Occured only once is: "+result);
		
	}

}
