import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        int[] arr = new int[n];
        arr[0] = 1;
        
        int idx = 1;
        if(n % 2 != 0){
            for(int i = 3; i <= n; i+=2){
                if(n % i == 0){
                    arr[idx++] = i;
                }
            }
        }else{
            for(int i = 2; i <= n; i++){
                if(n % i == 0){
                    arr[idx++] = i;
                }
            }
        }
        
        return Arrays.copyOf(arr, idx);
    }
}