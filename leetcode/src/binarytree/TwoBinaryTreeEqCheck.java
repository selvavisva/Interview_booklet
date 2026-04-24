package binarytree;

public class TwoBinaryTreeEqCheck {
	
	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(3);
		root1.left = new TreeNode(9);
		root1.right = new TreeNode(20);
		root1.right.left = new TreeNode(15);
		root1.right.right = new TreeNode(7);
		
		TreeNode root2 = new TreeNode(3);
		root2.left = new TreeNode(9);
		root2.right = new TreeNode(20);
		root2.right.left = new TreeNode(15);
		root2.right.right = new TreeNode(8);
		
		System.out.println(twoBinaryTreeEqCheck(root1,root2));
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
	
	public static boolean twoBinaryTreeEqCheck(TreeNode p, TreeNode q) {
		
		if(p==null && q==null) return true;
		if(p==null || q==null) return false;
		if(p.val != q.val) return false;
		
		return twoBinaryTreeEqCheck(p.left,q.left) && 
				twoBinaryTreeEqCheck(p.right,q.right);
	}

}
