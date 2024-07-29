import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        while(n > 1){
            
            for(int i = 2 ; i <= n ; i++){
                if(n % i == 0){
                    treeSet.add(i);
                    n/= i;
                    i = 1;
                    
                    if(n == 1) break;
                }
            }
        }
        
        int[] result = new int[treeSet.size()];
     
        int idx = 0;
        for(int num : treeSet){
            result[idx++] = num;
        }
        
        return result;
    }
}