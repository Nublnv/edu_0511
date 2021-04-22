import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;
import java.util.concurrent.TimeoutException;


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
            new ConnectThread(ip).start();
        }
    }

    private static class ConnectThread extends Thread
    {
        Ip ip;
        public ConnectThread(Ip ip)
        {
            this.ip = ip;
        }

        @Override
        public void run() {
            try {
                this.ip.test();
            }
            catch (Exception e)
            {

            }
            finally {
                System.out.println("ip: " + ip.getIp() + " port: " + ip.getPort() + " " + ip.getIsGood());
            }

        }
    }
}

class Ip
{
    private String ip = "";
    private String port = "";
    private boolean isGood = false;

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
    public boolean getIsGood()
    {
        return isGood;
    }

    public void test() throws Exception {
        SocketAddress address = new InetSocketAddress(this.ip,Integer.parseInt(this.port));
        Proxy proxy = new Proxy(Proxy.Type.HTTP,address);
        URL url = null;
        URLConnection conn = null;
        InputStream inputStream = null;
        BufferedReader reader;
        url = new URL("https://vozhzhaev.ru/test.php");
        conn = url.openConnection(proxy);
        if (conn != null) {
            try {
                inputStream = conn.getInputStream();
            }
            catch (SocketTimeoutException e)
            {
                return;
            }
        }
        if (inputStream != null){
            reader = new BufferedReader(new InputStreamReader(inputStream));
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.equals(this.ip))
                {
                    this.isGood = true;
                }
            }
        }
    }
}
