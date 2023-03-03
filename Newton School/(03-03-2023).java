import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        Set<Integer> distinctIntegers = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            distinctIntegers.add(num);
        }

        System.out.println(distinctIntegers.size());
    }
}
