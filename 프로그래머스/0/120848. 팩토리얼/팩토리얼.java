class Solution {
    public int solution(int n) {
        int num = 1;
        
        int factorial = 1;
        while(true){
            factorial *= ++num;
            if(factorial > n){
                --num;
                break;
            }
        }
        
        return num;
    }
}