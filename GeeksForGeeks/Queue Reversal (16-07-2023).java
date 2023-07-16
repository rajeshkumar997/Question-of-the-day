class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        ArrayList<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            list.add(q.poll());
        }
        Collections.reverse(list);
        for(int i=0; i<list.size(); i++){
            q.offer(list.get(i));
        }
        return q;
    }
}
