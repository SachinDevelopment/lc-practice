## Array

### 1. Two Sum - Given a nums [] array and a target. Find two unique indexes in the array where their values would add upto the  target.

#### Solution #1 -  time - O(N) and space - O(N)
`nums = [1,3,5], target = 8, solution is [1,2]`
1. Create a hashmap.
2. In one pass - Iterate through the array, check if target-nums[i] exists in the hash table, if it exists return i and value from hashtable. If it doesn't exist add it to the hash table as key = nums[i], value=i. 

#### Solution #2 - time - O(N) and space - O(N)
1.Create a list
2. First pass - iterate through the nums[] array and add it to the list
3. Second pass - iterate through again and check if nums[i] exists in the list and use indexOf to get the elements index

### 121. Best Time to Buy and Sell Stock - You are given an array prices where prices[i] is the price of a given stock on the ith day. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

#### Solution #1 - time - O(N) and space = O(1)
1. Keep track of max profit and min buy price
2. Iterate through list of prices. Calculate today's profit then compare to max profit. Compare existing buy price
to todays buy price. 
3. Whenever you find a new min, you will basically be calculating profits for that price moving forward so if you are to run into a scenario where there is not a good point to sell your new purchase, you still have max profit from your previous calculation.

### 217. Contain's duplicate - Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

#### Solution #1 time - O(N) and space - O(N) 
1. Create Hashmap
2. check if elemenent exists in hashmap return true if its the case, keep putting elements into hashmap if else. 
3. return false on default.

### 53. Maximum subarray - Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

#### Solution: time - O(N) and space = O(1)
`Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 Output: 6
 Explanation: [4,-1,2,1] has the largest sum = 6.`
1. Similar to the #121 problem. We need to keep tracking of the Maximum sum and have a running sum. You keep adding nums[i]
to sum, if the current sum is less than a single element at nums[i], we want to set sum to nums[i]. We also check if sum is greater than maxSum, if so set max sum to sum.
2. In the example that means -2,1,-3,4 = 0, 4 alone beats that, so we would rather just use 4 as sum and therefore maxSum at that time. We keep adding onto 4 + -1 + 2 + 1 and this would be seen as a max sum at one point even though we will over ride it with the -5 soon. The 4 at the end will eventually become sum but it's still greater than the maxSum. If there was another elmeent such as a 5 in that continuous range from -2 to 4 at the start then we would just keep going with that range. 


### 238. Product of Array Except Self - Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

#### Solution #1: time - O(N) and space O(N).
1. First pass get the total product.
2. Second pass use division to do product[i] = totalProduct / nums[i] to get rid itself

#### Solution #2:  time - O(N) and space O(N) - (Implemented approach - no division follow up from step 1): 
1. Set Leftproduct[start] = 1 and set RightProduct[end] = 1 or else it will be multiplication on 0
2. Pass from the left side setting leftProduct[i] = leftProduct[i-1] * nums[i-1] start -> end
3. Pass from the right side setting rightProduct[i] = LeftProduct[i+1] * nums[i+1] end -> start
4. We will notice that on the left pass, the last element is skipped and on the right pass the first element is skipped, this is okay because once we do left[i] * right[i] to get a product[i], this will fill any necessary gaps and since we did i + offset, we will not include the current element in the products.

#### Solution #3: time - O(N) and space O(1) 
1. We can do the exact approach above and skip the left/right array and directly put the leftProducts into the output array. When we calculate the right array we will directly do the multiplication there avoiding a third pass and any unnecessary space.


### 153. Find Minimum in Rotated Sorted Array - Suppose an array of length n sorted in ascending order is rotated between 1 and n times. Given the sorted rotated array nums of unique elements, return the minimum element of this array.

#### Solution #1: time O(log(n)) and space O(1)

1. Keep track of lowest value if the array happens to be not rotated.
2. Use Binary search:
    start pointer
    end pointer
    mid = left + (right - left) / 2
3. If we ever hit a mid pointer where step 2 from solution 2 is hit, we return immediately
4. If our nums[mid] is ever greater than nums[right],
we know that the minimum must lie between mid -> right, so we move the left pointer to mid + 1
5. If step 4 is not true, we know to move the right pointer inward as the solution must lie from left -> mid
6. Key here is to know #3 and that the only way the lowest value can be on the right side is if mid is greater than right since 5...8......4 is only possible if smallest value in that range is between 8 and 4

#### Solution #2: time - O(n) and space = O(1)

1. Keep track of lowest value if the array happens to be not rotated. 
2. Iterate through array if at any point you find a nums[i] which is less than the previous value of nums[i-1], return it since that means nums[i] is the lowest. Example 345(1)23, since nums[3] (1) is less than nums[2] (5) we know we found the point where the array stopped sorting as expected so return num[3] (1). 
3. If this scenario is not found that means we have a typical incremented array of n < n+1. therefore return the smallest n.

### 33. Search in Rotated Sorted Array

#### Solution #1: time O(log(n)) and space O(1)
1. Same as above question but instead you need to determine which side is sorted correctly
2. look at code...




















