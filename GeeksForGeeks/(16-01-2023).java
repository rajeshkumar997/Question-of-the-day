class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
        long[] ans = new long[n];
        Stack<Long> stack = new Stack<>();
        for(int i = n-1; i>=0; i--){
            while(stack.size() > 0 && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(stack.size() == 0){
                ans[i] = -1;
            }
            else{
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    } 
}
