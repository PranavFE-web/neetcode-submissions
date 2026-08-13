class Solution {
    public void moveZeroes(int[] nums) {
        int k =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
            
        }
        for(int l=k;l<nums.length;l++){
            nums[l]=0;
        }

    }
}