import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int cons = 0;
        int vow = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vow++;
            } 
            else{
                cons++;
            }
        }
        if(cons == vow){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
