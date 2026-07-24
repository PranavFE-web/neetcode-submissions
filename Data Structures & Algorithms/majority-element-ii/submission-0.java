class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>list=new ArrayList<>();
        for(int e:nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        int n=nums.length/3;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>n){
                list.add(entry.getKey());
            }
        }
        return list;

    }
}