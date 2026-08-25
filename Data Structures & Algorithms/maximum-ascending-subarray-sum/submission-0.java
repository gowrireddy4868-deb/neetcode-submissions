class Solution {
    public int maxAscendingSum(int[] nums) {
        int j=1;
        int sum=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length&&j<nums.length;i++){
            if(nums[j]>nums[i]){
                sum+=nums[j];
                max=Math.max(max,sum);
                j++;

            }
            else{
                sum=nums[j];
                max=Math.max(max,sum);
                j++;
            }

        }
        return max;
        
    }
}