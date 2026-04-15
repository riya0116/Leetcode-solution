// Problem: Find Numbers with Even Number of Digits
// Topic: Arrays
// Pattern: Simulation (Digit Counting)
// Approach: Count digits using division
// Time: O(n)
// Space: O(1)


class Solution {
    public int findNumbers(int[] nums) {
         int evenCount = 0;

        for (int num : nums) {
            int digits = 0;
            int temp = num;

            while (temp > 0) {
                temp = temp / 10;
                digits++;
            }

            if (digits % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }
}
    
