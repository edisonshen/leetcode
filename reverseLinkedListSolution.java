
public class reverseLinkedListSolution {
	public class ListNode 
	{
		int val;
		ListNode next;
		ListNode(int x){val = x;}
	}
	public ListNode reverseList(ListNode head)
	{	if(head == null) return null;
		if(head.next == null) return head;
		
		head.next = null;
		
		ListNode SecondVal = head.next;
		
		ListNode restList = reverseList(SecondVal);
		
		SecondVal.next = head;
		
		return restList;
	}
}
