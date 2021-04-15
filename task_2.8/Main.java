public class Main {
    public static void main(String[] args) {
        int[] array = { 2, 3, 4, 5 };
        int result = 1;
        for (int i: array)
        {
            result *= i;
        }
        System.out.println(result);
    }
}
