package ui;

import Connection.Server;

/*
 * @author Jenner Rodriguez
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    public Index() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbWelcome = new javax.swing.JLabel();
        lbNameH = new javax.swing.JLabel();
        lbNameJ = new javax.swing.JLabel();
        btLogin = new javax.swing.JButton();
        btSignIn = new javax.swing.JButton();
        lbNameJimmy = new javax.swing.JLabel();
        lbNameJ1 = new javax.swing.JLabel();
        lbNameJ2 = new javax.swing.JLabel();
        lbNameJ3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbWelcome.setFont(new java.awt.Font("Dialog", 2, 36)); // NOI18N
        lbWelcome.setForeground(new java.awt.Color(255, 0, 0));
        lbWelcome.setText("Juego Hex");

        lbNameH.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        lbNameH.setForeground(new java.awt.Color(0, 0, 255));
        lbNameH.setText("Hernaldo");

        lbNameJ.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        lbNameJ.setForeground(new java.awt.Color(0, 0, 255));
        lbNameJ.setText("Jenner ");

        btLogin.setBackground(new java.awt.Color(0, 0, 255));
        btLogin.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        btLogin.setForeground(new java.awt.Color(0, 0, 0));
        btLogin.setText("Ingresar");
        btLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        btSignIn.setBackground(new java.awt.Color(0, 0, 255));
        btSignIn.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        btSignIn.setForeground(new java.awt.Color(0, 0, 0));
        btSignIn.setText("Registrarse");
        btSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSignInActionPerformed(evt);
            }
        });

        lbNameJimmy.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        lbNameJimmy.setForeground(new java.awt.Color(0, 0, 255));
        lbNameJimmy.setText("Erick ");

        lbNameJ1.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        lbNameJ1.setForeground(new java.awt.Color(255, 0, 0));
        lbNameJ1.setText("Rodríguez");

        lbNameJ2.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        lbNameJ2.setForeground(new java.awt.Color(255, 0, 0));
        lbNameJ2.setText("Valerio");

        lbNameJ3.setFont(new java.awt.Font("Sylfaen", 0, 25)); // NOI18N
        lbNameJ3.setForeground(new java.awt.Color(255, 0, 0));
        lbNameJ3.setText("Vindas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btSignIn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbNameJ)
                            .addGap(18, 18, 18)
                            .addComponent(lbNameJ1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbNameH)
                            .addGap(18, 18, 18)
                            .addComponent(lbNameJ2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbNameJimmy, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbNameJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(77, 77, 77)
                .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNameJ)
                    .addComponent(lbNameJ1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNameH)
                    .addComponent(lbNameJ2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbNameJimmy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNameJ3))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        Login login = new Login(this, true);
        login.setVisible(true);
    }//GEN-LAST:event_btLoginActionPerformed

    private void btSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSignInActionPerformed
        SigIn sig = new SigIn(this, true);
        sig.setVisible(true);
    }//GEN-LAST:event_btSignInActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btSignIn;
    private javax.swing.JLabel lbNameH;
    private javax.swing.JLabel lbNameJ;
    private javax.swing.JLabel lbNameJ1;
    private javax.swing.JLabel lbNameJ2;
    private javax.swing.JLabel lbNameJ3;
    private javax.swing.JLabel lbNameJimmy;
    private javax.swing.JLabel lbWelcome;
    // End of variables declaration//GEN-END:variables
}
