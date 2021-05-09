import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        try {
            ServerSocket serverSocket = new ServerSocket(8188);
            while (true){
                Socket socket = serverSocket.accept(); //Ожидаем клиента
                System.out.println("Клиент подключился");
                User currentUser = new User(socket);
                users.add(currentUser);
                Thread thread = new Thread(new Runnable() { // Создаём поток для подключившегося клиента
                    @Override
                    public void run() {
                        try {
                            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                            DataInputStream in = new DataInputStream(socket.getInputStream());
                            out.writeUTF("Введите свое имя: ");
                            String userName = in.readUTF();
                            currentUser.setUserName(userName);
                            out.writeUTF(currentUser.getUserName() + " добро пожаловать на сервер!");
                            while (true){
                                String request = in.readUTF(); // Ожидаем сообщение от клиента
                                for (User user:users) {
                                    DataOutputStream userOut = new DataOutputStream(user.getSocket().getOutputStream());
                                    if (user != currentUser) {
                                        userOut.writeUTF(currentUser.getUserName() + ": " + request);
                                    }
                                }
                            }
                        } catch (IOException exception) {
                            users.remove(currentUser);
                            for (User user:users)
                            {
                                try {
                                    DataOutputStream userOut = new DataOutputStream(user.getSocket().getOutputStream());
                                    userOut.writeUTF(currentUser.getUserName()+" покинул чат");
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                });
                thread.start();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
