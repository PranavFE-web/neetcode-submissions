class Solution {
    public int minimumDifference(int[] nums, int k) {
        int i=0;
        int j=0;
        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        while(j<nums.length){
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                int res=nums[j]-nums[i];
                min=Math.min(res,min);
                i++;
                j++;
            }
        }
        return min;

    }
}