## Array

1. Two Sum - Given a nums [] array and a target. Find two unique indexes in the array where their values would add upto the  target.
nums = [1,3,5], target = 8, solution is [1,2]
Solution #1 -  time - O(N) and space - O(N)
Create a hashmap.
In one pass - Iterate through the array, check if target-nums[i] exists in the hash table, if it exists return i and value from hashtable. If it doesn't exist add it to the hash table as key = nums[i], value=i. 

Solution #2 - time - O(N) and space - O(N)
Create a list
First pass - iterate through the nums[] array and add it to the list
Second pass - iterate through again and check if nums[i] exists in the list and use indexOf to get the elements index

121. Best Time to Buy and Sell Stock - You are given an array prices where prices[i] is the price of a given stock on the ith day. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
