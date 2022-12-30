class Solution
{
    int count=0;
    public int singlevalued(Node root)
    {
        //code here
        function(root);
        return count;
    }
    public boolean function(Node root){
        if(root==null)return true;
        
        if(root.left==null && root.right==null){
            count++;
            return true;
        }
        
        boolean lh=function(root.left);
        boolean rh=function(root.right);
        
        boolean r1=false;boolean r2=false;
        
        if(root.left!=null && root.right!=null){
            r1=root.data==root.left.data?true:false;
            r2=r2=root.data==root.right.data?true:false;
            if(r1 && r2){
                r1=true;
                r2=true;
            }else{
                r1=false;
                r2=false;
            }
        }            
        else if(root.left!=null) 
            r1=root.data==root.left.data?true:false;
        else if(root.right!=null) 
             r2=root.data==root.right.data?true:false;
             
        if(lh && rh && (r1 || r2)){
            count++;
            return true;
        }
        else
            return false;
    }
}
