class Solution {
    public void setZeroes(int[][] matrix) {
        //harinaath
        int rowlen=matrix.length;
        int collen=matrix[0].length;
        int[] row=new int[rowlen];
        int[] col=new int[collen];
        int i,j;
        for(i=0;i<rowlen;i++){
            for(j=0;j<collen;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;

                }
            }
        }
        for(i=0;i<rowlen;i++){
            for(j=0;j<collen;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}