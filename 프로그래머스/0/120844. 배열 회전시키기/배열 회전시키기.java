class Solution {
    public int[] solution(int[] numbers, String direction) {
        int left ,right = 0;
        
        if(direction.equals("right")){
    
            left = numbers[0];
            numbers[0] = numbers[numbers.length - 1];
            for(int i = 1; i < numbers.length; i++){
                
                right = numbers[i];
                numbers[i] = left;
                left = right;
            }
        }else{
            
            right = numbers[numbers.length - 1];
            numbers[numbers.length - 1] = numbers[0];
            for(int i = numbers.length - 2; i >= 0; i--){

                left = numbers[i];
                numbers[i] = right;
                right = left;
                
            }
        }
        
        return numbers;
    }
}