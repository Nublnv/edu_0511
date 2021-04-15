import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        a = scanner.nextInt();
        if (a != 1)
        {
            for (int i = 2; i < a; i++)
            {
                if (a%i == 0)
                {
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }
}
