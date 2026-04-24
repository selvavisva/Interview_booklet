package slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestNonReptitiveChar {	
	public static void main(String[] args) {
		String input="aabbccndefghjiaaaaaaaa";
		//String input="aabbccdd";
		System.out.println(longestSubstring(input));
	}
	
	public static String longestSubstring(String s) {
	  Set<Character> set = new HashSet<>();
	  int start=0;
	  int max=0;
	  int left=0;	  
	  for(int right=0;right<s.length();right++) {		  
		  while(set.contains(s.charAt(right))) {
			  set.remove(s.charAt(left));
			  left++;			  
		  }
		  set.add(s.charAt(right));		  
		  if(right-left+1 > max) {
			  max=right-left+1;
			  start=left;
		  }		  
	  }	  
	  return s.substring(start,start+max);
	}
}