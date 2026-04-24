package binarysearch;

import java.util.HashSet;
import java.util.Set;

public class TwoSumBST {
	public static void main(String[] args) {

		TreeNode root = new TreeNode(50);
		TreeNode n1 = new TreeNode(30);
		TreeNode n2 = new TreeNode(60);
		TreeNode n3 = new TreeNode(20);
		TreeNode n4 = new TreeNode(40);
		TreeNode n5 = new TreeNode(10);
		
		root.left=n1;
		root.right=n2;
		n1.left=n3;
		n1.right=n4;
		n3.left=n5;
		Set<Integer> set = new HashSet<>();
		
		TwoSumBST bst = new TwoSumBST();		
		System.out.println(bst.dfs(root, 110, set));
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
	
	public boolean dfs(TreeNode node, int k, Set set) {
		
		if(node==null) return false;
		
		if(set.contains(k-node.val)) return true;
		
		set.add(node.val);
		
		return dfs(node.left,k,set) || dfs(node.right,k,set);
	}
}
