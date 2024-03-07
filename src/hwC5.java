import java.util.Scanner;

public class hwC5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        for (int i = 0; i <= str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}
