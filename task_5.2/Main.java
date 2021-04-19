import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> families = new ArrayList<>();
        List<String> cities = new ArrayList<>();
        String city = null;
        boolean fOrC = false;

        while (true)
        {
            if (fOrC)
            {
                String family = scanner.nextLine();
                if (family.isEmpty())
                {
                    break;
                }
                families.add(family);
                fOrC = false;
            }
            else
            {
                city = scanner.nextLine();
                if (city == null)
                {
                    break;
                }
                if (!cities.contains(city))
                {
                    cities.add(city);
                    fOrC = true;
                } else
                {
                    break;
                }
            }
        }
        if (city != null)
        {
            System.out.println(families.get(cities.indexOf(city)));
        }
    }
}
