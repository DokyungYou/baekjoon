import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int payment = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            payment -= (Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
        }

        if(payment == 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        br.close();
    }
}