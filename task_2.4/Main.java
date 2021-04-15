import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double sum;
        double persent;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        sum = scanner.nextDouble();
        System.out.print("Введите % по вкладу: ");
        persent = scanner.nextDouble();
        for (int i = 0; i < 5; i++)
        {
            sum = sum * ((100.0+persent)/100.0);
            String result = String.format("%.2f",sum);
            System.out.println("Сумма по вкладу в конце " + (i+1) +" года: " + result);
        }
    }
}
