class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < rsp.length(); i++){
             char c = rsp.charAt(i);
             char win;
            if(c == '5'){
                win = '2';
            }else if(c == '2'){
                win = '0';
            }else{
                win ='5';
            }
            sb.append(win);
        }
        
        return sb.toString();
    }
}