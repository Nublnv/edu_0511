import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int celsius;
        double fahrenheit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение в градусах цельсия: ");
        celsius = scanner.nextInt();
        fahrenheit = (9.0/5.0) * celsius + 32.0;
        System.out.println(fahrenheit);
    }
}
