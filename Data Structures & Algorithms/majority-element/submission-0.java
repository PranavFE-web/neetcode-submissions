class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int e:nums){
           map.put(e, map.getOrDefault(e, 0) + 1);
        }
        int targetValue=nums.length/2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
             if (entry.getValue() >targetValue) {
                return entry.getKey();
    }
        }
    return -1 ;
}
} 