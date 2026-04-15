// Problem: Array Partition I
// Topic: Arrays
// Pattern: Greedy + Sorting
// Approach: Sort and take alternate elements
// Time: O(n log n)
// Space: O(1)

class Solution {
    public int arrayPairSum(int[] nums) {
         Arrays.sort(nums);
        
        int sum = 0;
        
        for(int i = 0; i < nums.length; i += 2){
            sum += nums[i];
        }
        
        return sum;
    }
}
