package codinginterview.easy;

public class _0002_AddTwoNumbers {
	
//  Definition for singly-linked list.
  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
  
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
      ListNode head=new ListNode(0);
      ListNode temp = head;
      int carry=0, sum=0;
      while(l1!=null || l2!=null){
          
          if(l1==null){
              sum = l2.val + carry;
              l2=l2.next;
          }
          else if(l2==null){
              sum = l1.val + carry;
              l1= l1.next;
          }
          else{
              sum = l1.val + l2.val + carry;
              l1=l1.next;
              l2=l2.next;
          }
          carry = sum/10;
          if(carry>0)
              sum = sum%10;
          
         temp.next = new ListNode(sum);
         temp = temp.next;
          
      }
      
      if(carry > 0)
          temp.next = new ListNode(carry);
          temp = temp.next;
      return head.next;
      
  }

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(4);
		ListNode l3 = new ListNode(3); 
		
		l1.next = l2;
		l2.next = l3;
		
		ListNode l4 = new ListNode(5);
		ListNode l5 = new ListNode(6);
		ListNode l6 = new ListNode(4); 
		
		l4.next = l5;
		l5.next = l6;
		
		ListNode node = new _0002_AddTwoNumbers().addTwoNumbers(l1, l4);
		while(node!=null)
		{
			System.out.print(node.val + " ");
			node = node.next;
		}
		

	}

}

   