class Solution {
    public int[] solution(int n) {
       
       int length = (n % 2 == 0) ? n/2 : n/2+1 ;
       int[] array = new int[length];
        
        array[0] = 1;
        for(int i = 1; i < length ; i++){
            array[i] = array[i-1] + 2;
        }
        
        return array;
    }
}