import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        
        
        for(int i = 0; i < keyinput.length; i++){
            
            String key = keyinput[i];
           
            switch(key){
                case "left":
                    move(board,answer,-1,0);
                    break;
                    
                case "right":   
                    move(board,answer,1,0);
                    break;
            
                case "up": 
                    move(board,answer,0,1);
                    break;
                    
                case "down":
                    move(board,answer,0,-1);
                    break;
    
            }
        }
        
        return answer;
    }
    
    static void move(int[] boardSize, int[] position, int x, int y){
        
        int xp = position[0] + x;
        int yp = position[1] + y;
        
        if( Math.abs(xp) <= boardSize[0]/2 &&  Math.abs(yp) <= boardSize[1]/2){
            position[0] = xp;
            position[1] = yp;
        }
        
    }

}