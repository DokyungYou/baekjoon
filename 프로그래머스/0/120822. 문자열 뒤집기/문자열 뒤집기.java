class Solution {
    public String solution(String my_string) {
        char[] charArr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i = charArr.length -1 ; i >= 0; i--){
            sb.append(charArr[i]);
        }   
        
        return sb.toString();
    }
}