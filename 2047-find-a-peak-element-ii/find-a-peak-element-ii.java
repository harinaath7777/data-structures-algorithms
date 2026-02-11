class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid=(low+high)/2;
            int firstmax=findmax(mat,n,m,mid);
            int left= (mid-1>=0) ? mat[firstmax][mid-1]:-1;
            int right=(mid+1<m) ? mat[firstmax][mid+1] : -1;
            if(mat[firstmax][mid]>left && mat[firstmax][mid]>right){
                return new int[]{firstmax,mid};
            }
            else if(mat[firstmax][mid]<left){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    public static int findmax(int[][] mat,int n,int m,int mid){
        int max=-1;
        int index=-1;
        for(int i=0;i<n;i++){
            if(mat[i][mid]>max){
                max=mat[i][mid];
                index=i;
            }
        }
        return index;
    }
}