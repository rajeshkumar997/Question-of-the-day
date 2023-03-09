import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int carryDistance = a;
        while(carryDistance <= b){
            if(carryDistance % k == 0){
                System.out.println("OK");
                return;
            }
            carryDistance++;
        }
        System.out.println("NG");
    }
}
