import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filePath;
        FileReader reader;
        int r;
        String textInFile = "";
        String textInLine = "";
        char[] textInFileChar;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        boolean isSorted = false;

        System.out.print("Введите путь к файлу: ");
        while(true) {
            filePath = scanner.nextLine();
            try {
                reader = new FileReader(filePath);
            } catch (FileNotFoundException ex) {
                System.out.print("Неверный путь к файлу. Введите другой путь: ");
                continue;
            }
            break;
        }
        while ((r = reader.read()) != -1)
        {
            textInFile += (char)r;
        }
        textInFileChar = textInFile.toCharArray();
        for (char c : textInFileChar) {

            {
                if (c != '\n' && c != '\r')
                {
                    textInLine += c;
                    continue;
                } else if (textInLine.equals(""))
                {
                    continue;
                }
                else {
                    numbers.add(Integer.parseInt(textInLine));
                    textInLine = "";
                }
            }
        }
        if (!textInLine.equals(""))
        {
            numbers.add(Integer.parseInt(textInLine));
        }
        if (numbers.size() != 0)
        {
            for (int i = 0; i < numbers.size(); i++)
            {
                if(numbers.get(i) % 2 != 0)
                {
                    numbers.remove(i);
                    i--;
                }
            }
        }
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.size() - 1; i++) {
                int buf;
                if(numbers.get(i) > numbers.get(i + 1)){
                    isSorted = false;
                    buf = numbers.get(i);
                    numbers.set(i, numbers.get(i + 1));
                    numbers.set(i + 1, buf);
                }
            }
        }
        System.out.println(numbers);
    }
}
