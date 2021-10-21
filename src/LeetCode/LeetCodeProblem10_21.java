package LeetCode;

import java.util.HashMap;

public class LeetCodeProblem10_21 {

	public static void main(String[] args) {
		System.out.println(romanToInt("IV"));
	}
	
	
	public static int romanToInt(String s) {
		int romanToInt = 0;
		int n = s.length();
		
		HashMap<Character, Integer> romans = new HashMap<Character, Integer>();
		romans.put('I', 1);
		romans.put('V', 5);
		romans.put('X', 10);
		romans.put('L', 50);
		romans.put('C', 100);
		romans.put('D', 500);
		romans.put('M', 1000);

		for(int i = 0; i < n; i++) {
			if (i+1 < n && romans.get(s.charAt(i)) < romans.get(s.charAt(i+1))) {
				romanToInt -= romans.get(s.charAt(i));
			} else {
				romanToInt += romans.get(s.charAt(i));
			}
		}

		return romanToInt;
	}
	

}
