class Solution {
    public static String stringMirror(String str) {
        // code here
        String ans = "";
        int i = 1;
        ans += str.charAt(0) + "";
        for (i = 1; i < str.length(); i++) {
            if (str.charAt(i) > str.charAt(i-1)) break;
            if (str.charAt(i) == str.charAt(i - 1) && str.charAt(i) == str.charAt(0)) 
                break;
            ans += str.charAt(i) + "";
        }
        return ans + rev(ans);
    }
    private static String rev(String str) {
        String ans = "";
        for (char ch : str.toCharArray()) ans = ch + ans;
        return ans;
    }
}
