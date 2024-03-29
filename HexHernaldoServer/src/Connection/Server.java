/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import logic.HexButton;

/**
 *
 * @author Jenner Rodriguez
 */
public class Server {

    private DataInputStream input;
    private DataOutputStream output;
    private ServerSocket server;
    private Socket connection1;
    private static boolean play1 = false;
    private final int PORT = 1234;
    private static int account = 0;

    public static boolean isPlay1() {
        return play1;
    }

    public static int getAccount() {
        return account;
    }

    public void runServer() {
        try {
            server = new ServerSocket(PORT);
            try {
                for (int i = 0; i < 2; i++) {
                    waitForConnection();
                    getStreams();
                    process();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                closeConnection();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeServer();
        }
    }
    private void waitForConnection() throws IOException {
        System.out.println("Esperando coneccion ");
        connection1 = server.accept();
        account++;
        System.out.println(account);
        play1 = true;
        System.out.println("Jugador conectado.");

    }

//    private void waitForConnection2() throws IOException {
//        System.out.println("Esperando connecion ");
//        connection2 = server.accept();
//        play2 = true;
//        System.out.println("Jugador 2 conectado.");
//    }
    private void getStreams() throws IOException {
        input = new DataInputStream(connection1.getInputStream());
        output = new DataOutputStream(connection1.getOutputStream());
        output.flush();
    }

    private void process() throws IOException {
        HexButton.setColor(java.awt.Color.BLUE);
    }

    private void closeServer() {
        try {
            server.close();
            System.out.println("Se cerró el servidor.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void closeConnection() {
        try {
            connection1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server().runServer();
    }
}
