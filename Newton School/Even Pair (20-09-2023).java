import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cur, odd1 = Integer.MIN_VALUE, odd2 = Integer.MIN_VALUE, even1 = Integer.MIN_VALUE, even2 = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            cur = sc.nextInt();
            if(cur%2 == 0){
                if(even1 == Integer.MIN_VALUE)
                    even1 = cur;
                else if(even2 == Integer.MIN_VALUE){
                    if(even1 < cur){
                        even2 = even1;
                        even1 = cur;
                    }else
                        even2 = cur;
                }else{
                    if(cur > even2){
                        if(cur > even1){
                            even2 = even1;
                            even1 = cur;
                        }else
                            even2 = cur;
                    }
                }
            }else{
                if(odd1 == Integer.MIN_VALUE)
                    odd1 = cur;
                else if(odd2 == Integer.MIN_VALUE){
                    if(odd1 < cur){
                        odd2 = odd1;
                        odd1 = cur;
                    }else
                        odd2 = cur;
                }else{
                    if(cur > odd2){
                        if(cur > odd1){
                            odd2 = odd1;
                            odd1 = cur;
                        }else
                            odd2 = cur;
                    }
                }
            }
        }
        if(odd2 == Integer.MIN_VALUE && even2 == Integer.MIN_VALUE)
            System.out.println(-1);
        else{
            System.out.println(Math.max(even2 + even1, odd1 + odd2));
        }
    }
}
