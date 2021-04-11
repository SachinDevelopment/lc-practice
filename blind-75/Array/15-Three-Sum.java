class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> allTriplets = new ArrayList<List<Integer>>();
       Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            if (!(i > 0 && nums[i-1] == nums[i])){
                while(left < right){
                   int total = nums[i] + nums[left] + nums[right];
                    if(total == 0){
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[left]);
                        triplet.add(nums[right]);
                        allTriplets.add(triplet);
                        left++;
                        while(nums[left] == nums[left-1] && left < nums.length-1){
                            left++;
                        }
                    } else if(total > 0 && right > 0){
                        right--;
                    } else if(left < nums.length) {
                        left++;
                    }
                }
            }
        }
        
        return allTriplets;
    }
}

