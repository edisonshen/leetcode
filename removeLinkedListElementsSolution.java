
public class removeLinkedListElementsSolution {
	public class ListNode
	{
		int val;
		ListNode next;
		ListNode(int x)
		{
			x = val;
		}
	}
	public ListNode removeElements(ListNode head, int val)
	{
		if(head == null ) return null;
		
		ListNode result = new ListNode(0);
		result.next = head;
		ListNode current = result;
		
		while(current.next != null)
		{
			if(current.next.val == val)
			{   
			    
				current.next = current.next.next; 
			}else
			{
				current = current.next;
			}
		}
		
		return result.next;
		
			
	}
}
