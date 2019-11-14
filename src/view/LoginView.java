
package view;

import dao.ConnectionFactory;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginView extends javax.swing.JFrame {
    
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public LoginView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnLogin = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jtxtUsername = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        jbtnLogin.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jbtnLogin.setText("Login");
        jbtnLogin.setMaximumSize(new java.awt.Dimension(80, 25));
        jbtnLogin.setMinimumSize(new java.awt.Dimension(80, 25));
        jbtnLogin.setPreferredSize(new java.awt.Dimension(80, 25));
        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnLogin);
        jbtnLogin.setBounds(433, 431, 80, 25);

        jbtnReset.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.setMaximumSize(new java.awt.Dimension(80, 25));
        jbtnReset.setMinimumSize(new java.awt.Dimension(80, 25));
        jbtnReset.setPreferredSize(new java.awt.Dimension(80, 25));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnReset);
        jbtnReset.setBounds(600, 430, 80, 25);

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbtnExit.setText("Sair");
        jbtnExit.setMaximumSize(new java.awt.Dimension(80, 25));
        jbtnExit.setMinimumSize(new java.awt.Dimension(80, 25));
        jbtnExit.setPreferredSize(new java.awt.Dimension(80, 25));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnExit);
        jbtnExit.setBounds(770, 430, 80, 25);

        jLabelUsername.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabelUsername.setText("Usuário:");
        getContentPane().add(jLabelUsername);
        jLabelUsername.setBounds(433, 266, 120, 29);

        jLabelPassword.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabelPassword.setText("Senha:");
        getContentPane().add(jLabelPassword);
        jLabelPassword.setBounds(433, 317, 90, 29);

        jtxtUsername.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        getContentPane().add(jtxtUsername);
        jtxtUsername.setBounds(616, 266, 232, 22);

        jPassword.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        getContentPane().add(jPassword);
        jPassword.setBounds(616, 320, 232, 22);

        jLabelTitulo.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabelTitulo.setText("Sistema de Gestão Patrimonial");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(320, 60, 670, 110);

        jLabelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg_jframe.png"))); // NOI18N
        jLabelBg.setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(jLabelBg);
        jLabelBg.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        // TODO add your handling code here:
        jtxtUsername.setText(null);
        jPassword.setText(null);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed
        // TODO add your handling code here:
        String usern = jtxtUsername.getText();
        String pass = jPassword.getText();
        
        String query = "SELECT * FROM LOGIN WHERE USER = ? AND PASSWORD = ?";
        conn = new ConnectionFactory().getConexao();
        
        try {
            stmt = conn.prepareStatement(query);
            
            stmt.setString(1, usern);
            stmt.setString(2, pass);
            
            rs = stmt.executeQuery();
            
            if(rs.next()) {
                
                JOptionPane.showMessageDialog(null, "Usuário logado!", "(Sucesso)", 1);
                stmt.close();
            }
            else {
                
                 JOptionPane.showMessageDialog(null, "Credenciais inválidas!", "(Erro)", JOptionPane.ERROR_MESSAGE);
                 stmt.close();
            }
        } catch(Exception erro) {
            throw new RuntimeException ("Erro 5: " + erro);
        }
    }//GEN-LAST:event_jbtnLoginActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBg;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnLogin;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JTextField jtxtUsername;
    // End of variables declaration//GEN-END:variables

}
