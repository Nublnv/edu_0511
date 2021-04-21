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
        ArrayList<Ip> ips = new ArrayList<>();

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
                    ips.add(new Ip(textInLine));
                    textInLine = "";
                }
            }
        }
        if (!textInLine.equals(""))
        {
            ips.add(new Ip(textInLine));
        }
        for (Ip ip:ips) {
            System.out.println("ip: " + ip.getIp() + " port: " + ip.getPort());
        }
    }
}

class Ip
{
    private String ip = "";
    private String port = "";

    public Ip(String line)
    {
        boolean isIpFull = false;
        for (char l: line.toCharArray()) {
            if(l != ' ' && l!= '\t'  && !isIpFull)
            {
                ip += l;
            }
            else if(l !=' ' && l != '\t' && isIpFull)
            {
                port += l;
            }
            else isIpFull = true;
        }
    }

    public String getIp() {
        return ip;
    }

    public String getPort() {
        return port;
    }
}
