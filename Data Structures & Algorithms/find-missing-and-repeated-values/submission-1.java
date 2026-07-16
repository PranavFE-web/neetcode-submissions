class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[2];
        int length=0;
        HashSet set=new HashSet<>();
        for(int i=0;i<grid.length;i++){
            length+=grid[i].length;
            for(int j=0;j<grid[i].length;j++){
                if(set.contains(grid[i][j])){
                    arr[0]=grid[i][j];
                }
                else{
                    set.add(grid[i][j]);
                }
            }
        }
        length+=1;
        for(int i=0;i<length;i++){
            if(!set.contains(i)){
                arr[1]=i;
            }
        }
        return arr;

    }
}