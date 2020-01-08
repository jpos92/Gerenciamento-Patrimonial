
package view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TI
 */
public class MenuView extends javax.swing.JFrame {

    public MenuView() throws IOException {
        this.duravel = new DuravelView();
        initComponents();
    }
    
    DuravelView duravel;
    ConsumoView consumo = new ConsumoView();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnConsumo = new javax.swing.JButton();
        jbtnDuravel = new javax.swing.JButton();
        jlUsuario = new javax.swing.JLabel();
        jbtnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(640, 480));
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

        jbtnConsumo.setText("CONSUMO");
        jbtnConsumo.setMaximumSize(new java.awt.Dimension(128, 128));
        jbtnConsumo.setMinimumSize(new java.awt.Dimension(128, 128));
        jbtnConsumo.setPreferredSize(new java.awt.Dimension(128, 128));
        jbtnConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConsumoActionPerformed(evt);
            }
        });

        jbtnDuravel.setText("DURÁVEL");
        jbtnDuravel.setMaximumSize(new java.awt.Dimension(128, 128));
        jbtnDuravel.setMinimumSize(new java.awt.Dimension(128, 128));
        jbtnDuravel.setPreferredSize(new java.awt.Dimension(128, 128));
        jbtnDuravel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDuravelActionPerformed(evt);
            }
        });

        jbtnSair.setText("Sair");
        jbtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnDuravel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jbtnConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnSair)
                        .addGap(291, 291, 291))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDuravel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(jbtnSair)
                .addGap(38, 38, 38))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnDuravelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDuravelActionPerformed
        // TODO add your handling code here:
         duravel.setVisible(true);
    }//GEN-LAST:event_jbtnDuravelActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jlUsuario.setText(LoginView.usuarioLogado);
    }//GEN-LAST:event_formWindowOpened

    private void jbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbtnSairActionPerformed

    private void jbtnConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConsumoActionPerformed
        // TODO add your handling code here:
        consumo.setVisible(true);
    }//GEN-LAST:event_jbtnConsumoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnConsumo;
    private javax.swing.JButton jbtnDuravel;
    private javax.swing.JButton jbtnSair;
    private javax.swing.JLabel jlUsuario;
    // End of variables declaration//GEN-END:variables
}
