import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int K = sc.nextInt();

        String res = largestStr(S, K);
        System.out.println(res);
    }

    public static String largestStr(String S, int K) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);

            while (!stack.isEmpty() && K > 0 && currentChar > stack.peek()) {
                stack.pop();
                K--;
            }
            stack.push(currentChar);
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}
