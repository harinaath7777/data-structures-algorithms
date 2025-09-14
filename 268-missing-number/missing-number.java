class Solution {
    public int missingNumber(int[] nums) {
        int i;
        int sum=0;
        int n=nums.length;
        for(i=0;i<n;i++){
            sum+=nums[i];
        }
        int actualsum=(n*(n+1))/2;
        int missingnum=actualsum-sum;
        return missingnum;
    }
    
}