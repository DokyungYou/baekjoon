class Solution {
    public int[] solution(int[] array) {
        int[] max = new int[2];
        
        for(int i = 0; i< array.length; i++){
            if(array[i] > max[0]){
                max[0] = array[i];
                max[1] = i;
            }
        }
        return max;
    }
}