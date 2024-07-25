import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int num : numbers) queue.offer(num);

        //numbers의 길이가 3부터 시작
        
       
        int cnt=0;   //한번 던질때마다 증가
        int count=0;  //이건 걍 인덱스 하나씩 증가시키는거 (몇번 건너뛴건지 알아야하니까)
        int person;
        while(cnt<k){

            if(count % 2==0){  //하나씩 증가는 시키되 던질 차례가 될 때를 구하는 거에요 (2번마다 던져야하니까)
                cnt++;   //던질때마다 던진횟수를 증가
            }
            person = queue.poll();   //한놈씩 꺼내면서 인덱스를 한번 씩 증가시켰다는 의미로
            count++;     //한놈씩 꺼낼때마다 count를 증가시키는거에요.
            
            if(cnt == k){   //던진 횟수가 k번째가 된다면
                answer = person;   //이때 꺼낸 놈이 답이니까 정답에 넣어주는걸로
            }else{  //던진 횟수가 k번째가 아니라면
                queue.offer(person);  //걍 다시 넣어줍니다.
            }
        }  //반복
        return answer;
    }
}