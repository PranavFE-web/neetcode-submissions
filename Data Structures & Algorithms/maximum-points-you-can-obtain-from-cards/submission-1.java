class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int sum = 0;

        // Take k cards from left
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }

        int maxsum = sum;

        int left = k - 1;
        int right = cardPoints.length - 1;

        // Replace left cards with right cards
        for (int i = 0; i < k; i++) {

            sum -= cardPoints[left];
            left--;

            sum += cardPoints[right];
            right--;

            maxsum = Math.max(maxsum, sum);
        }

        return maxsum;
    }
}