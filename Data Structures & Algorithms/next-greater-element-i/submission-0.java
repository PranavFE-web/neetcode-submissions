class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []arr=new int[nums1.length];
        int i=0;
        
     while(i<nums1.length){
        boolean flag=false;
        for(int k=0;k<nums2.length;k++){
            if(nums1[i]==nums2[k]){
                int j=k+1;
                while(j<nums2.length){
                    if(nums2[j]>nums1[i]){
                        arr[i]=nums2[j];
                        flag=true;
                        break;
                    }
                    j++;
                }
            if(!flag){
            arr[i]=-1;
            }
            }
        }
        i++;
     }
     return arr;
    }
}