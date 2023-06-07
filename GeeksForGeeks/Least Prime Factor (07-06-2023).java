class Solution
{
    public int[] leastPrimeFactor(int n)
    {
        // code here
        int ans[] = new int[n+1];
        ans[0] = 0;
        ans[1] = 1;
        for(int i=2; i<=n; i++){
            if(ans[i] == 0){
                ans[i] = i;
                for(int j= i*i; j<=n; j=j+i){
                    if(ans[j] == 0)
                    ans[j] = i;
                }
            }
        }
        return ans;
    }
}
