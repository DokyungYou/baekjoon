import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(scanner.nextInt() + scanner.nextInt());
        }
        scanner.close();
    }
}