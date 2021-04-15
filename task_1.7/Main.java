import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введиие длину бассейна: ");
        a = scanner.nextInt();
        System.out.print("Введиие ширину бассейна: ");
        b = scanner.nextInt();
        System.out.print("Введиие высоту бассейна: ");
        c = scanner.nextInt();
        System.out.println("Объем бассейна: " + a*b*c);
    }
}
