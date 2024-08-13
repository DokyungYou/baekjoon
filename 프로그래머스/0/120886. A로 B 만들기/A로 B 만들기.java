import java.util.*;

class Solution {
    public int solution(String before, String after) {

        int beforeNum = 0;
        int afterNum = 0;    
        for(int i =0; i < before.length(); i++){
            beforeNum += before.charAt(i);
            afterNum += after.charAt(i);
        }
        
       
        return beforeNum == afterNum ? 1 : 0;
     
    }
}