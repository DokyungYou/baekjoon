class Solution {
    public int solution(String str1, String str2) {
        
        int count = 0;
        int idx = 0;
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == str2.charAt(idx++)){
                count++;
            }else{
                count = 0;
                idx = 0;
            }
            
            if(count >= str2.length()){
                return 1;
            }
        }
        return 2;
    }
}