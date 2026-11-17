package chat;

import java.util.Arrays;
import java.util.List;

/** Joins the group chat. Usage: ChatClient [host] [port] [--tls] */
public class ChatClient {

    public static void main(String[] args) {
        boolean tls = Arrays.asList(args).contains("--tls");
        List<String> rest = Arrays.stream(args).filter(a -> !a.equals("--tls")).toList();
        String host = rest.size() > 0 ? rest.get(0) : "localhost";
        int port = rest.size() > 1 ? Integer.parseInt(rest.get(1)) : ChatServer.DEFAULT_PORT;

        System.out.println("Connecting to " + host + ":" + port + (tls ? " (TLS)" : " (plaintext)"));

        // TODO: connect with a Socket (SSLSocket when tls), ask for a username,
        // print incoming messages on one thread and send typed lines on this one.
    }
}
