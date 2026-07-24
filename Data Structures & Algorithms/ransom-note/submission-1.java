class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int []arr=new int [128];
        char []at=magazine.toCharArray();
        char []pt=ransomNote.toCharArray();
        for(char c:at){
            arr[c]++;
        }
        for(char c:pt){
            arr[c]--;
        }
        for(int i:arr){
            if(i<0){
                return false;
            }
        }
        return true;
    }
}