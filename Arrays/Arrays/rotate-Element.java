// Problem: Rotate Array
// Pattern: Array Reversal
// Time: O(n)
// Space: O(1)


class Solution {
    public int[] rotateElements(int[] nums, int k) {
       


        List<Integer> nonNeg = new ArrayList<>();

        
        for (int num : nums) {
            if (num >= 0) {
                nonNeg.add(num);
            }
        }

        int size = nonNeg.size();
        if (size == 0) return nums;

        k = k % size;

        
        List<Integer> rotated = new ArrayList<>();

        for (int i = k; i < size; i++) {
            rotated.add(nonNeg.get(i));
        }

        for (int i = 0; i < k; i++) {
            rotated.add(nonNeg.get(i));
        }

        
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                nums[i] = rotated.get(index++);
            }
        }

        return nums;
    }
}
