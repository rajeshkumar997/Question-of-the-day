class Solution{
    static int isPossible(int n, int m, String s){
        // code here
        int l = 0, r = 0, u = 0,d = 0;
        int x = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'L') {
                x--;
            } else if (ch == 'R') {
                x++;
            } else if (ch == 'D') {
                y++;
            } else if (ch == 'U') {
                y--;
            }
            l = Math.min(l, x);
            r = Math.max(r, x);
            u = Math.max(u, y);
            d = Math.min(d, y);
        }
        return (r - l < m) && (u - d < n) ? 1 : 0;
    }
}
