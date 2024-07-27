class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        

        for(int i = 0; i <= num_list.length - n; i+=n){
            
            int idx = 0;
            for(int j = i; j < i + n; j++){
                answer[i / n][idx++] = num_list[j];
             }
        }
        
        return answer;
    }
}