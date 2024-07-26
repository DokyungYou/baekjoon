import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = -1;
        int B = -1;
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            if(A == 0){
                br.close();
                break;
            }

            B = Integer.parseInt(st.nextToken());
            System.out.println(A+B);
        }

    }
}
