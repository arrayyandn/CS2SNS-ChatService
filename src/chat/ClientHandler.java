package chat;

import java.net.Socket;

/** Server side of one connected user. */
public class ClientHandler implements Runnable {

    private final Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // TODO: read this user's name and messages, and broadcast each message to everyone.
    }
}
