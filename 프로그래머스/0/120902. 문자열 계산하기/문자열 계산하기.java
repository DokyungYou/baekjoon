import java.util.*;

class Solution {
    public int solution(String my_string) {

        String[] strArr = my_string.split(" ");
        
        int result = Integer.parseInt(strArr[0]);
        for(int i = 2; i < strArr.length ; i+=2){
            
            if(strArr[i-1].equals("+")){
                result += Integer.parseInt(strArr[i]);
            }else{
                result -= Integer.parseInt(strArr[i]);
            }
        }
        
        return result;
    }
}