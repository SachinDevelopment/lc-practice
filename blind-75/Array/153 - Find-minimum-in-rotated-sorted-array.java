class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 0) return -1;
        if(nums.length == 1) return nums[0];
        
        int min = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] > nums[i]) return nums[i];
            min = Math.min(min,nums[i]);
        }
        
        return min;
    }
}