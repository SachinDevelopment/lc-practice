class Solution {
    public boolean containsDuplicate(int[] nums) {
       Map<Integer,Integer> numCounts = new HashMap<Integer,Integer>();
        
        for(int i = 0; i<nums.length; i++){
            if(numCounts.containsKey(nums[i])) return true;
            numCounts.put(nums[i],1);
        }
        
        return false;
    }
}