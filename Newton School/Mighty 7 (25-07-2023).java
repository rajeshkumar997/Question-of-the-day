import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int count = 0;
        // while (n != 0) {
        //     int digit = n % 10;
        //     if (digit == 7) {
        //         count++;
        //     }
        //     n /= 10;
        // }
                      // or   //

        String str = sc.nextLine();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '7'){
                count++;
            }
        }
        System.out.println(count);
    }
}
