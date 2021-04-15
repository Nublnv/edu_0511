public class Main {
    public static void main(String[] args) {
        int num[] = { 4, 2, 6, 2, 65 };
        out(num);
    }
    public static void out(int[] num)
    {
        out(num,0);
    }
    public static void out(int[] num, int pos)
    {
        if (pos < num.length)
        {
            System.out.print(num[pos] + " ");
            out(num, pos + 1);
        }
    }
}
