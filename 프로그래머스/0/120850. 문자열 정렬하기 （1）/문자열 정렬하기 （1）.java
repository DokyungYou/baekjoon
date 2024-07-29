import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c >= 48 && c <= 57){
                list.add(Integer.valueOf(c - 48));
            }
        }
        
        int[] arr = new int[list.size()];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        return arr;
    }
}