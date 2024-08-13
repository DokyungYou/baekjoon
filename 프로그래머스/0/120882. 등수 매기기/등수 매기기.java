import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        
        double[][] scoreRecord = new double[score.length][2];
        
        for(int i = 0; i < score.length ; i++){
            scoreRecord[i][0] = i;
            scoreRecord[i][1] = (double)(score[i][0] + score[i][1]) / 2;
        }
        
        Arrays.sort(scoreRecord, new Comparator<double[]>(){
            @Override
            public int compare(double[] o1, double[] o2) {
                return Double.compare(o2[1], o1[1]);
                //return (o1[1] < o2[1]) ? 1 : (o1[1] == o2[1]) ? 0 : -1;
            }
        });
        
       
        int[] answer = new int[score.length];
        
        answer[(int)scoreRecord[0][0]] = 1;
        for(int i = 1; i < scoreRecord.length ; i++){
            
            if(scoreRecord[i-1][1] == scoreRecord[i][1]){
                 answer[(int)scoreRecord[i][0]] = answer[(int)scoreRecord[i-1][0]];
            }else{
                answer[(int)scoreRecord[i][0]] = i+1;
            }
          
        }
        
        return answer;
    }
}