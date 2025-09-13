class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int count1=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count=0;
            }else{
                count++;;
            }
            if(count1<count){
                count1=count;
            }
        }
        return count1;

    }
}