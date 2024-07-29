class Solution {
    public String solution(String my_string) {
        
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            
            sb.append(my_string.charAt(i));
            for(int j = 0; j < vowel.length ; j++){
                if(my_string.charAt(i) == vowel[j]){
                    sb.deleteCharAt(sb.length()-1);
                    break;
                }
            }
        }
        
        
        return sb.toString();
    }
}