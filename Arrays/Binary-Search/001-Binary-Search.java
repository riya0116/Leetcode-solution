// Problem: Median of Two Sorted Arrays
// Topic: Binary Search
// Pattern: Binary Search on Partition
// Time: O(log(min(n, m)))
// Space: O(1)

//1.
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n = nums1.length, m = nums2.length;
        int low = 0, high = n;

        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = (n + m + 1) / 2 - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];

            int right1 = (cut1 == n) ? Integer.MAX_VALUE : nums1[cut1];
            int right2 = (cut2 == m) ? Integer.MAX_VALUE : nums2[cut2];

            if (left1 <= right2 && left2 <= right1) {
                if ((n + m) % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }
            } 
            else if (left1 > right2) {
                high = cut1 - 1;
            } 
            else {
                low = cut1 + 1;
            }
        }

        return 0.0;
    }
}


//2.
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int n = nums1.length, m = nums2.length;
        int[] merged = new int[n + m];
        
        int i = 0, j = 0, k = 0;
        
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        
        while (i < n) merged[k++] = nums1[i++];
        while (j < m) merged[k++] = nums2[j++];
        
        int len = n + m;
        
        if (len % 2 == 0) {
            return (merged[len/2 - 1] + merged[len/2]) / 2.0;
        } else {
            return merged[len/2];
        }
    }
}
