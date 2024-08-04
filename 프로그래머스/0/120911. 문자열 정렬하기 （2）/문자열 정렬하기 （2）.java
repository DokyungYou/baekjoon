import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] charArr = my_string.toLowerCase().toCharArray();
        Arrays.sort(charArr);
        
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < charArr.length; i++){
            sb.append(charArr[i]);
        }
        return sb.toString();
    }
}