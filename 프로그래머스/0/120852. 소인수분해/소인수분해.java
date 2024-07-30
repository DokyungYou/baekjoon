import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        TreeSet<Integer> set = new TreeSet<>();
        
       while(n % 2 == 0) {
            set.add(2);
            n /= 2;
        }
        for(int i = 3; i < n * n; i += 2) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        if(n > 2) {
            set.add(n);
        }
        
        
        int[] result = new int[set.size()];
     
        int idx = 0;
        for(int num : set){
            result[idx++] = num;
        }
        
        return result;
    }
}