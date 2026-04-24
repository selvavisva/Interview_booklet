package monotonicstack;

import java.util.Stack;

public class LargestRectangleHistogram {
	public static void main(String[] args) {
		int[] heights = {10,20,30,40,20};
		System.out.println(largestRectangleArea(heights));
	}
	
    public static int largestRectangleArea(int[] heights) {
    	Stack<Integer> stack = new Stack<>();
    	int n = heights.length;
    	int maxArea=0;
    	for(int i=0;i<=n;i++) {    		
    		int currentHeight = (i==n) ? 0:heights[i];
    		
    		while(!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
    			int j=stack.pop();
    			int height = heights[j];
    			int width;
    			if(stack.isEmpty()) {
    				width=i;
    			}else {
    				width=i-stack.peek()-1;
    			}    			
    			maxArea = Math.max(maxArea, width*height);
    		}
    		
    		stack.push(i);
    	}
       return maxArea;
    }
}

