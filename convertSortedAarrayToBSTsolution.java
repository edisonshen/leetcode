
public class convertSortedAarrayToBSTsolution {

	public class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x)
		{
			val = x ;
		}
	}
	public TreeNode SortArrayToBST(int[] nums)
	{
		if(nums.length == 0)
			return null;
		return tree(nums, 0, nums.length);
	}
	
	public TreeNode tree(int[] nums, int start, int end)
	{
		if (start > end)
			return null;
		int m = (start + end)/2;
		TreeNode root = new TreeNode(nums[m]);
		root.left = tree(nums, 0, m-1);
		root.right = tree(nums, m+1, end);
		return root;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if(nums.length == 0 )
//			return null;
//		return tree(nums, 0 , nums.length);
//		
//	}
//	public TreeNode tree(int[] nums, int start, int end)
//	{
//		if (start>end)
//			return null;
//		
//		int m = (start + end)/2;
//		TreeNode root = new TreeNode(nums[m]);
//		root.left = tree(nums, 0 , m-1);
//		root.right = tree(nums, m+1, end);
//		return root;
//		
	}

