import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static String name;
    public static void main(String[] args) {
        Socket socket = null;
        Scanner scanner = new Scanner(System.in);
        try {
            socket = new Socket("localhost",8188);
            DataInputStream  in =new DataInputStream(socket.getInputStream());
            DataOutputStream out=new DataOutputStream(socket.getOutputStream());
            String response = in.readUTF(); // Ждём сообщение от сервера
            System.out.println(response);
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while(true){
                        try {
                            String response = in.readUTF();
                            System.out.println(response);
                        } catch (IOException exception) {
                            System.out.println("Сервер недоступен");
                            System.exit(0);
                        }
                    }
                }
            });
            thread.start();
            while(true){
                String request = scanner.nextLine(); // Читам пользовательский ввод
                out.writeUTF(request); // Отправляем на сервер текст с коносли
            }
        } catch (Exception exception) {
            System.out.println("Сервер недоступен");
            System.exit(0);
        }
    }

    public static Socket Connect(String host, int port) throws Exception
    {
        Socket socket;
        try {
             socket = new Socket(host,port);
        }
        catch (Exception e) {
            throw e;
        }
        System.out.println("Подключился");
        DataInputStream  in = new DataInputStream(socket.getInputStream());
        if(in.readUTF().equals("OK"))
            return socket;
        else return null;
    }
}
