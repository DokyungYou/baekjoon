import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer progression;
        progression = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(progression.nextToken()); // 수열의 숫자 개수
        int X = Integer.parseInt(progression.nextToken());

        progression = new StringTokenizer(br.readLine()); // 수열
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(progression.nextToken());
            if(num < X){
                sb.append(num);
                if(i != N-1){
                    sb.append(" ");
                }
            }

        }
        System.out.println(sb);

    }
}