class Solution {
    public int solution(int order) {

        String strNum = String.valueOf(order);
        int count = 0;
        
        for(int i = 0; i < strNum.length(); i++){
            int num = strNum.charAt(i) - '0';
            
            if(num != 0 && num % 3 == 0 && num / 3 <= 3){
                count++;
            }
        } 
        return count;
    }
}