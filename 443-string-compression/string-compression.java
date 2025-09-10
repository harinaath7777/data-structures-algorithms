class Solution {
    public int compress(char[] chars) {
        String code="";
        int count=0;
        char ptr=chars[0];
        for(char ch:chars){
            if(ch==ptr){
                count ++;
            }else{
                code+=ptr+(count>1?""+count:"");
                ptr=ch;
                count=1;
            }
        }
        code+=ptr+(count>1?""+count:"");
        for(int i=0;i<code.length();i++){
            chars[i]=code.charAt(i);
        }
        return code.length();
    }
}