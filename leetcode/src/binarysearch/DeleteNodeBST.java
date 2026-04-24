package binarysearch;

public class DeleteNodeBST {
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
		
		DeleteNodeBST bst = new DeleteNodeBST();
		bst.deleteNode(root, 30);
		System.out.println(root);
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
	
	private TreeNode deleteNode(TreeNode node, int val) {
		
		if(node==null) return null;
		
		if(val < node.val) {			
			node.left = deleteNode(node.left,val);
		} else if(val > node.val ) {			
			node.right=deleteNode(node.right,val);
		} else {
			
			if (node.left==null) return node.right;
			
			if(node.right==null) return node.left;
			
			
			TreeNode successor = findMin(node.right);
			node.val = successor.val;
			node.right = deleteNode(node.right,successor.val);
			
		}
		return node;
		
	}
	
	private TreeNode findMin(TreeNode node) {
		
		while(node.left !=null) {
			node = node.left;			
		}
		return node;
	}
}
