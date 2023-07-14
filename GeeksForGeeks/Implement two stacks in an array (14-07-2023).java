class twoStacks
{
    //Function to push an integer into the stack1.
    int ar[]= new int[201];
    int ind1=-1;
    int ind2=201;
    void push1(int x)
    {
        ind1++;
        ar[ind1]=x;
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
        ind2--;
        ar[ind2]=x;
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        if(ind1==-1) return -1;
        int x=ar[ind1];
        ar[ind1]=0;
        ind1--;
        return x;
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(ind2==201) return -1;
        int x=ar[ind2];
        ar[ind2]=0;
        ind2++;
        return x;
    }
}
