
package view;

import dao.ConnectionFactory;
import dao.UsuarioDao;
import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginView extends javax.swing.JFrame {
    
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;
    private Statement st;
    public String usern;
    public String pass;
    public static String usuarioLogado;
    UsuarioDao usuario = new UsuarioDao();
    
    public LoginView() throws IOException { 
        initComponents();
        setLocationRelativeTo(null);
    }
    
    MenuView Menu = new MenuView();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnLogin = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jtxtUsername = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setName("frameLogin"); // NOI18N
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        jbtnLogin.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
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
        jbtnLogin.setBounds(440, 240, 80, 25);

        jbtnExit.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
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
        jbtnExit.setBounds(440, 420, 80, 25);

        jLabelUsername.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabelUsername.setText("Usuário:");
        getContentPane().add(jLabelUsername);
        jLabelUsername.setBounds(110, 120, 120, 29);

        jLabelPassword.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabelPassword.setText("Senha:");
        getContentPane().add(jLabelPassword);
        jLabelPassword.setBounds(110, 180, 90, 29);

        jtxtUsername.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        getContentPane().add(jtxtUsername);
        jtxtUsername.setBounds(290, 120, 232, 22);

        jPassword.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        getContentPane().add(jPassword);
        jPassword.setBounds(290, 180, 232, 22);

        jLabelTitulo.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Sistema de Gestão Patrimonial");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(0, 0, 640, 80);

        jLabelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg_jframe.png"))); // NOI18N
        getContentPane().add(jLabelBg);
        jLabelBg.setBounds(0, 0, 640, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed
        // TODO add your handling code here:
        usern = jtxtUsername.getText();
        pass = jPassword.getText();
        usuarioLogado = usuario.retornaNome(usern);
        
        String queryLogin = "SELECT * FROM LOGIN WHERE USER = ? AND PASSWORD = ?";
        try {
            conn = new ConnectionFactory().getConexao();
        } catch (IOException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            stmt = conn.prepareStatement(queryLogin);
            
            stmt.setString(1, usern);
            stmt.setString(2, pass);
            
            rs = stmt.executeQuery();
            
            if(rs.next()) {
                
                JOptionPane.showMessageDialog(null, "Usuário logado!", "(Sucesso)", 1);
                stmt.close();
                Menu.setVisible(true);
                dispose();
            }
            else {
                
                 JOptionPane.showMessageDialog(null, "Credenciais inválidas!", "(Erro)", JOptionPane.ERROR_MESSAGE);
                 stmt.close();
            }
            
        } catch(SQLException | HeadlessException erro) {
            throw new RuntimeException ("Erro 5: " + erro);
        }
    }//GEN-LAST:event_jbtnLoginActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LoginView().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBg;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnLogin;
    private javax.swing.JTextField jtxtUsername;
    // End of variables declaration//GEN-END:variables

}
