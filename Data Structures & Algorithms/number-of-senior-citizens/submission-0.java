class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        int i=0;
        while(i<details.length){
            String s=details[i];
            char c1=s.charAt(11);
            char c2=s.charAt(12);
            int num1= c1 - '0';
            int num2=c2-'0';
            int sum=(num1*10)+num2;
            if(sum>60){
                count++;
            }
            i++;
        }
        return count;
    }
}