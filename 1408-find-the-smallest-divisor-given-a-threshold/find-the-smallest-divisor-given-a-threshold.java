class Solution {

    private int sumByD(int[] nums, int div) {
        int sum = 0;
        for (int n : nums) {
            sum += (n + div - 1) / div;   // ceil(n / div)
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        
        int low = 1;
        int high = 0;

        // Find maximum element
        for (int n : nums) {
            high = Math.max(high, n);
        }

        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (sumByD(nums, mid) <= threshold) {
                ans = mid;        // store valid answer
                high = mid - 1;   // try smaller
            } else {
                low = mid + 1;    // need bigger divisor
            }
        }

        return ans;
    }
}
