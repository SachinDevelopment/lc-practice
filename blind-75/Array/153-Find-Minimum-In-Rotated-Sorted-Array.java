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

// Binary search
class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 0) return -1;
        if(nums.length == 1) return nums[0];
        
        int left = 0;
        int right = nums.length-1;
        int min = nums[0];
        while(left <= right){
            int mid = left + (right-left) / 2; 
            Math.min(min,mid);
            
            if(mid != 0 && nums[mid] < nums[mid-1]) return nums[mid];
            
            if(nums[mid] > nums[right]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }