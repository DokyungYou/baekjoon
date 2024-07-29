class Solution {
    public String solution(String my_string) {
        
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        
        for(char c : vowel){
            for(int i = 0; i < my_string.length() ; i++){
                my_string = my_string.replace(String.valueOf(c), "");
            } 
        }
        
        
        
        return my_string;
    }
}