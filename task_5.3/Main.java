import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> oldList = new ArrayList<>();
        ArrayList<Integer> newList = new ArrayList<>();
        int[] tmp = { -1, -2, 3, -4, 5, 6, 7, -8, 9, 10, 11, 12, 13, 14 };
        for(int t: tmp)
        {
            oldList.add(t);
        }

        for (int o : oldList)
        {
            if(o>0 && o<10)
                newList.add(o);
        }
        System.out.println(newList);
    }
}
