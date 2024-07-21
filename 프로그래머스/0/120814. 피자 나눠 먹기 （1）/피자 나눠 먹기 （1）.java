import java.util.*;

class Solution {
    public int solution(int n) {
        
        if(n / 7 <= 1){
            return 1;
        }
     
        return (int) Math.ceil((double)n / 7);
    }
}