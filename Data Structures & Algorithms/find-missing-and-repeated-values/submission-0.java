class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int missing=-1;
        int repeating=-1;
        int n=grid.length;
        int hash[]=new int[n*n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                hash[grid[i][j]]++;
            }
        }
        for(int i=1;i<=n*n;i++){
            if(hash[i]==2){
                repeating=i;
            }
            if(hash[i]==0){
                missing=i;
            }
        }
        return new int[]{repeating,missing};
        
    }
}