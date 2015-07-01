
public class validBSTSolution {
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
	public boolean isValidBST(TreeNode root)
	{
		return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public boolean  isValidBST(TreeNode p, int min, int max)
	{
		if (p == null)
			return true;
		if(p.val <= min || p.val >= max)
		return false;
		
		return (isValidBST(p.left,min, p.val) && isValidBST(p.right, p.val, max))
	}
}
