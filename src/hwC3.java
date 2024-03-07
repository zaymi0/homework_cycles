import java.util.Scanner;

public class hwC3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int num1 = 1;
        int sum;
        System.out.print("Введите число: ");
        int num3 = scanner.nextInt();

        for (int i = 2; i < num3; i++){
            sum = num + num1;
            num = num1;
            num1 = sum;
        }

        System.out.println(num1);
    }
}
