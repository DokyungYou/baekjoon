import java.util.*;

class Solution {
    public int solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        
        int result = Integer.parseInt(st.nextToken());
        char operator = '+';
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            
            if(!Character.isDigit(str.charAt(0))){
                operator = str.charAt(0);
            }else{
                if(operator == '+'){
                    result += Integer.parseInt(str);
                }else{
                    result -= Integer.parseInt(str);
                }
            }
        }
        
        return result;
    }
}