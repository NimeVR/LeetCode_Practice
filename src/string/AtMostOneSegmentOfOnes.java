package string;

public class AtMostOneSegmentOfOnes {
	
	public static boolean checkOnesSegments(String s) {
		return !s.contains("01");
		//As mentioned String s starts only with leading one not leading zeros
		}

	public static void main(String[] args) {
		System.out.println( (checkOnesSegments("10101")?"True":"false"));
		System.out.println( (checkOnesSegments("11000")? "True" : "False"));
	}

}
