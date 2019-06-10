/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Jenner Rodriguez
 */
public class Client {

    private DataInputStream input;
    private DataOutputStream output;
    private Socket client;
    private final String HOST = "127.0.0.1";
    private final int PORT = 12345;

    public void runClient() {
        try {
            connectToServer();
            getStreams();
        } catch (IOException e) {
        } finally {
            closeConnection();
        }

    }

    private void connectToServer() throws IOException {
        System.out.println("<<Conectando al servidor>>");
        client = new Socket(HOST, PORT);
        System.out.println("Se ha conectado al servidor.");
    }

    private void getStreams() throws IOException {
        input = new DataInputStream(client.getInputStream());
        output = new DataOutputStream(client.getOutputStream());
        output.flush();
    }

    private void processConnection() {

    }

    private void closeConnection() {
        try {
            client.close();
            System.out.println("Se ha desconectado el cliente.");
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        new Client().runClient();
    }
}
