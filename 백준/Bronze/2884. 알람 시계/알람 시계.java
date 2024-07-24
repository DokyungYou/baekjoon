import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int num = minute - 45;
        if(num < 0){
            hour = (hour == 0) ? 23 : --hour;
            minute = 60 + num;
        }else {
            minute = num;
        }
        System.out.println(hour + " " + minute);

         br.close();
    }
}