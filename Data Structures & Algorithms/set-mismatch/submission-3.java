class Solution {
    public int[] findErrorNums(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int duplicate = 0;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;

            if (set.contains(num)) {
                duplicate = num;
            }

            set.add(num);
        }

        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        int missing = expectedSum - (actualSum - duplicate);

        return new int[]{duplicate, missing};
    }
}