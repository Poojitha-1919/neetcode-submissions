class Solution {
    public boolean isSubsequence(String s, String t) {
        // boolean subseq=false;
        int j=0;
        for(int i=0;i<t.length();i++){
        if(j <s.length() && s.charAt(j)==t.charAt(i)){
        j++;
        }
        }
         if(j==s.length()){
            return true;
         }
         return false;


    // node in neetcode
    // n chatAt(i) = true
    // o charAt(i) = false
    // i++; until found
    // d found true
    // ex : a not found then output=false
    }
}