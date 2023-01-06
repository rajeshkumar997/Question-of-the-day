class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n = costs.length;
        int ans = 0;
        while(ans < n && costs[ans] <= coins){
            coins -= costs[ans];
            ans += 1;
        }
        return ans;
    }
}
