import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int token;
        for (int i = 0; i < num; i++) {
            token = Integer.parseInt(st.nextToken());
            if(token < min){
                min = token;
            }
            if(token > max){
                max = token;
            }
        }
        System.out.println(min + " " + max);
        br.close();

    }
}