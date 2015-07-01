
public class invertBinaryTreeSolution {
	public class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x)
		{
			val = x;
		}
	}
	public TreeNode invertBinaryTree(TreeNode root)
	{
		if(root == null) return null;
		
		TreeNode temple;
		temple = root.left;
		root.left = root.right;
		root.right = temple;
		
		invertBinaryTree(root.left);
		invertBinaryTree(root.right);
		return root;
				
	}
}
