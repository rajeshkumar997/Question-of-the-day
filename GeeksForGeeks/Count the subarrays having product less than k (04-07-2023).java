class Solution {
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    {
        long b = 1;
        int ans = 0, i=0, j=0;
        for(i=0, j=0; j<n; j++){
            b = b*a[j];
            while(b >= k && i<j){
                b /= a[i];
                i++;
            }
            if(b<k){
                ans +=(j-i+1);
            }
        }
        return ans;
    }
}
