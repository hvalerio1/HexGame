package View;

import Logic.Button;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class BoardGui extends JFrame {

    private Button[][] matrizBo;
    private int x = 0;
    private int y = 0;

    public BoardGui(int size) {
        matrizBo = new Button[size][size];
        addBotton();
    }

    public void addBotton() {
        for (int i = 0; i < matrizBo.length; i++) {
            for (int j = 0; j < matrizBo[0].length; j++) {
                Button bott = new Button(' ');
                bott.setSize(100, 100);
//                bott.setBounds(x, y, 100, 100);
                this.add(bott);
            }
        }
    }

    public static void main(String[] args) {
        BoardGui br = new BoardGui(7);
        br.setVisible(true);
        br.setLocationRelativeTo(null);
        Button bt = new Button(' ');
        bt.click();
        
    }

}
