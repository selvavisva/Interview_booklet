package com.depth.string.apis;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		LongestCommonPrefix solution = new LongestCommonPrefix();
		
		String[] input = {"car","car","cars","cartoon","coat","carbon"};
		
		System.out.println("Output :: "+solution.longestCommonPrefix(input));
	}
	
	 public String longestCommonPrefix(String[] strs) {
	        
	        if(null==strs && strs.length==0) return "";
	        String prefix = strs[0];

	        for(int i=1;i<strs.length;i++){
	            while(strs[i].indexOf(prefix)!=0){
	                prefix = prefix.substring(0,prefix.length()-1);
	                if(prefix.isEmpty()) return "";
	            }
	        }

	        return prefix;
	    
	    }
}