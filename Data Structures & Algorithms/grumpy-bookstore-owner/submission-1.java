class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int i=0;
        int j=0;
        int extra=0;
        int sum=0;
        int maxExtra=0;
        while(j<customers.length){
            if(grumpy[j]==1){
                extra+=customers[j];
            }
            else{
                sum+=customers[j];
            }
            if(j-i+1<minutes){
                j++;
            }
            else if(j-i+1==minutes ){
                maxExtra = Math.max(maxExtra, extra);
                if(grumpy[i]==1 ){
                    extra-=customers[i];
                }
                i++;
                j++;
            }
        }
        return sum+maxExtra;
    }
}