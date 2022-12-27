// Vegetable
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// There are some dishes. Each of them is a Chinese dish with two vegetables or an Italian dish with four vegetables.

// There are X dishes in total, and Y vegetables in total.
// Determine whether there is a combination of numbers of Chinese dishes and Italian dishes in which this statement is correct.
// Input
// The first line contains two integers X and Y.

// Constraints
// 1≤X≤100
// 1≤Y≤100
// All values in input are integers.
// Output
// If there is a combination of numbers of Chinese dishes and Italian dishes in which the statement is correct, print Yes; otherwise, print No.
// Example
// Sample Input 1:
// 3 8

// Sample Output 1:
// Yes

// Sample Explanation 1:
// The statement "there are 3 dishes in total and 8 vegetables in total" is correct if there are two Chinese dishes and one Italian dish. Thus, there is a combination of numbers of Chinese dishes and Italian dishes in which the statement is correct.


// Sample Input 2:
// 2 100

// Sample Output 2:
// No

// Sample Explanation 2:
// There is no combination of numbers of Chinese dishes and Italian dishes in which this statement is correct.


// Sample Input 3:
// 1 2

// Sample Input 3:
// Yes

// Sample Explanation 3:
// We also consider the case in which there are only Chinese dishes and only Italian dishes.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x%2==0&& y%2==0){
        System.out.println("No");
        }
        else if (y % 2 == 0 && y / 2 >= x) {
            System.out.println("Yes");
        }
        else if(x==1 &&y==2){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
