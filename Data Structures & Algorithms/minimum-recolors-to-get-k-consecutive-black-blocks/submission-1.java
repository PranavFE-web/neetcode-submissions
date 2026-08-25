class Solution {

    public int minimumRecolors(String blocks, int k) {

        int i = 0;
        int j = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;

        while (j < blocks.length()) {

            // Add current element
            if (blocks.charAt(j) == 'W') {
                count++;
            }

            // Window size < k
            if (j - i + 1 < k) {
                j++;
            }

            // Window size == k
            else if (j - i + 1 == k) {

                min = Math.min(min, count);

                // Remove left element
                if (blocks.charAt(i) == 'W') {
                    count--;
                }

                i++;
                j++;
            }
        }

        return min;
    }
}