class Solution {
    public int lastStoneWeight(int[] stones) {
      PriorityQueue<Integer> pq =
    new PriorityQueue<>(Collections.reverseOrder());
        for(int e:stones){
            pq.add(e);
        }
        while(pq.size()>1){
            int first = pq.poll();   
            int second = pq.poll();
            if(first==second){
                continue;
            }
            if(first>second){
               pq.add(first-second);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
