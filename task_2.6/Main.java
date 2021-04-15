import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        a = scanner.nextInt();
        System.out.print("Введите число b: ");
        b = scanner.nextInt();
        if (a%b==0)
        {
            System.out.println("Делится");
        }
        else
        {
            System.out.println("Делится с остатком "+ (a%b));
        }
    }
}
