class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j=nums.length-1;
        int i=0;
        while(i<=j){
            if(nums[i]%2!=0&&nums[j]%2==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            else if(nums[i]%2!=0&&nums[j]%2!=0){
                j--;
            }
            else{
                i++;
            }
            
        }
        return nums;
        
    }
}