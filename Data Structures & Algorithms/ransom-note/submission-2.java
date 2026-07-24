class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int[] alphabest = new int[26];
        for (char c : magazine.toCharArray()) {
            alphabest[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            alphabest[c - 'a']--;
            if (alphabest[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}