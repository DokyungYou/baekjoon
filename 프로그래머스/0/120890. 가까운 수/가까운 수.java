import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        
        int closestNum = 0;
        int smallestDifference = 100;
        
        for(int i = 0; i < array.length; i++){ 
            int difference = Math.abs(array[i] - n);
            
            if(difference < smallestDifference){
                closestNum = array[i];
                smallestDifference = difference;
                
            }else if(difference == smallestDifference && array[i] < closestNum){
                closestNum = array[i];
            }
        }
        
        return closestNum;
    }
}