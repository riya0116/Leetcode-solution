// Problem: Move Zeroes
// Pattern: Two Pointer (Stable Partition)
// Approach: Swap non-zero forward
// Time: O(n)
// Space: O(1)


class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
