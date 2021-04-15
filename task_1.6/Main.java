import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        String result;

        System.out.print("Введите число: ");
        number = scanner.nextInt();
        result = String.format("%.2f", (double)number * 1.15);
        System.out.println(result);
    }
}
