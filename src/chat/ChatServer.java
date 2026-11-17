package chat;

import java.util.Arrays;
import java.util.List;

/** Hosts the group chat. Usage: ChatServer [port] [--tls] */
public class ChatServer {

    static final int DEFAULT_PORT = 6789;

    public static void main(String[] args) {
        boolean tls = Arrays.asList(args).contains("--tls");
        List<String> rest = Arrays.stream(args).filter(a -> !a.equals("--tls")).toList();
        int port = rest.isEmpty() ? DEFAULT_PORT : Integer.parseInt(rest.get(0));

        System.out.println("Server on port " + port + (tls ? " (TLS)" : " (plaintext)"));

        // TODO: open a ServerSocket (SSLServerSocket when tls) and start a ClientHandler thread per connection.
    }
}
