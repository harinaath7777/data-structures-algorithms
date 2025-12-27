class Solution {
    public int reversePairs(int[] nums) {
        int n=nums.length;
        return mergesort(nums,0,n-1);
    }
    public static int mergesort(int[] nums,int low,int high){
        int cnt=0;
        if(low>=high)return cnt;
        int mid=(low+high)/2;
        cnt+=mergesort(nums,low,mid);
        cnt+=mergesort(nums,mid+1,high);
        cnt+=countinversion(nums,low,mid,high);
        merge(nums,low,mid,high);
        return cnt;
    }
    public static int countinversion(int[] nums,int low,int mid,int high){
        int cnt=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && nums[i] > 2L*nums[right]){
                right++;
            }
            cnt+=(right-(mid+1));
        }
        return cnt;
    }
    public static void merge(int[] nums,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        ArrayList<Integer> temp=new ArrayList<Integer>();
        while(left<=mid && right <=high){
            if(nums[left]<=nums[right]){
                temp.add(nums[left]);
                left++;
            }
            else{
                temp.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }
        while(right<=high){
            temp.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            nums[i]=temp.get(i-low);
        }
    }
}