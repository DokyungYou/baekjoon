import java.util.*;

class Solution {
    public int solution(int n) {
        if(n == 6){
            return 1;
        }
        
        int gcd = gcd(Math.max(6, n), Math.min(6, n));
        
        return ((6 / gcd) * (n / gcd) * gcd) / 6;

    }
    
    static int gcd(int a, int b){
        
        int value = a % b;
        if(value == 0){
            return b;
        }
        
        return gcd(b, value);
    }

  }
