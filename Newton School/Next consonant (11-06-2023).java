import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (isVowel(c)) {
                sb.append(getNextConsonant(c));
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private static char getNextConsonant(char c) {
        if (c == 'z') {
            return 'b';
        } else {
            return (char) (c + 1);
        }
    }
}
