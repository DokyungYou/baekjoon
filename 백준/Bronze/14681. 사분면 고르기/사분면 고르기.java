import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int x = Integer.parseInt(br.readLine());
         int y = Integer.parseInt(br.readLine());

        
         int quadrant = 0;

        // 직관적이지 못한듯
//            if(x < 0){
//                quadrant = y < 0 ? 3 : 2;
//             }else{
//                quadrant = y < 0 ? 4 : 1;
//            }

         if(x > 0 && y > 0){
             quadrant = 1;
         }else if(x < 0 && y > 0){
             quadrant = 2;
         }else if(x < 0 && y < 0){
             quadrant = 3;
         }else if(x > 0 && y < 0){
             quadrant = 4;
         }

        System.out.println(quadrant);

         br.close();
    }
}