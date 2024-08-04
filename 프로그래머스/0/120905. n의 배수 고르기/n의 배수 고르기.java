import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] result = new int[numlist.length];
        
        int idx = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                result[idx++] = numlist[i];
            }
        }
        
        return Arrays.copyOf(result, idx);
    }
}