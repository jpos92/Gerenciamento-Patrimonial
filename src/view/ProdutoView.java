
package view;

import dao.ProdutoDao;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produto;
import table.ProdutoTableModel;


public class ProdutoView extends javax.swing.JFrame {
    
    Produto pro = new Produto();
    ProdutoDao prd = new ProdutoDao();

    public ProdutoView() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        tbproduto.setAutoCreateRowSorter(true);
        tbproduto.setModel(new ProdutoTableModel(new ProdutoDao().Listartodos()));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfcodigo = new javax.swing.JTextField();
        tfdescricao = new javax.swing.JTextField();
        tfpreco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btlimpar = new javax.swing.JButton();
        btexcluir = new javax.swing.JButton();
        btsalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tfpesquisadescricao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbproduto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código");

        jLabel2.setText("Descrição");

        tfcodigo.setEditable(false);

        tfpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfprecoActionPerformed(evt);
            }
        });

        jLabel3.setText("Preço");

        btlimpar.setText("Limpar");
        btlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimparActionPerformed(evt);
            }
        });

        btexcluir.setText("Excluir");
        btexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluirActionPerformed(evt);
            }
        });

        btsalvar.setText("Salvar");
        btsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvarActionPerformed(evt);
            }
        });

        jLabel4.setText("Pesquisar");

        tfpesquisadescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfpesquisadescricaoKeyPressed(evt);
            }
        });

        tbproduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbproduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbprodutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbproduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfdescricao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfcodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(tfpreco)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btlimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btexcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btsalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfpesquisadescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(895, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btlimpar)
                    .addComponent(btexcluir)
                    .addComponent(btsalvar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfpesquisadescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(395, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfprecoActionPerformed

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
        // TODO add your handling code here:
        if (tfcodigo.getText().equals("")){
            pro.setDesricao_produto(tfdescricao.getText());
            pro.setPreco_produto(Double.parseDouble(tfpreco.getText()));
            prd.inserir(pro);
        } else {
            pro.setDesricao_produto(tfdescricao.getText());
            pro.setPreco_produto(Double.parseDouble(tfpreco.getText()));
            pro.setCodigo_produto((Integer.parseInt(tfcodigo.getText())));
            prd.alterar (pro);
        }
        try {
            tbproduto.setModel(new ProdutoTableModel(new ProdutoDao().Listartodos()));
        } catch (IOException ex) {
            Logger.getLogger(ProdutoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfcodigo.setText("");
        tfdescricao.setText("");
        tfpreco.setText("");
        tfpesquisadescricao.setText("");
    }//GEN-LAST:event_btsalvarActionPerformed

    private void tbprodutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbprodutoMouseClicked
        // TODO add your handling code here:
        tfcodigo.setText(tbproduto.getValueAt(tbproduto.getSelectedRow(), ProdutoTableModel.COL_CODIGO_PRODUTO).toString());
        tfdescricao.setText(tbproduto.getValueAt(tbproduto.getSelectedRow(), ProdutoTableModel.COL_DESCRICAO_PRODUTO).toString());
        tfpreco.setText(tbproduto.getValueAt(tbproduto.getSelectedRow(), ProdutoTableModel.COL_PRECO_PRODUTO).toString());
    }//GEN-LAST:event_tbprodutoMouseClicked

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        try {
            tbproduto.setModel(new ProdutoTableModel(new ProdutoDao().Listartodos()));
        } catch (IOException ex) {
            Logger.getLogger(ProdutoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfcodigo.setText("");
        tfdescricao.setText("");
        tfpreco.setText("");
        tfpesquisadescricao.setText("");
    }//GEN-LAST:event_btlimparActionPerformed

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(tfcodigo.getText());
        prd.excluir(codigo);
        try {
            tbproduto.setModel(new ProdutoTableModel(new ProdutoDao().Listartodos()));
        } catch (IOException ex) {
            Logger.getLogger(ProdutoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfcodigo.setText("");
        tfdescricao.setText("");
        tfpreco.setText("");
        tfpesquisadescricao.setText("");
    }//GEN-LAST:event_btexcluirActionPerformed

    private void tfpesquisadescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfpesquisadescricaoKeyPressed
        String pesquisa = tfpesquisadescricao.getText();
        try {
            tbproduto.setModel(new ProdutoTableModel(new ProdutoDao().ListartodosDescricao(pesquisa)));
        } catch (IOException ex) {
            Logger.getLogger(ProdutoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tfpesquisadescricaoKeyPressed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton btsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbproduto;
    private javax.swing.JTextField tfcodigo;
    private javax.swing.JTextField tfdescricao;
    private javax.swing.JTextField tfpesquisadescricao;
    private javax.swing.JTextField tfpreco;
    // End of variables declaration//GEN-END:variables
}
