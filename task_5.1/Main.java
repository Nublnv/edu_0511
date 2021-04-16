import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList();
        names.add("Анатолий");
        names.add("Георгий");
        names.add("Руслан");
        names.add("Георгий");
        names.add("Павел");
        names.add("Руслан");
        deleteRepeats(names);
        System.out.println(names);
    }

    public static void deleteRepeats(ArrayList<String> list)
    {
        for (int i = 0; i < list.size(); i++) {
            String tmpString = list.get(i);
            for (int j = i; j <list.size(); j++) {
                if (list.lastIndexOf(tmpString) != i) {
                    list.remove(list.lastIndexOf(tmpString));
                }
                else
                {
                    break;
                }
            }
        }
    }
}
