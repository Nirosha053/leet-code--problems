import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int sLen=s.length();
        int i,j,maxLen=0;
        for(i=0;i<sLen;i++){
            HashMap<Character,Integer>h1=new HashMap<>();
        for(j=i;j<sLen;j++){
            var it=h1.get(s.charAt(j));
            if(it!=null){
                break;
            }
            else{
             h1.put(s.charAt(j),1);
            maxLen=Math.max(maxLen,j-i+1);
         
            }
    }

        }
     return maxLen;   
    }
}