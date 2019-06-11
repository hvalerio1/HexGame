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
public class ConnectionThread extends Thread {

    private DataInputStream input1;
    private DataOutputStream output1;
    private DataInputStream input2;
    private DataOutputStream output2;
    private Socket connection1;
    private Socket connection2;

    public ConnectionThread(Socket connection1, Socket connection2) {
        this.connection1 = connection1;
        this.connection2 = connection2;
    }

    @Override
    public void run() {
        try {
            getStreams();
            processConnection1();
            processConnection2();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            closeConnection();
        }
    }

    private void getStreams() throws IOException {
        output1 = new DataOutputStream(connection1.getOutputStream());
        output2 = new DataOutputStream(connection2.getOutputStream());
        output1.flush();
        output2.flush();
        input1 = new DataInputStream(connection1.getInputStream());
        input2 = new DataInputStream(connection2.getInputStream());
    }
    
    private void processConnection1(){
        
    }
    
    private void processConnection2(){
        
    }

    private void closeConnection() {
        System.out.println("\nTerminating connection\n\n");
        try {
            output1.close();
            output2.close();
            input1.close();
            input2.close();
            connection1.close();
            connection2.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
