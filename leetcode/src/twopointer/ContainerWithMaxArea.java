package twopointer;

public class ContainerWithMaxArea {
	
	public static void main(String[] args) {
		int[] heights = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(heights));
	}
	
	public static int maxArea(int[] heights) {
		
		int left=0;
		int right=heights.length-1;
		int maxArea=0;
		
		while(left<right) {			
			int width = right-left;
			int height = Math.min(heights[left],heights[right]);
			int area = width*height;
			maxArea = Math.max(maxArea, area);
			
			if(heights[left] < heights[right]) {				
				left++;
			}else {
				right--;
			}
			
		}
		return maxArea;
		
	}
}
