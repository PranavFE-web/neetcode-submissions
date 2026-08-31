class Solution {
    public int strStr(String haystack, String needle) {

        int j = 0;
        int index = -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.charAt(i) == needle.charAt(j)) {

                index = i;
                j = 0;

                while (j < needle.length() &&
                       haystack.charAt(i + j) == needle.charAt(j)) {

                    if (j == needle.length() - 1) {
                        return index;
                    }

                    j++;
                }
            }

            j = 0;
        }

        return -1;
    }
}