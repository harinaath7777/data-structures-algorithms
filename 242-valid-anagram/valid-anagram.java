class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        String[] a=s.split("");
        String[] b=t.split("");
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}