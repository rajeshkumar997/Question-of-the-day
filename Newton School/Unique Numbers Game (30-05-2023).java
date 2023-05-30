import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] alexaArray = new int[n];
        int[] bobArray = new int[n];
        for (int i = 0; i < n; i++) {
            alexaArray[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bobArray[i] = sc.nextInt();
        }
        
        Set<Integer> alexaSet = new HashSet<>();
        Set<Integer> bobSet = new HashSet<>();
        
        for (int num : alexaArray) {
            alexaSet.add(num);
        }
        for (int num : bobArray) {
            bobSet.add(num);
        }
        
        if (alexaSet.size() > bobSet.size()) {
            System.out.println("Alexa");
        } else {
            System.out.println("Bob");
        }
    }
}
