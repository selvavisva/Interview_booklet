package monotonicstack;

import java.util.Stack;

public class NextWarmerDay {
	public static void main(String[] args) {
		int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
		System.out.println(getTemperatureDay(temperatures));
	}
	
	public static int[] getTemperatureDay(int[] temperatures) {
		Stack<Integer> stack = new Stack<>();
		int[] result = new int[temperatures.length];
		for(int i=0;i<temperatures.length;i++) {			
			while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {				
				int j=stack.pop();
				result[j]=i-j;				
			}
			stack.push(i);
		}
		
		return result;
		
	}
}
