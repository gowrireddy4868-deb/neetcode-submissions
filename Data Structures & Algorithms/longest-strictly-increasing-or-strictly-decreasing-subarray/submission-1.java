class Solution {
    public int longestMonotonicSubarray(int[] nums) {
         int j=1;
         int inc=1;
         int dcc=1;
         int ans=1;
        for(int i=0;i<nums.length&&j<nums.length;i++){
            if(nums[j]>nums[i]){
                inc++;
                dcc=1;
                ans=Math.max(ans,inc);
                  j++;
            }
            else if(nums[j]<nums[i]){
                dcc++;
                inc=1;
                ans=Math.max(ans,dcc);
                j++;
            }
            else{
                inc=1;
                dcc=1;
                j++;
                
            }
           
        }
        return ans;
        
    }
}