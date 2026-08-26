class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int i=0;
        int j=0;
        int maxcount=0;
       
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                maxcount = Math.max(maxcount, set.size());
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxcount;
    }
}
