import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] array;
        int length;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        length = scanner.nextInt();
        array = new int[length];
        for (int i = 0; i < length; i++)
        {
            System.out.print("Введите " + (i + 1) + " значение массива: ");
            array[i] = scanner.nextInt();
        }
        int result = 0;
        for (int i = 0; i < length; i++)
        {
            result +=array[i];
            if (result>10)
            {
                System.out.println((i + 1));
                return;
            }
        }
        System.out.println("Нельзя");
    }
}
