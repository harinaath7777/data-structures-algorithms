class Solution {
    public int[] replaceElements(int[] arr) {
        int i,j;
        
        for(i=0;i<arr.length-1;i++){
            int max=Integer.MIN_VALUE;
            for(j=i+1;j<arr.length;j++){
                if(arr[j]>max){
                    max=arr[j];
                }

            }
            arr[i]=max;
        }
            arr[arr.length-1]=-1;

            
        
        return arr;
        
        
    }
}