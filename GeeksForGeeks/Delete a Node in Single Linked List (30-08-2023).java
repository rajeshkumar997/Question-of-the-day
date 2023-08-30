/* Linklist node structure
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
/*You are required to complete below method*/
class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here	
	if(x == 1) return head.next;
	Node curr = head;
	for(int i=1; i<x-1; i++){
	    curr = curr.next;
	}
	curr.next = curr.next.next;
	return head;
    }
}
