class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int e:arr){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        int max=-1;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getKey()==entry.getValue()){
               max= Math.max(entry.getKey(),max);
            }
        }
        return max;
    }
}