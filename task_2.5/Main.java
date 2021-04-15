import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        a = scanner.nextInt();
        if (a==10)
        {
            System.out.println("Верно");
        }
        else
        {
            System.out.println("Неверно");
        }
    }
}
