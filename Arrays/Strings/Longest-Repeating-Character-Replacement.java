// Problem: Longest Repeating Character Replacement
// Topic: Strings
// Pattern: Sliding Window (Variable Size)
// Key Idea: window size - maxFreq <= k
// Time: O(n)
// Space: O(1)

public int characterReplacement(String s, int k) {
    int[] freq = new int[26]; // For A-Z
    int left = 0, maxFreq = 0, maxLength = 0;

    for (int right = 0; right < s.length(); right++) {
        char ch = s.charAt(right);
        freq[ch - 'A']++;

        maxFreq = Math.max(maxFreq, freq[ch - 'A']);

        while ((right - left + 1) - maxFreq > k) {
            freq[s.charAt(left) - 'A']--;
            left++;
        }

        maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
}
