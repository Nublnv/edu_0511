import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число a: ");
        a = scanner.nextInt();
        System.out.println("Введите число b: ");
        b = scanner.nextInt();
        System.out.println(eq(a,b));
    }
    public static boolean eq(int a, int b)
    {
        return a==b;
    }
}
