import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int time = Integer.parseInt(br.readLine());


        int num = minute + time;
        if(num >= 60){
            hour += (num / 60);
            minute = num % 60;
            if(hour > 23) hour -= 24;
        }else {
            minute = num;
        }
        System.out.println(hour + " " + minute);

         br.close();
    }
}