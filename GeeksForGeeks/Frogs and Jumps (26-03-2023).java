class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // Code here
        int arr[]=new int[leaves+1];
        for(int i=0;i<N;i++){
            int pos=frogs[i];
            if(pos<=leaves && arr[pos]==0){
               int temp=pos;
               while(temp<=leaves){
                    if(arr[temp]==0){
                        arr[temp]=1;
                    }
                    temp+=pos;
               }
            }
        }
        int count=0;
        for(int i=1;i<leaves+1;i++){
            if(arr[i]==0)
              count++;
        }
        return count;
    }
}
