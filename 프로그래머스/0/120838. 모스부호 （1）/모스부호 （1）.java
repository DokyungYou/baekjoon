import java.util.*;

class Solution {
    public String solution(String letter) {
         String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Map<String, Character> morseMap = new HashMap<>();
        
        for (int i = 0; i < morse.length; i++) {
            morseMap.put(morse[i], (char)('a' + i));
        }
        
        StringBuilder sb = new StringBuilder();
        for(String str : letter.split(" ")){
            sb.append(morseMap.get(str));
        }
        return sb.toString();
    }
}