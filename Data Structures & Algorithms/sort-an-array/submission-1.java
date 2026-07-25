class Solution {
    public int[] sortArray(int[] nums) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = new int[nums.length];

        for (int e : nums) {
            pq.add(e);
        }

        int i = 0;

        while (!pq.isEmpty()) {
            arr[i++] = pq.poll();
        }

        return arr;
    }
}