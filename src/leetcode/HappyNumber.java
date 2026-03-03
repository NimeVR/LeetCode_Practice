package leetcode;
import java.util.*;
public class HappyNumber {
    public static boolean isHappy(int n) {
        Set<Integer> seen=new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n=sumOfSquare(n);
        }           
        if(n==1){
            return true;
        }else{
            return false;
        }
    }
    public static int sumOfSquare(int n){
        int happy=0;
         while(n>0){
                int s=n%10;
                happy+=(s*s);
                n/=10;
            }
            return happy;
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int nn=sc.nextInt();
    	if(isHappy(nn)) {
    		System.out.println("Happy");
    	}else {
    		System.out.println("Not happy number");
    		
    	}
    }
}

