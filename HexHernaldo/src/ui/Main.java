package ui;

import Connection.Server;

public class Main {

    public static void main(String[] args) {
        Index index = new Index();
        index.setVisible(true);
        Server server = new Server();
        server.runServer();
    }
}
