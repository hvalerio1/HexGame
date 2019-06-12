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
public class PlayerConnect {

    private DataInputStream input1;
    private DataOutputStream output1;
    private DataInputStream input2;
    private DataOutputStream output2;
    private Socket client1;
    private Socket client2;
    private final String HOST = "127.0.0.1";
    private final int PORT = 12345;
    private boolean play1 = false;
    private boolean play2 = false;

    public void runClient() {
        try {
            connectToServer1();
            connectToServer2();
            getStreams();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeConnection1();
            closeConnection2();
        }

    }

    private void connectToServer1() throws IOException {
        System.out.println("<<Conectando al servidor>>");
        client1 = new Socket(HOST, PORT);
        play1 = true;
        System.out.println("Se ha conectado al servidor el jugador 1.");
    }

    private void connectToServer2() throws IOException {
        System.out.println("<<Conectando al servidor>>");
        client2 = new Socket(HOST, PORT);
        play2 = true;
        System.out.println("Se ha conectado al servidor el jugador 1.");
    }

    private void getStreams() throws IOException {
        input1 = new DataInputStream(client1.getInputStream());
        output1 = new DataOutputStream(client1.getOutputStream());
        output1.flush();
        input2 = new DataInputStream(client1.getInputStream());
        output2 = new DataOutputStream(client1.getOutputStream());
        output2.flush();
    }

    private void processConnection() {
        
    }

    private void closeConnection1() {
        try {
            client1.close();
            System.out.println("Se ha desconectado el cliente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void closeConnection2() {
        try {
            client2.close();
            System.out.println("Se ha desconectado el cliente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new PlayerConnect().runClient();
    }
}
