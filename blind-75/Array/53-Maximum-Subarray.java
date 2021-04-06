class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1 ) return nums[0];
        
        int maxSum = Integer.MIN_VALUE;
        int start = nums[0];
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum+=nums[i];
      
            if(nums[i] > sum){
                sum = nums[i];
            }
             maxSum=Math.max(maxSum,sum);
            
        }
        
        return maxSum;
    }
}

