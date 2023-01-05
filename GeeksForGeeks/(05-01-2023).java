class Solution {
    public static String longestString(int n, String[] arr) {
        // code here
        HashSet<String> set = new HashSet<>();
        set.add("");
        
        Arrays.sort(arr);
        String ans = "";
        
        for(String str : arr){
            if(set.contains(str.substring(0, str.length()-1))){
                set.add(str);
                if(str.length() > ans.length()){
                    ans = str;
                }
            }
        }
        return ans;
    }
}
