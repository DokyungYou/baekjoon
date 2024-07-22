import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

        public static void main(String[] args) throws IOException {
            // 1번 연산 : poll
            // 2번 연산 : pushright(popleft)
            // 3번 연산 : pushleft(popright)
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer stz = new StringTokenizer(br.readLine()); //N과 M입력 값 받아옴
            int M = Integer.parseInt(stz.nextToken());
            int N = Integer.parseInt(stz.nextToken());
            int answer = 0; //최솟값출력위한 변수
            
            Deque<Integer> dq1 = new ArrayDeque<>();  //왜 두개를 만들었을까
            Deque<Integer> dq2 = new ArrayDeque<>();

            for (int i = 1; i <= M; i++) { //왜 뽑을 숫자의 개수로 두개나 만들었지..?
                dq1.addLast(i);
                dq2.addLast(i);
            }

            stz = new StringTokenizer(br.readLine()); // 뽑을 숫자들을 토큰으로 받아놓고 반복문 돌릴때마다 하나씩 꺼내게 만들었네
            for (int i = 0; i < N; i++) {
                int target = Integer.parseInt(stz.nextToken()); //토큰으로 받은 뽑을 숫자를 저장
                answer += Math.min(CCW(dq1, target), CW(dq2, target)); //2번연산,3번연산을 둘 다 돌리고 결과가 더 적은 횟수인 값을 누적저장
            }
            System.out.println(answer);

        }

        //연결리스트가 아니니까 인덱싱이 불가하고 어디가 더 빠른지 판단하는 조건문 짜기가 좀..복잡한
        //일단 2, 3번을 따로 구현해놓고 그걸 둘 다 돌려서 반복횟수를 비교 -> 작은 것을 선택


        //3번연산 (뒤에서 시작)
        private static int CW(Deque<Integer> dq, int target) {
            int cnt = 1;  //target을 맨앞자리까지 위치시키기까지의 횟수, 최소횟수가 1 (앞에 옮기려면 적어도 한번은 옮겨야하니까)
            while(true) {
                int temp = dq.pollLast();  //나중에 꺼낸 값을 앞으로 옮기기위한
                if(temp == target) {  //맨뒤에서 한번 꺼낸 값이 target과 같다면 바로 횟수리턴
                    return cnt;
                }else {
                    cnt++;   //target을 찾지 못했다면 횟수증가
                    dq.addFirst(temp);  //꺼낸 값을 front에 추가
                }
            }
        }


        
        //2번연산 (앞에서 시작)
        private static int CCW(Deque<Integer> dq, int target) {
            int cnt = 0;  //앞에서 세니까, 맨앞에 바로 있을 수 있기때문에 0부터 시작
            while(true) {
                int temp = dq.pollFirst();
                if(temp == target) {
                    return cnt;
                }else {
                    cnt++;
                    dq.addLast(temp);
                }

            }
        }
    }