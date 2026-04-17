// Problem: Beautiful Array
// Topic: Divide and Conquer
// Pattern: Mathematical Construction
// Approach: Build using odd and even transformation
// Time: O(n)
// Space: O(n)




class Solution {
    public int[] beautifulArray(int n) {
        
       List<Integer> result = new ArrayList<>();
        result.add(1);

        while (result.size() < n) {
            List<Integer> temp = new ArrayList<>();

            for (int x : result) {
                if (2 * x - 1 <= n) temp.add(2 * x - 1);
            }

            for (int x : result) {
                if (2 * x <= n) temp.add(2 * x);
            }

            result = temp;
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        Solution obj = new Solution();   // ✅ create object
        int[] res = obj.beautifulArray(n);

        System.out.println(Arrays.toString(res));
    }
}
