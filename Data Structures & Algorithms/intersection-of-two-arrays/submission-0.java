class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        for(int e:nums1){
            set.add(e);
        }
        for(int k:nums2){
            if(set.contains(k) && !list.contains(k)){
                list.add(k);
            }
        }
        int []arr=new int[list.size()];
        int l=0;
        for(int r:list){
            arr[l]=r;
            l++;
        }
        return arr;
    }
}