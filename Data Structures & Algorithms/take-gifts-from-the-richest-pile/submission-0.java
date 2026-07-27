class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int e:gifts){
            pq.add(e);
        }
        for(int j=0;j<k;j++){
            int l=pq.poll();
            int ans = (int) Math.sqrt(l);
            pq.add(ans);
        }
        int sum=0;
        for(int t=0;t<gifts.length;t++){
            sum+=pq.poll();
        }
        return sum;
    }
}