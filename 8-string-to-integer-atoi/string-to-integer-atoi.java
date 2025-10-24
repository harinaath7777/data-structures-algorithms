class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int sign=1;
        int i=0;
        long res=0;
        if(s.length()==0){
            return 0;
        }
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }else if(s.charAt(i)=='+'){
            i++;
        }
        for(int j=i;j<s.length();j++){
            char ch=s.charAt(j);
            int digit=ch-'0';
            if(digit<0||digit>9){
                break;
            }
            res=res*10+digit;
            if(res*sign>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(res*sign<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return (int) (res*sign);
    }
}