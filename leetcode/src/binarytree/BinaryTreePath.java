package binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		
		binaryTreePaths(root);
		
	}
	
	private static class TreeNode{		
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(){};
		
		TreeNode(int val){
			this.val=val;
		}
		
		TreeNode(int val, TreeNode left,TreeNode right){			
			this.val=val;
			this.left=left;
			this.right=right;
		}
	}
	  public static List<String> binaryTreePaths(TreeNode root) {
	        List<String> result = new ArrayList<>();
	        dfs(root, "", result);
	        return result;
	    }

	    private static void dfs(TreeNode node, String path, List<String> result) {
	        if (node == null) return;

	        // Step 1: build path
	        if (path.isEmpty()) {
	            path = String.valueOf(node.val);
	        } else {
	            path = path + "->" + node.val;
	        }

	        // Step 2: check leaf
	        if (node.left == null && node.right == null) {
	            result.add(path);	           
	            return;
	        }

	        // Step 3: go deeper
	        dfs(node.left, path, result);
	        dfs(node.right, path, result);
	        
	        System.out.println(result);
	    }
}