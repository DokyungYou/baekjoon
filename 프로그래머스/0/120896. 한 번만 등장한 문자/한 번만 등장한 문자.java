import java.util.*;

class Solution {
    public String solution(String s) {
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            treeMap.put(s.charAt(i), treeMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        
        for(Map.Entry<Character, Integer> entry : treeMap.entrySet()){
            if(entry.getValue() == 1){
                sb.append(entry.getKey());
            }
        }
        
        return sb.toString();
    }
}