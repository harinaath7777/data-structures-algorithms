class Solution {
    public String longestCommonPrefix(String[] strs) {
      Arrays.sort(strs);
      String str1=strs[0];
      String str2=strs[strs.length-1];
      int count=0;
      int i;
      for(i=0;i<str1.length();i++){
        if(str1.charAt(count)==str2.charAt(count)){
            count++;
        }else {
            break;
        }
      }
        return count==0?"":str1.substring(0,count);
      
    }
}