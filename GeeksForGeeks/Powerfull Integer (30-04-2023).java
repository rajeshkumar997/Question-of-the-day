class Solution{
    public static int powerfullInteger(int n,int interval[][],int k)
    {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, interval[i][1]);
        }
        int[] v = new int[mx + 3];
        for (int i = 0; i < n; i++) {
            v[interval[i][0]] += 1;
            v[interval[i][1] + 1] -= 1;
        }
        int ans = -1;
        for (int i = 1; i < mx + 3; i++) {
            v[i] = v[i - 1] + v[i];
            if (v[i] >= k) {
                ans = i;
            }
        }
        return ans;
    }
}
