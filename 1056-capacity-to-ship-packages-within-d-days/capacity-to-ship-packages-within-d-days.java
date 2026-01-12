class Solution {

    private int findDays(int[] weights, int cap) {
        int days = 1;
        int load = 0;

        for (int w : weights) {
            if (load + w > cap) {
                days++;
                load = w;
            } else {
                load += w;
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        
        int low = 0, high = 0;

        for (int w : weights) {
            low = Math.max(low, w);   // max weight
            high += w;               // total sum
        }

        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (findDays(weights, mid) <= days) {
                ans = mid;        // store valid capacity
                high = mid - 1;   // try smaller
            } else {
                low = mid + 1;    // increase capacity
            }
        }

        return ans;
    }
}
