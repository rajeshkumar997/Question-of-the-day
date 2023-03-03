class Solution{
    static List<Long> minimumSquares(long L, long B)
    {
        // code here
        long l = L;
        long b = B;
        
        while(L>0){
            long val = L;
            L = B%L;
            B = val;
        }
        List<Long> ans = new ArrayList<>();
        ans.add((l/B)*(b/B));
        ans.add(B);
        return ans;
    }
}
