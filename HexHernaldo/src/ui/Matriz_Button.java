package ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import logic.HexButton;

/**
 * @author Cracks
 */
public class Matriz_Button extends javax.swing.JFrame  {

    private HexButton[][] matriz;
    private int size = 7;

    /**
     * Creates new form Matriz_Button
     */
    public Matriz_Button() {
        initComponents();
        this.jPnl_board.setBackground(Color.white);
        this.jugarBoton.setVisible(false);
        this.bt_CambiarTam.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPnl_board = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        generarBoton = new javax.swing.JButton();
        comboBoxNum = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jugarBoton = new javax.swing.JButton();
        bt_CambiarTam = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPnl_boardLayout = new javax.swing.GroupLayout(jPnl_board);
        jPnl_board.setLayout(jPnl_boardLayout);
        jPnl_boardLayout.setHorizontalGroup(
            jPnl_boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_boardLayout.createSequentialGroup()
                .addContainerGap(679, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(69, 69, 69))
        );
        jPnl_boardLayout.setVerticalGroup(
            jPnl_boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_boardLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addGap(0, 420, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel2.setText("Seleccionar el tamaño");

        generarBoton.setBackground(new java.awt.Color(0, 51, 204));
        generarBoton.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        generarBoton.setText("Generar");
        generarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarBotonActionPerformed(evt);
            }
        });

        comboBoxNum.setBackground(new java.awt.Color(51, 51, 255));
        comboBoxNum.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        comboBoxNum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7", "8", "9", "10", "11", "12" }));
        comboBoxNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNumActionPerformed(evt);
            }
        });

        jugarBoton.setBackground(new java.awt.Color(0, 255, 0));
        jugarBoton.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jugarBoton.setText("Jugar!");
        jugarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarBotonActionPerformed(evt);
            }
        });

        bt_CambiarTam.setBackground(new java.awt.Color(0, 51, 255));
        bt_CambiarTam.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        bt_CambiarTam.setText("Cambiar tamaño ");
        bt_CambiarTam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CambiarTamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(821, 821, 821)
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPnl_board, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jugarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(comboBoxNum, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(generarBoton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(bt_CambiarTam, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxNum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(generarBoton))
                        .addGap(18, 18, 18)
                        .addComponent(jugarBoton)
                        .addGap(30, 30, 30)
                        .addComponent(bt_CambiarTam))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPnl_board, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNumActionPerformed

    }//GEN-LAST:event_comboBoxNumActionPerformed

    private void generarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarBotonActionPerformed
        this.size = (int) Integer.parseInt((String) comboBoxNum.getSelectedItem());
        matriz = null;
        setMatriz(size);
        this.generarBoton.setVisible(false);
        this.jLabel2.setVisible(false);
        this.comboBoxNum.setVisible(false);
        this.jugarBoton.setVisible(true);
        this.bt_CambiarTam.setVisible(true);
    }//GEN-LAST:event_generarBotonActionPerformed

    private void jugarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarBotonActionPerformed
        // TODO add your handling code here:
        this.bt_CambiarTam.setVisible(false);
        
    }//GEN-LAST:event_jugarBotonActionPerformed

    private void bt_CambiarTamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CambiarTamActionPerformed
        this.jPnl_board.removeAll(); //Aquí estoy borrando la matriz que había, pero si la vuelvo a generar lo hace mal
        this.jLabel2.setVisible(true);
        this.comboBoxNum.setVisible(true);
        this.generarBoton.setVisible(true);
        this.jugarBoton.setVisible(false);
        this.bt_CambiarTam.setVisible(false);
    }//GEN-LAST:event_bt_CambiarTamActionPerformed

    /*
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Matriz_Button.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matriz_Button.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matriz_Button.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matriz_Button.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matriz_Button().setVisible(true);
            }
        });
    }

    private void setMatriz(int size) {
        int x = 40;
        int y = 0;
        matriz = new HexButton[size + 2][size + 2];
        for (int i = 0;
                i < matriz.length;
                i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = new HexButton();
                if (i == 0 || i == matriz.length - 1) {
                    matriz[i][j].setBackground(Color.red);
                    matriz[i][j].setBounds(x, y, 40, 40);
                    this.jPnl_board.add(matriz[i][j]);
                } else if (j == 0 || j == matriz.length - 1) {

                    matriz[i][j].setBackground(Color.blue);
                    matriz[i][j].setBounds(x, y, 40, 40);
                    this.jPnl_board.add(matriz[i][j]);
                } else {
                    matriz[i][j].setBounds(x, y, 40, 40);
                    this.jPnl_board.add(matriz[i][j]);
                    matriz[i][j].addActionListener(comboBoxNum);
                }
                x += 32;
            }
            x = 56 + (i * 15);
            y += 29;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_CambiarTam;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboBoxNum;
    private javax.swing.JButton generarBoton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPnl_board;
    private javax.swing.JButton jugarBoton;
    // End of variables declaration//GEN-END:variables

    
}
