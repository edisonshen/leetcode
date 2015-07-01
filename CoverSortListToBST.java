import java.util.ArrayList;
import java.util.List;


public class CoverSortListToBST {
	public class ListNode 
	{
		int val;
		ListNode next;
		ListNode(int x)
		{
			val = x;
		}
	}
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
	public TreeNode SortListToBST(ListNode head)
	{
		if(head == null) 
			return null;
		ListNode cur = head;
		int count = 0;
		
		while(cur != null)
		{
			cur = cur.next;
			count ++;
		}
		ArrayList<ListNode> list = new ArrayList<ListNode>();
		list.add(head);
		return tree(list, 0, count-1);
	}
		
	
	public TreeNode tree(ArrayList<ListNode> list, int l, int r)
	{
		if(l>r)
			return null;
		int m = (l + r) /2;
		TreeNode left = tree(list, 0, m);
		TreeNode root = new TreeNode(list.get(0).val);
		root.left = left;
		list.set(0, list.get(0).next);
		root.right = tree(list, m+1, r);
		return root;
		
	}
}
