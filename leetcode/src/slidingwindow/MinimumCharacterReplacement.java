package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumCharacterReplacement {
	
	public static void main(String[] args) {
		
		String s = "XABAAX";
		int k = 1;
		System.out.println(characterReplacement(s,k));
		
	}
	
	public static int characterReplacement(String s, int k) {

	    Map<Character, Integer> freq = new HashMap<>();
	    int left = 0;
	    int maxFreq = 0;
	    int maxLength = 0;

	    for (int right = 0; right < s.length(); right++) {

	        char ch = s.charAt(right);

	        freq.put(ch, freq.getOrDefault(ch, 0) + 1);

	        maxFreq = Math.max(maxFreq, freq.get(ch));

	        // shrink window if invalid
	        while ((right - left + 1) - maxFreq > k) {
	            char leftChar = s.charAt(left);
	            freq.put(leftChar, freq.get(leftChar) - 1);
	            left++;
	        }

	        maxLength = Math.max(maxLength, right - left + 1);
	    }

	    return maxLength;
	}

}
