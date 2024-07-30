import java.util.*;

class Solution {
    public String solution(String my_string) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++){
            set.add(String.valueOf(my_string.charAt(i)));
       }
        

        for(String str : set){
            sb.append(str);
        }
        
        return sb.toString();
    }
}