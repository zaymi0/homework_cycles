import java.util.Scanner;

public class hwC4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 1;
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        System.out.println(answer);
    }
}
