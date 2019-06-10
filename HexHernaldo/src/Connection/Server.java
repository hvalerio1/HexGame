/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Jenner Rodriguez
 */
public class Server {
    private ServerSocket server;
    private Socket connection1;
    private Socket connection2;
    private final int PORT = 12345;
    
    public void runServer(){
        try {
            server = new ServerSocket(PORT);
            waitForConnection1();
            waitForConnection2();
            new ConnectionThread(connection1, connection2);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            closeServer();
        }
    }
    
    
    private void waitForConnection1() throws IOException{
        System.out.println("Esperando connecion del jugador1");
        connection1 = server.accept();
        System.out.println("Jugador1 conectado.");
    }
    
    
    private void waitForConnection2() throws IOException{
        System.out.println("Esperando coneccion del jugador2.");
        connection2 = server.accept();
        System.out.println("Jugador2 conectado.");
    }
    
    private void closeServer(){
        try {
            server.close();
            System.out.println("Se cerró el servidor.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        new Server().runServer();
    }
}
