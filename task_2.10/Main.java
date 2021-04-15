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
            System.out.print("Введите "+ (i+1) + " значение массива: ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < length - 1; i++)
        {
            if(array[i] == array[i+1])
            {
                System.out.println("Да");
                return;
            }
            else
            {
                continue;
            }
        }
        System.out.println("Нет");
    }
}
