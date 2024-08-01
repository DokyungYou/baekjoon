import java.util.*;

class Solution {
    public Integer[] solution(int n) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        
        
        if(n % 2 != 0){
            for(int i = 3; i <= n; i+=2){
                if(n % i == 0){
                    list.add(i);
                }
            }
        }else{
            for(int i = 2; i <= n; i++){
                if(n % i == 0){
                    list.add(i);
                }
            }
        }
        //list.add(n);
        
        return list.toArray(new Integer[0]);
    }
}