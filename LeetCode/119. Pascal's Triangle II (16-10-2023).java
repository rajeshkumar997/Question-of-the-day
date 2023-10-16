class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0; i<=rowIndex ; i++){
            List<Integer> arr=new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(i==0 || i==1){
                    arr.add(1);
                }else{
                    if(j==0 || j==i){
                        arr.add(1);
                    }else{
                        arr.add(ans.get(j-1)+ans.get(j));
                    }
                }
            }
            ans=arr;
        }
        return ans;
    }
}
