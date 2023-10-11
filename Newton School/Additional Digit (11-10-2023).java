import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt();
        String s = sc.next();
        int i = 0;
        char c = (char)(d + '0');
        while(i<n && s.charAt(i) >= c)
            i++;
        if(i<n){
            s = s.substring(0,i) + c + s.substring(i);
        }else{
            s = s + c;
        }
        System.out.println(s);
    }
}
