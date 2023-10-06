/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution
{
    public static void rearrange(Node odd){
        // add your code here
        Node head=odd;
        Node even=odd.next;
        Node heven=even;
        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        Node t=reverse(heven);
        odd.next=t;
    }
    public static Node reverse(Node root){
        Node cur=root;
        Node pre=null;
        while(cur!=null){
          Node ne=cur.next;
            cur.next=pre;
            pre=cur;
            cur=ne;
        }
        return pre;
    }
}
