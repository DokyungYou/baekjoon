import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int max = numbers[numbers.length-1] * numbers[numbers.length-2];
        return max > (numbers[0] * numbers[1]) ? max : (numbers[0] * numbers[1]);
    }
}