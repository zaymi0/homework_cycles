import java.util.Scanner;

public class hwC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++){

            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
