// Problem: Longest Common Prefix
// Topic: Strings
// Pattern: Horizontal Scanning (Prefix Reduction)
// Time: O(n * m)
// Space: O(1)

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Step 1: Edge case
        if (strs == null || strs.length == 0) return "";

        // Step 2: Take first string as prefix
        String prefix = strs[0];

        // Step 3: Compare with rest of strings
        for (int i = 1; i < strs.length; i++) {
            
            // Reduce prefix until it matches start of current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
