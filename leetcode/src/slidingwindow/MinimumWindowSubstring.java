package slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumWindowSubstring {
	public static void main(String[] args) {		
		System.out.println(getMinWindowSubString("ABAECXAACBAMAC","AAC"));
	}
	
	public static String getMinWindowSubString(String input, String k) 
	{
		
		Map<Character,Integer> need = new HashMap<>();
		Map<Character, Integer> inputMap = new HashMap<>();
		int have=0;
		int left=0;
		int start=0;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<k.length();i++) {
			need.put(k.charAt(i), need.getOrDefault(k.charAt(i), 0)+1);
		}
		
		int needCount=need.size();
		
		for(int right=0;right<input.length();right++) {
			
			char rightChar = input.charAt(right);
			inputMap.put(rightChar, inputMap.getOrDefault(rightChar, 0)+1);
			
			if(need.containsKey(rightChar) && need.get(rightChar)==inputMap.get(rightChar)) {
				have++;
			}
			
			while(needCount==have) {				
				if(right-left+1 < min) {
					min=Math.min(min, right-left+1);
					start=left;
				}				
				char leftChar = input.charAt(left);
				if(need.containsKey(leftChar) && inputMap.get(leftChar) == need.get(leftChar)) {
					have--;
				}				
				inputMap.put(leftChar, inputMap.get(leftChar)-1);				
				left++;		
			}			
		}
		return input.substring(start,start+min);
		
	}

}
