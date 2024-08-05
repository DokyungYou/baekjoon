import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int) Math.ceil(my_str.length() / (n * 1.0))];
        
        int idx = 0;
        for(int i = 0; i < my_str.length(); i+=n){
            int endIdx = (i+n) < my_str.length() ? (i+n) : my_str.length();
            
            answer[idx++] = my_str.substring(i, endIdx);
        }
        
        return answer;
    }
}