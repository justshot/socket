import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            OutputStream out = socket.getOutputStream();
            out.write(65);
            out.write(-1);
        }catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
