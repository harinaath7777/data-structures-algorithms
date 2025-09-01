class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Boolean> map=new HashMap();
        int n=nums.length;
        int i;
        for(i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],true);
        }
        return false;
    }
}