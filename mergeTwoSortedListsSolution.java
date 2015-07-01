
public class mergeTwoSortedListsSolution {
	public class ListNode
	{
		int val;
		ListNode next;
		ListNode(int x)
		{
			val = x;
		}
	}
	public LiseNode mergeTwoLists(ListNode l1, ListNode l2)
	{
		ListNode result = new ListNode(0);
		ListNode pre = result;
		
		while(l1.next != null && l1.next != null)
		{
			if(l1.val >= l2.val)
			{
				pre.next = l2;
				ListNode tmp = l2.next;
				l2.next = pre.next;
				l2 = tmp;
			}else 
			{
				l1 = l1.next
			}
		}
	}
}
