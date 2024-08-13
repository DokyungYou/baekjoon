import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        if(Arrays.toString(beforeArr).equals(Arrays.toString(afterArr))){
            return 1;
        }
        
        return 0;
    }
}