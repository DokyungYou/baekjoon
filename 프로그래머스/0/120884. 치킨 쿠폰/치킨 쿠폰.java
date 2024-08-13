class Solution {
    public int solution(int chicken) {
        
        int service = 0;
        int leftover = 0;
        
        while(chicken >= 10){
            service += chicken / 10;
            leftover += chicken % 10;
            
            chicken/=10;
            
            if(chicken < 10){
                chicken += leftover;
                leftover = 0;
            }
        }
        
        return service;
    }
}