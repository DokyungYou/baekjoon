import java.util.*;

class Solution {
    public int[] solution(int n) {
        
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
        
        //return list.stream().mapToInt(x -> x).toArray();  //느림
        
        int[] result = new int[list.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
}