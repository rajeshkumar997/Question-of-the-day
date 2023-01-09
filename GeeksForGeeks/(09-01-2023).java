class Solution {
    int solve(int N, int[] A) {
        // code here
        int ans =0;
        for(int i=N-1; i>=0; i--){
            if(A[i]<9){
                ans = i+1;
                break;
            }
        }
        return ans;
    }
};
