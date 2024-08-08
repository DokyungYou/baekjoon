import java.util.*;


// 가로: y가 같은 것들의 x의 차이값
// 세로: x가 같은 것들의 y의 차이값
// 잘못된 입력은 주어지지 않고, 축에 평행하게 입력됨
class Solution {
    public int solution(int[][] dots) {
        int width = -1;
        int height = -1;

        for(int i = 1; i < dots.length; i++){
            if(dots[0][0] == dots[i][0]){
                height = Math.abs(dots[0][1] - dots[i][1]);
            }
            if(dots[0][1] == dots[i][1]){
                width = Math.abs(dots[0][0] - dots[i][0]);
            }

        }
        
        return width * height;
     }
}
