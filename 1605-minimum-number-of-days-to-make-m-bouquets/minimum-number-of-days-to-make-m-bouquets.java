class Solution {

    // Helper function to check if we can make m bouquets on 'day'
    public boolean possible(int[] bloomDay, int day, int m, int k) {
        int cnt = 0;
        int bouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                cnt++;
            } else {
                bouquets += cnt / k;
                cnt = 0;
            }
        }

        bouquets += cnt / k;   // remaining flowers

        return bouquets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        long required = (long) m * k;
        if (required > bloomDay.length) return -1;

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for (int x : bloomDay) {
            mini = Math.min(mini, x);
            maxi = Math.max(maxi, x);
        }

        int low = mini, high = maxi;
        int ans = -1;   // 🔥 store final answer here

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(bloomDay, mid, m, k)) {
                ans = mid;        // store valid day
                high = mid - 1;   // try smaller day
            } else {
                low = mid + 1;
            }
        }

        return ans;   // ✅ return ans, not low
    }
}
