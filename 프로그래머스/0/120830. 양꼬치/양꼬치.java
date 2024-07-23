class Solution {
    public int solution(int n, int k) {
        int payment = (12000 * n) + (2000 * k);
        
        if(n / 10 == 0){
            return payment;
        }else{
            return payment - (2000 * (n/10));
        }
        
    }
}