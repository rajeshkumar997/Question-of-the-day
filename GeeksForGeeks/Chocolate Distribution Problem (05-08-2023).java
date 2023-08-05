class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        int min = Integer.MAX_VALUE;
        Collections.sort(a);
        for(int i=0; i<=n-m; i++){
            min = Math.min(min, a.get(i+m-1)-a.get(i));
        }
        return min;
    }
}
