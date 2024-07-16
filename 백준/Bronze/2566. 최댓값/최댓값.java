import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int row = 0;
        int column = 0;
        int maxNum = -1;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int num = scanner.nextInt();
                if(num > maxNum){
                    maxNum = num;
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(maxNum);
        System.out.println(row + " " + column);
        scanner.close();
    }
}