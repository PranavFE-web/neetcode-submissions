class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1) {
            return 0;
        }

        int i = 0;
        int j = 0;
        int product = 1;
        int count = 0;

        while (j < nums.length) {

            product = product * nums[j];

            if (product < k) {
                count += j - i + 1;
                j++;
            }

            if (product >= k) {

                while (product >= k) {
                    product = product / nums[i];
                    i++;
                }

                // Now window is valid
                count += j - i + 1;
                j++;
            }
        }

        return count;
    }
}