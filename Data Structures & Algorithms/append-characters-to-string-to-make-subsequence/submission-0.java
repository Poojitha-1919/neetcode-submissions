class Solution {
    public int appendCharacters(String s, String t) {
          int j=0;
          int len=t.length();
        for(int i=0;i<s.length();i++){
        if(j <t.length() && t.charAt(j)==s.charAt(i)){
        j++;
        }
        }
        return len-j;

    }
}