class Solution {
    public List<List<Integer>> generate(int numRows) {
        //harinaath
        List<List<Integer>> pascal=new ArrayList();
        int i;
        for(i=0;i<numRows;i++){
            List<Integer> row=new ArrayList();
            int j;
            for(j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }else{
                    List<Integer> prevrow=pascal.get(i-1);
                    row.add(prevrow.get(j)+prevrow.get(j-1));
                }
            }
            pascal.add(row);
        }
        return pascal;
    }
}