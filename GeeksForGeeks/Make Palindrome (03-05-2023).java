class Solution {
    public static boolean makePalindrome(int n, String[] arr) {
        // code here
        String s;
        HashSet<String> hs = new HashSet<>();
        int palCount = 0; // for palindrome Strings

        for (int i = 0; i < n; i++) {
            s = getRev(arr[i]);
            if (hs.contains(arr[i])) {
                if (s.equals(arr[i])) palCount--;
                hs.remove(arr[i]);
            } else {
                if (s.equals(arr[i])) palCount++;
                hs.add(s);
            }
        }

        if (palCount > 1) return false;
        if (hs.size() > palCount) return false;
        return true;
    }

    public static String getRev(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
        
