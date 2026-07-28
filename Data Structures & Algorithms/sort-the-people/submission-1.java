class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[1], a[1])
        );

        for (int i = 0; i < names.length; i++) {
            pq.offer(new int[]{i, heights[i]});
        }

        String[] ans = new String[names.length];

        int index = 0;

        while (!pq.isEmpty()) {
            int[] person = pq.poll();
            ans[index++] = names[person[0]];
        }

        return ans;
    }
}