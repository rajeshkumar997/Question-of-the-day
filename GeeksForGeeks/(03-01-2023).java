class Solution {
    public int removeStudents(int[] H, int N) {
        // code here
       TreeSet<Integer> set = new TreeSet<>();
       for(int i=0; i<N; i++){
           Integer high = set.ceiling(H[i]);
           if(high == null){
               set.add(H[i]);
           }
           else{
               set.remove(high);
               set.add(H[i]);
           }
       }
       return N-set.size();
    }
};
