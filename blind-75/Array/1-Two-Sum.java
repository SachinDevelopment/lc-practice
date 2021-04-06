class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numCounts = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(numCounts.containsKey(target-nums[i])){
                return new int[]{i,numCounts.get(target-nums[i])};
            }
            numCounts.put(nums[i], i);
        }
        
        return new int [] {-1,-1};
        
    }
}