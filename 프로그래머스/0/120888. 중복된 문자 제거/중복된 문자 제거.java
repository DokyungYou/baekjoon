import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        String[] strArr = my_string.split("");
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(strArr));
        StringBuilder sb = new StringBuilder();
        

        for(String str : set){
            sb.append(str);
        }
        
        return sb.toString();
    }
}