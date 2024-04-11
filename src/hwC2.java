import java.util.Scanner;

public class hwC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        for (int i = 2; i < num; i += 2){
            System.out.print(i + " ");
        }
    }
}
