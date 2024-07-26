import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = (br.read() - 48);

        for (int i = 1; i <= 9 ; i++) {
            System.out.printf("%d * %d = %d\n",num, i, (num * i));
        }
        br.close();
    }
}