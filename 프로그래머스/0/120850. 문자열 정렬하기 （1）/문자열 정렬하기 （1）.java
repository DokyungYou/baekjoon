import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        Queue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c >= 48 && c <= 57){
                queue.offer(Integer.valueOf(c - 48));
            }
        }
        
        int[] arr = new int[queue.size()];
        // int idx = 0;
        // for(int num : queue){
        //     arr[idx++] = num;
        // }
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = queue.poll();
        }
        return arr;
    }
}