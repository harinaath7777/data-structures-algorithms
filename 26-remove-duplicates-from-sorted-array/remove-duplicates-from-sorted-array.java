class Solution {
    public int removeDuplicates(int[] nums) {
        // harinaath
        int len=nums.length;
        int count=0;
        for(int i=0;i<len;i++){
            if(i<len-1 && nums[i]==nums[i+1]){
                continue;
            }else{
                nums[count]=nums[i];
                count++;

            }
        }
        return count;
    }
}