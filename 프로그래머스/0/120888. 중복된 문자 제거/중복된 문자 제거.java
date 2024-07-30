class Solution {
    public String solution(String my_string) {
       StringBuilder sb = new StringBuilder();
        
       for(int i = 0; i < my_string.length(); i++){
           String str = String.valueOf(my_string.charAt(i));
           
           if(sb.indexOf(str) == -1){
               sb.append(str);
           }
       }
        return sb.toString();
    }
}