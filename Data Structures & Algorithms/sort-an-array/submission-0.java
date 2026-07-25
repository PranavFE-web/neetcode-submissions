class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr=new int[nums.length];
        for(int e:nums){
            pq.add(e);
        }
        for(int i=0;i<nums.length;i++){
            arr[i]=pq.poll();
        }
        return arr;
    }
}