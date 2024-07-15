class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum= 0;
        
        for(int i=0; i<numbers.length; i++){
           sum += numbers[i];
        }
        answer= (double)(sum) / numbers.length;
        
        System.out.println("numbers의 원소들의 평균 값은 "+ answer+"입니다."); 
        return answer;
    }
}
       
        