class Solution {
    public static int ans =0;
    public static int fun(Node root){
        if(root == null) return 0;
        
        int left = fun(root.left);
        int right = fun(root.right);
        ans = Math.max(ans, left+right+root.data);
        
        return left+right+root.data;
    }
    public static int findLargestSubtreeSum(Node root) {
        // code here
        ans = Math.max(ans,fun(root));
        int result = ans;
        ans = 0;
        return result;
    }
}
