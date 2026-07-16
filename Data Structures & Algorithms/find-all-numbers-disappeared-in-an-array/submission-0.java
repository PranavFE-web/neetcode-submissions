class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List list=new ArrayList();
       HashSet set=new HashSet<>();
       for(int e:nums){
        set.add(e);
       }
       for(int i=1;i<=nums.length;i++){
        if(!set.contains(i)){
            list.add(i);
        }
       }
       return list;
    }
}