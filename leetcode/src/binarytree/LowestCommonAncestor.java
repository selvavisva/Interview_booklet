package binarytree;

public class LowestCommonAncestor {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(40);
		root.left = new TreeNode(20);
		root.left.left = new TreeNode(10);
		root.left.right = new TreeNode(30);
		root.right = new TreeNode(70);
		
		LowestCommonAncestor test = new LowestCommonAncestor();
		System.out.println(test.lca(root,root.left.left,root.right).val);
	}
	
	private static class TreeNode {		
		int val;
		TreeNode left;
		TreeNode right;		
		TreeNode(int val){
			this.val=val;
		}
	}
	
	public TreeNode lca(TreeNode node, TreeNode p, TreeNode q) {
		
		if(node==null) return null;
		
		if(node==p || node==q) return node;
		
		
		TreeNode left = lca(node.left,p,q);
		TreeNode right = lca(node.right,p,q);
		
		if(left!=null && right!=null) return node;
		
		return left!=null?left:right;
		
	}

}
