class Solution {

    private int countSubarrays(int[] nums, int maxSum) {
        int subarrays = 1;
        int sum = 0;

        for (int x : nums) {
            if (sum + x <= maxSum) {
                sum += x;
            } else {
                subarrays++;
                sum = x;
            }
        }
        return subarrays;
    }

    public int splitArray(int[] nums, int k) {

        int low = 0, high = 0,ans=0;

        // low = max element, high = sum of array
        for (int x : nums) {
            low = Math.max(low, x);
            high += x;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int subarrays = countSubarrays(nums, mid);

            if (subarrays > k) {
                low = mid + 1;      // mid too small
            } else {
                ans=mid;
                high = mid - 1;    // try smaller answer
            }
        }

        return ans;
    }
}
