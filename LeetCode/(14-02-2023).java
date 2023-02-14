import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger first = new BigInteger(a,2);
        BigInteger second = new BigInteger(b,2);
        
        BigInteger ans = first.add(second);
        return ans.toString(2);
    }
}
