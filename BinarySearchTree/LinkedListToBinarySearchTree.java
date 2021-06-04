public class LinkedListToBinarySearchTree{
    
        public TreeNode sortedListToBST(ListNode head) {
            if(head==null)
                return null;
            ListNode mid=mid(head);
            TreeNode root=new TreeNode(mid.val);
            if(head==mid)
                return root;
            root.left=sortedListToBST(head);
            root.right=sortedListToBST(mid.next);
            return root;
            
            
        }
        public ListNode mid(ListNode node)
        {
            ListNode slow=node;
            ListNode fast=node;
            ListNode prev=node;
            while(fast!=null && fast.next!=null)
            {
                prev=slow;
                slow=slow.next;
                fast=fast.next.next;
            }
            if(prev.next!=null)
            {
                prev.next=null;
            }
            
            return slow;
            
          
        }
    
}