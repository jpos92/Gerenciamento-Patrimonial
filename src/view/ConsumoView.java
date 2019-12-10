
package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsumoView extends javax.swing.JFrame {
    
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public ConsumoView() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlQuantidade = new javax.swing.JLabel();
        jlNota = new javax.swing.JLabel();
        jlDataNota = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JTextField();
        jTipoCompra = new javax.swing.JComboBox();
        jlTipoCompra = new javax.swing.JLabel();
        jlEstadoCon = new javax.swing.JLabel();
        jEstado = new javax.swing.JComboBox();
        jtxtQuantidade = new javax.swing.JTextField();
        jtxtNota = new javax.swing.JTextField();
        jlTipoAquisicao = new javax.swing.JLabel();
        jTipoAquisicao = new javax.swing.JComboBox();
        jlDataCadastro = new javax.swing.JLabel();
        jlNomeCadastro = new javax.swing.JLabel();
        jtxtNomeCadastro = new javax.swing.JTextField();
        jlValor = new javax.swing.JLabel();
        jbtnAdicionar = new javax.swing.JButton();
        jbtnExcluir = new javax.swing.JButton();
        jbtnLimpar = new javax.swing.JButton();
        jbtnSair = new javax.swing.JButton();
        jtxtDataNota = new javax.swing.JFormattedTextField();
        jtxtDataCadastro = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDuraveis = new javax.swing.JTable();
        jtxtValor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Cadastro de bens de consumo");

        jlNome.setText("Nome:");
        jlNome.setMaximumSize(new java.awt.Dimension(31, 32));
        jlNome.setMinimumSize(new java.awt.Dimension(31, 32));
        jlNome.setPreferredSize(new java.awt.Dimension(31, 32));

        jlQuantidade.setText("Quantidade:");
        jlQuantidade.setMaximumSize(new java.awt.Dimension(31, 32));
        jlQuantidade.setMinimumSize(new java.awt.Dimension(31, 32));
        jlQuantidade.setPreferredSize(new java.awt.Dimension(31, 32));

        jlNota.setText("Nº da nota:");
        jlNota.setMaximumSize(new java.awt.Dimension(31, 32));
        jlNota.setMinimumSize(new java.awt.Dimension(31, 32));
        jlNota.setPreferredSize(new java.awt.Dimension(31, 32));

        jlDataNota.setText("Data da nota:");
        jlDataNota.setMaximumSize(new java.awt.Dimension(31, 32));
        jlDataNota.setMinimumSize(new java.awt.Dimension(31, 32));
        jlDataNota.setPreferredSize(new java.awt.Dimension(31, 32));

        jtxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNomeActionPerformed(evt);
            }
        });

        jTipoCompra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "C", "E", "F" }));

        jlTipoCompra.setText("Tipo da compra:");
        jlTipoCompra.setMaximumSize(new java.awt.Dimension(31, 32));
        jlTipoCompra.setMinimumSize(new java.awt.Dimension(31, 32));
        jlTipoCompra.setPreferredSize(new java.awt.Dimension(31, 32));

        jlEstadoCon.setText("Estado de conservação:");
        jlEstadoCon.setMaximumSize(new java.awt.Dimension(31, 32));
        jlEstadoCon.setMinimumSize(new java.awt.Dimension(31, 32));
        jlEstadoCon.setPreferredSize(new java.awt.Dimension(31, 32));

        jEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "E", "B", "R", "P" }));

        jtxtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtQuantidadeActionPerformed(evt);
            }
        });

        jtxtNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNotaActionPerformed(evt);
            }
        });

        jlTipoAquisicao.setText("Tipo de aquisição:");
        jlTipoAquisicao.setMaximumSize(new java.awt.Dimension(31, 32));
        jlTipoAquisicao.setMinimumSize(new java.awt.Dimension(31, 32));
        jlTipoAquisicao.setPreferredSize(new java.awt.Dimension(31, 32));

        jTipoAquisicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AL", "CE", "CO", "COM", "DO", "IN" }));

        jlDataCadastro.setText("Data do cadastro:");
        jlDataCadastro.setMaximumSize(new java.awt.Dimension(31, 32));
        jlDataCadastro.setMinimumSize(new java.awt.Dimension(31, 32));
        jlDataCadastro.setPreferredSize(new java.awt.Dimension(31, 32));

        jlNomeCadastro.setText("Nome cadastrador:");
        jlNomeCadastro.setMaximumSize(new java.awt.Dimension(31, 32));
        jlNomeCadastro.setMinimumSize(new java.awt.Dimension(31, 32));
        jlNomeCadastro.setPreferredSize(new java.awt.Dimension(31, 32));

        jtxtNomeCadastro.setEditable(false);
        jtxtNomeCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNomeCadastroActionPerformed(evt);
            }
        });

        jlValor.setText("Valor do bem:");
        jlValor.setMaximumSize(new java.awt.Dimension(31, 32));
        jlValor.setMinimumSize(new java.awt.Dimension(31, 32));
        jlValor.setPreferredSize(new java.awt.Dimension(31, 32));

        jbtnAdicionar.setText("Adicionar");

        jbtnExcluir.setText("Excluir");
        jbtnExcluir.setMaximumSize(new java.awt.Dimension(77, 23));
        jbtnExcluir.setMinimumSize(new java.awt.Dimension(77, 23));
        jbtnExcluir.setPreferredSize(new java.awt.Dimension(77, 23));

        jbtnLimpar.setText("Limpar");
        jbtnLimpar.setMaximumSize(new java.awt.Dimension(77, 23));
        jbtnLimpar.setMinimumSize(new java.awt.Dimension(77, 23));
        jbtnLimpar.setPreferredSize(new java.awt.Dimension(77, 23));

        jbtnSair.setText("Sair");
        jbtnSair.setMaximumSize(new java.awt.Dimension(77, 23));
        jbtnSair.setMinimumSize(new java.awt.Dimension(77, 23));
        jbtnSair.setPreferredSize(new java.awt.Dimension(77, 23));
        jbtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSairActionPerformed(evt);
            }
        });

        try {
            jtxtDataNota.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtxtDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jtbDuraveis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtbDuraveis);

        jtxtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlValor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlTipoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(52, 52, 52)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTipoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jlNota, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtxtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jlQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jlDataNota, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtxtDataNota, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlEstadoCon, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlTipoAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTipoAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtnAdicionar)
                            .addGap(50, 50, 50)
                            .addComponent(jbtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(jbtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(jbtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlTipoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlEstadoCon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlTipoAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTipoAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTipoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jlQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jlNota, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jlDataNota, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxtDataNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlValor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAdicionar)
                    .addComponent(jbtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNomeActionPerformed

    private void jtxtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtQuantidadeActionPerformed

    private void jtxtNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNotaActionPerformed

    private void jtxtNomeCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNomeCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNomeCadastroActionPerformed

    private void jbtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jEstado;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jTipoAquisicao;
    private javax.swing.JComboBox jTipoCompra;
    private javax.swing.JButton jbtnAdicionar;
    private javax.swing.JButton jbtnExcluir;
    private javax.swing.JButton jbtnLimpar;
    private javax.swing.JButton jbtnSair;
    private javax.swing.JLabel jlDataCadastro;
    private javax.swing.JLabel jlDataNota;
    private javax.swing.JLabel jlEstadoCon;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNomeCadastro;
    private javax.swing.JLabel jlNota;
    private javax.swing.JLabel jlQuantidade;
    private javax.swing.JLabel jlTipoAquisicao;
    private javax.swing.JLabel jlTipoCompra;
    private javax.swing.JLabel jlValor;
    private javax.swing.JTable jtbDuraveis;
    private javax.swing.JFormattedTextField jtxtDataCadastro;
    private javax.swing.JFormattedTextField jtxtDataNota;
    private javax.swing.JTextField jtxtNome;
    private javax.swing.JTextField jtxtNomeCadastro;
    private javax.swing.JTextField jtxtNota;
    private javax.swing.JTextField jtxtQuantidade;
    private javax.swing.JFormattedTextField jtxtValor;
    // End of variables declaration//GEN-END:variables

}
