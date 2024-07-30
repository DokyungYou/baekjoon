

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        char c;
        for(int i = 0 ; i < my_string.length(); i++){
            
            c = my_string.charAt(i);
            if(c >= 97){
                sb.append((char)(c-32));
            }else{
                sb.append((char)(c+32));
            }
            
        }
        return sb.toString();
    }
}