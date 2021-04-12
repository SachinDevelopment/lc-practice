class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1) return nums.length;
        Arrays.sort(nums);
        int longest = 1;
        int running = 1;
        for(int i = 1; i < nums.length; i++){
            
           if(nums[i] == nums[i-1] + 1){
               running++;
           } else if(nums[i] != nums[i-1]){
               running = 1;
           }
            longest = Math.max(longest,running);
        }
        
        return longest;
    }
}

// this is only o(log n) n, o(n) solution is to just
// use a hash map