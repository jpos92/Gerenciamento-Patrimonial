
package view;

import dao.UsuarioDao;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;
import table.UsuarioTableModel;


public class AddUsuarioView extends javax.swing.JFrame {
    
    Usuario pro = new Usuario();
    UsuarioDao prd;

    public AddUsuarioView() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlUsuario = new javax.swing.JLabel();
        jbtnAdicionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JFormattedTextField();
        jtxtMatricula = new javax.swing.JFormattedTextField();
        jtxtVinculo = new javax.swing.JFormattedTextField();
        jtxtCPF = new javax.swing.JFormattedTextField();
        jtxtRG = new javax.swing.JFormattedTextField();
        jtxtCargo = new javax.swing.JFormattedTextField();
        jtxtEndereco = new javax.swing.JFormattedTextField();
        jtxtEmail = new javax.swing.JFormattedTextField();
        jtxtLogin = new javax.swing.JFormattedTextField();
        jpassSenha = new javax.swing.JPasswordField();
        jbtnSair1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 480));
        setName("MenuFrame"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jlUsuario.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlUsuario.setText("NOVO USUÁRIO");
        getContentPane().add(jlUsuario);
        jlUsuario.setBounds(160, 20, 323, 60);

        jbtnAdicionar.setText("Adicionar");
        jbtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnAdicionar);
        jbtnAdicionar.setBounds(230, 420, 90, 23);

        jLabel1.setText("Matrícula:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 140, 64, 24);

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 110, 64, 25);

        jLabel3.setText("Vínculo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 180, 64, 24);

        jLabel4.setText("CPF:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 210, 64, 24);

        jLabel5.setText("RG:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 250, 64, 24);

        jLabel6.setText("Cargo:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 280, 64, 24);

        jLabel7.setText("Endereço:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 320, 64, 24);

        jLabel8.setText("Email:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 350, 64, 24);

        jLabel9.setText("Login:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(410, 110, 64, 24);

        jLabel10.setText("Senha:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(410, 140, 64, 24);

        jtxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtNome);
        jtxtNome.setBounds(130, 110, 260, 20);

        jtxtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtMatricula);
        jtxtMatricula.setBounds(130, 150, 260, 20);

        jtxtVinculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtVinculoActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtVinculo);
        jtxtVinculo.setBounds(130, 180, 260, 20);

        jtxtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCPFActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtCPF);
        jtxtCPF.setBounds(130, 220, 260, 20);

        jtxtRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtRGActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtRG);
        jtxtRG.setBounds(130, 250, 260, 20);

        jtxtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCargoActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtCargo);
        jtxtCargo.setBounds(130, 280, 260, 20);

        jtxtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtEndereco);
        jtxtEndereco.setBounds(130, 320, 260, 20);

        jtxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtEmail);
        jtxtEmail.setBounds(130, 360, 260, 20);

        jtxtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtLogin);
        jtxtLogin.setBounds(480, 110, 105, 20);
        getContentPane().add(jpassSenha);
        jpassSenha.setBounds(480, 150, 105, 20);

        jbtnSair1.setText("Sair");
        jbtnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSair1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSair1);
        jbtnSair1.setBounds(330, 420, 51, 23);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jbtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdicionarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbtnAdicionarActionPerformed

    private void jtxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNomeActionPerformed

    private void jtxtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtMatriculaActionPerformed

    private void jtxtVinculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtVinculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtVinculoActionPerformed

    private void jtxtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCPFActionPerformed

    private void jtxtRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtRGActionPerformed

    private void jtxtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCargoActionPerformed

    private void jtxtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEnderecoActionPerformed

    private void jtxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEmailActionPerformed

    private void jtxtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtLoginActionPerformed

    private void jbtnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSair1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnSair1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtnAdicionar;
    private javax.swing.JButton jbtnSair1;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPasswordField jpassSenha;
    private javax.swing.JFormattedTextField jtxtCPF;
    private javax.swing.JFormattedTextField jtxtCargo;
    private javax.swing.JFormattedTextField jtxtEmail;
    private javax.swing.JFormattedTextField jtxtEndereco;
    private javax.swing.JFormattedTextField jtxtLogin;
    private javax.swing.JFormattedTextField jtxtMatricula;
    private javax.swing.JFormattedTextField jtxtNome;
    private javax.swing.JFormattedTextField jtxtRG;
    private javax.swing.JFormattedTextField jtxtVinculo;
    // End of variables declaration//GEN-END:variables
}
