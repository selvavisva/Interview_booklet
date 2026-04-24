package binarysearch;

public class SortedArrayToBST {
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int left=0;
		int right=nums.length-1;
		
		SortedArrayToBST sortedArrayToBST = new SortedArrayToBST();
		TreeNode result = sortedArrayToBST.bst(nums, left, right);
		System.out.println(result);
	}
	
	private static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(){};
		
		TreeNode(int val){
			this.val=val;
		}
		
	}
	
	public TreeNode bst(int[] nums, int left, int right) {
		
		if (left > right) return null;
		
		int mid = left + (right-left)/2;
		
		TreeNode node = new TreeNode(nums[mid]);
				
		node.left = bst (nums, left, mid-1);
		node.right = bst (nums,mid+1,right);
		
		return node;
		
		
	}
}
