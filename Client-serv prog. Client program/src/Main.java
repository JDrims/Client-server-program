import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.zip.CheckedOutputStream;

public class Main {
    public static void main(String[] args) {
        try (Socket clientSocket = new Socket("127.0.0.1",10600);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            out.println("Dmitrii");
            String mes = in.readLine();
            System.out.println(mes);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}