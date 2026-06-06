class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap<Character,Integer> map = new HashMap<>();
  
    if(s.length() != t.length()){
        return false;
    }else{
        // char sa[]=s.toCharArray();
        // char ta[]=t.toCharArray();
        // int n=sa.length;
        
        // for(int i=0;i<n;i++)
        // {
        //      map.put(sa[i],map.getOrDefault(sa[i],0)+1);
        //      map.put(ta[i],map.getOrDefault(ta[i],0)-1);   
        // }
         for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }
       
        for (int val : map.values()) {
            if (val != 0) return false;
        }
    
    }
    
    return true;


    }
}
