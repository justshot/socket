import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private void startServer() {
        try {
            ServerSocket ss = new ServerSocket(8080);
            while (true) {
                Socket socket = ss.accept();
                System.out.println("Accepted connection from " + socket.getInetAddress());
                InputStream in = socket.getInputStream();
                int i;
                while((i = in.read()) != -1) {
                    System.out.println(i);
                }
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server().startServer();
    }
}
