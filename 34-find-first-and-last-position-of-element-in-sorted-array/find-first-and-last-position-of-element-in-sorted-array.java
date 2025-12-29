class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int lb=lowerbound(nums,n,target);
        if(lb ==n || nums[lb]!=target){
            return new int[]{-1,-1};
        }
        int ub=upperbound(nums,n,target);
        return new int[]{lb,ub-1};
    }
    public static int lowerbound(int[] nums,int n,int t){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=t){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int upperbound(int[] nums,int n,int t){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>t){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    
}