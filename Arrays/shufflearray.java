// Problem: Shuffle an Array
// Topic: Arrays
// Pattern: Fisher-Yates Shuffle (Randomized Algorithm)
// Time: O(n)
// Space: O(n)


class Solution {
     private int[] original;
    private int[] array;
    private Random rand;

    public Solution(int[] nums) {
         original = nums.clone();   // store original
        array = nums.clone();      // working copy
        rand = new Random();
    }
    
    public int[] reset() {
        array = original.clone();  // restore original
        return array;
    }
    
    public int[] shuffle() {
         for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);  // random index [0, i]

            // swap
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}

