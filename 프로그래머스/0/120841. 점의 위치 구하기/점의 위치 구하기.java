class Solution {
    public int solution(int[] dot) {
        int result = 0;
        
        if(dot[1] > 0){  // y축 양수
            result = dot[0] > 0 ? 1 : 2;
        }else{
            result = dot[0] < 0 ? 3 : 4;
        }
        
        return result;
    }
}