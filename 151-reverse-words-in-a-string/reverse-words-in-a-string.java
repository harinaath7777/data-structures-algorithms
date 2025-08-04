import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String[] a=s.trim().split("\\s+");
        int i;
        int len=a.length;
        StringBuilder result=new StringBuilder();
        for(i=len-1;i>=0;i--){
            result.append(a[i]);
            if(i!=0){
                result.append(" ");
            }
        }
        return result.toString();
    }
}