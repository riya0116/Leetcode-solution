 // Problem: Merge Intervals
// Topic: Arrays
// Pattern: Greedy + Sorting (Interval Merging)
// Time: O(n log n)
// Space: O(n)/ /Step 1: Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {
            // Step 2: If result is empty OR no overlap
            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval);
            } else {
                // Step 3: Merge intervals
                result.get(result.size() - 1)[1] =
                    Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][]);
