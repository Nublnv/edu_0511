import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] stings ={ "Мама","Мыла","Раму"};
        for (int i = 0; i< stings.length; i++)
        {
            for (int j = 0; j < stings.length; j++)
            {
                if(j!=i) {
                    for (int k = 0; k < stings.length; k++) {
                        if (k!=i && k!=j)
                            System.out.println(stings[i] + stings[j] + stings[k]);
                    }
                }
            }
        }

    }
}
