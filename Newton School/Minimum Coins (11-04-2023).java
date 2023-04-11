import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int s = findMinAmount(a, b);
        System.out.println(s);
    }

    public static int findMinAmount(int a, int b) {
        int s = 1;
        while (true) {
            int sum = a + 2 * b;
            if (sum < s) {
                s = sum + 1;
            }
            if (canPay(s, a, b)) {
                s++;
            } else {
                break;
            }
        }
        return s;
    }
    public static boolean canPay(int amount, int a, int b) {
        int num2 = Math.min(amount / 2, b); 
        int num1 = amount - 2 * num2;
        return (num1 <= a);
    }
}
