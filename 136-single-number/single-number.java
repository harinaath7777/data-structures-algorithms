class Solution {
    public int singleNumber(int[] nums) {
        int i;
        int value=0;
        for(i=0;i<nums.length;i++){
            value=value^nums[i];

        }
        return value;

    }
}