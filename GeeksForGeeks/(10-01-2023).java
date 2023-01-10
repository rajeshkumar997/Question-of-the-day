/*Complete the Given Function

Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
    	data=d;
    	left=null;
    	right=null;
    }
}*/

class Solution{
    public int makeTree(Node root){
        if(root == null){
             return 0;
         }
         int sum = root.data;
         root.data = makeTree(root.left) + makeTree(root.right);
         return sum + root.data;
    }
    public void toSumTree(Node root){
         //add code here.
         makeTree(root);
         
    }
}
