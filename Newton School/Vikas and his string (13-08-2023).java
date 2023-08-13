import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int lowercaseCount = 0;
        int uppercaseCount = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(c)) {
                uppercaseCount++;
            }
        }
        String convertedString;
        if (lowercaseCount == uppercaseCount) {
            convertedString = str.toUpperCase();
        } else if (lowercaseCount > uppercaseCount) {
            convertedString = str.toLowerCase();
        } else {
            convertedString = str.toUpperCase();
        }
        System.out.println(convertedString);
    }
}
