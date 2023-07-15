class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        int temp;
        if((sizeOfStack & 1) != 0){
            temp = sizeOfStack/2;
        } else{
            temp = (sizeOfStack/2)-1;
        }
        s.remove(temp);
    } 
}
