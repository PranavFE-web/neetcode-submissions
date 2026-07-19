class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int j=0;j<t.length();j++){
            char k=t.charAt(j);
            map.put(k,map.getOrDefault(k,0)-1);
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()==-1){
                return entry.getKey();
            }
        }
        return ' ';
        }
}