public class Main {
    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] y = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String result;
        for (int i = 0; i < y.length; i++)
        {
            result = "";
            for (int j = 0; j < x.length; j++)
            {
                result += x[i]*y[j] + " ";
            }
            System.out.println(result);
        }
    }
}
