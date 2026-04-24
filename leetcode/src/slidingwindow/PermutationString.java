package slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermutationString {
	
	public static void main(String[] args) {
		/*
		 * String s1 = "eidbaooabnshjijfbanjiur"; String s2 = "ab";
		 */
		String s1 = "bacebaabcd";
		String s2 = "abc";
		System.out.println(permutation(s1,s2));
		
	}
	public static List<String> permutation(String s1, String s2) {
		
		Map<Character,Integer> need = new HashMap<>();
		Map<Character,Integer> inputMap = new HashMap<>();
		int have=0;	
		int left=0;
		List<String> result = new ArrayList<>();
		for(int i=0;i<s2.length();i++) {			
			need.put(s2.charAt(i),need.getOrDefault(s2.charAt(i), 0)+1);
		}
		for(int right=0;right<s1.length();right++) {
			
			char rightChar = s1.charAt(right);
			inputMap.put(rightChar, inputMap.getOrDefault(rightChar,0)+1);
			
			if(need.containsKey(rightChar) && need.get(rightChar).intValue()==inputMap.get(rightChar).intValue()) {
				have++;
			}
			if(right-left+1==s2.length()) {
				if(have==need.size()) {
					result.add(s1.substring(left,right+1));	
				}
				char leftChar = s1.charAt(left);
								
				if (need.containsKey(leftChar) &&
					    inputMap.get(leftChar) == need.get(leftChar)) {
					    have--;
					}
				inputMap.put(leftChar, inputMap.get(leftChar)-1);
				left++;
			}
		}
		return result;
	}

}