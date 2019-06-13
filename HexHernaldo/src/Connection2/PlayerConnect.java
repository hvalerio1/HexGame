/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection2;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JOptionPane;
import logic.HexButton;

/**
 *
 * @author Jenner Rodriguez
 */
public class PlayerConnect {

    private DataInputStream input1;
    private DataOutputStream output1;
    private Socket client1;
    private Socket client2;
    private final String HOST = "127.0.0.1";
    private final int PORT = 1234;
    private static boolean play1 = false;
    private static boolean play2 = false;

    public static boolean isPlay2() {
        return play2;
    }

    public void runClient() throws IOException {
        try {
            connectToServer1();
            getStreams();
            processConnection();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeConnection1();
        }

    }

    public void connectToServer1() throws IOException {
        System.out.println("<<Conectando al servidor>>");
        client1 = new Socket(HOST, PORT);
        JOptionPane.showMessageDialog(null, "Usted es el jugador numero 1, sus fichas son las de color rojo.");
        System.out.println("Se ha conectado al servidor el jugador.");
    }

    private void getStreams() throws IOException {
        input1 = new DataInputStream(client1.getInputStream());
        output1 = new DataOutputStream(client1.getOutputStream());
        output1.flush();
    }

    private void processConnection() throws IOException {

        HexButton.setColor(Color.RED);
    }

    private void closeConnection1() {
        try {
            client1.close();
            System.out.println("Se ha desconectado el cliente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private void closeConnection2() {
//        try {
//            client2.close();
//            System.out.println("Se ha desconectado el cliente.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    public static void main(String[] args) throws IOException {
        new PlayerConnect().runClient();
    }
}
