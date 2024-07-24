class Solution {
    public int solution(int n) {
        
        if(n == 1){
            return 1;
        }
        
        int cnt = 1;  //(1, n)
        
        int value = n;
        
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                value = n/i;
                break;
            }
        }
        
        for(int j = value; j > 0; j--){
            if(n % j == 0){
                cnt++;
            }
        }
    
        
        return cnt;
    }
}