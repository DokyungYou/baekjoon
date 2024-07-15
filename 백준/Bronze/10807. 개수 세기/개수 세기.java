import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //정수의 개수
        StringTokenizer st = new StringTokenizer(br.readLine()); //N개의 정수들
        int V = Integer.parseInt(br.readLine()); //찾는 숫자

        int count=0;
        while (st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if(num == V){
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }

}