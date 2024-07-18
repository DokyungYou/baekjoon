import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : array){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int mode = 0;
        int count = -1;
        boolean duplicate = false;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            
            int value = entry.getValue();
            if(value > count){
                count = entry.getValue();
                mode = entry.getKey(); 
                duplicate = false;
                
            }else if(value == count){
                duplicate = true;
            }
        }

        return duplicate ? -1 : mode;
    }
}