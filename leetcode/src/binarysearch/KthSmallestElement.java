package binarysearch;

import java.util.Stack;

public class KthSmallestElement {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		TreeNode n1 = new TreeNode(3);
		TreeNode n2 = new TreeNode(6);
		TreeNode n3 = new TreeNode(2);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(1);
		
		root.left=n1;
		root.right=n2;
		n1.left=n3;
		n1.right=n4;
		n3.left=n5;
		
		System.out.println(kthSmallestElement(root,6));
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
	public static int kthSmallestElement(TreeNode root, int k) {
		
		Stack<TreeNode> stack = new Stack<>();
		while(true) {
			while(root!=null) {
				stack.push(root);
				root=root.left;
			}
			
			root = stack.pop();
			k--;
			
			if(k==0) {
				return root.val;
			}
			
			root=root.right;
			
		}
		
	}

}
