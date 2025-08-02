class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        int i;
        for(i=arr.length-1;i>=0;i--){
            int current=arr[i];
            arr[i]=max;
            if(current>max){
                max=current;
            }
        }
        return arr;
    }
}