
package view;

import dao.ConnectionFactory;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DuravelView extends javax.swing.JFrame {
    
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public DuravelView() {
        initComponents();
        setLocationRelativeTo(null);
        jtxtNomeCadastro.setText(LoginView.usuarioLogado);
        System.out.print(LoginView.usuarioLogado);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlTombo = new javax.swing.JLabel();
        jlNota = new javax.swing.JLabel();
        jlDataNota = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JTextField();
        jTipoCompra = new javax.swing.JComboBox();
        jlTipoCompra = new javax.swing.JLabel();
        jlEstadoCon = new javax.swing.JLabel();
        jEstado = new javax.swing.JComboBox();
        jtxtTombo = new javax.swing.JTextField();
        jtxtNota = new javax.swing.JTextField();
        jlTipoAquisicao = new javax.swing.JLabel();
        jTipoAquisicao = new javax.swing.JComboBox();
        jlUnidade = new javax.swing.JLabel();
        jlSubunidade = new javax.swing.JLabel();
        jlLocalizacao = new javax.swing.JLabel();
        jtxtUnidade = new javax.swing.JTextField();
        jtxtSubunidade = new javax.swing.JTextField();
        jtxtLocalizacao = new javax.swing.JTextField();
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
        jlValorRecuperado = new javax.swing.JLabel();
        jtxtValor = new javax.swing.JFormattedTextField();
        jtxtValorRecuperado = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Cadastro de bens duráveis");

        jlNome.setText("Nome:");
        jlNome.setMaximumSize(new java.awt.Dimension(31, 32));
        jlNome.setMinimumSize(new java.awt.Dimension(31, 32));
        jlNome.setPreferredSize(new java.awt.Dimension(31, 32));

        jlTombo.setText("Nº do tombo:");
        jlTombo.setMaximumSize(new java.awt.Dimension(31, 32));
        jlTombo.setMinimumSize(new java.awt.Dimension(31, 32));
        jlTombo.setPreferredSize(new java.awt.Dimension(31, 32));

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

        jtxtTombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTomboActionPerformed(evt);
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

        jlUnidade.setText("Unidade:");
        jlUnidade.setMaximumSize(new java.awt.Dimension(31, 32));
        jlUnidade.setMinimumSize(new java.awt.Dimension(31, 32));
        jlUnidade.setPreferredSize(new java.awt.Dimension(31, 32));

        jlSubunidade.setText("Subunidade:");
        jlSubunidade.setMaximumSize(new java.awt.Dimension(31, 32));
        jlSubunidade.setMinimumSize(new java.awt.Dimension(31, 32));
        jlSubunidade.setPreferredSize(new java.awt.Dimension(31, 32));

        jlLocalizacao.setText("Localização:");
        jlLocalizacao.setMaximumSize(new java.awt.Dimension(31, 32));
        jlLocalizacao.setMinimumSize(new java.awt.Dimension(31, 32));
        jlLocalizacao.setPreferredSize(new java.awt.Dimension(31, 32));

        jtxtUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUnidadeActionPerformed(evt);
            }
        });

        jtxtSubunidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSubunidadeActionPerformed(evt);
            }
        });

        jtxtLocalizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtLocalizacaoActionPerformed(evt);
            }
        });

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

        jlValorRecuperado.setText("Valor do bem recuperado:");
        jlValorRecuperado.setMaximumSize(new java.awt.Dimension(31, 32));
        jlValorRecuperado.setMinimumSize(new java.awt.Dimension(31, 32));
        jlValorRecuperado.setPreferredSize(new java.awt.Dimension(31, 32));

        jtxtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        try {
            jtxtValorRecuperado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlSubunidade, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtSubunidade, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlLocalizacao, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jlNomeCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jlValor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlValorRecuperado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtValorRecuperado, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                        .addComponent(jlTombo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtxtTombo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jbtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
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
                                            .addComponent(jlTombo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxtTombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jlUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSubunidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtSubunidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValorRecuperado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtValorRecuperado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
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

    private void jtxtTomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTomboActionPerformed

    private void jtxtNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNotaActionPerformed

    private void jtxtUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUnidadeActionPerformed

    private void jtxtSubunidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSubunidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSubunidadeActionPerformed

    private void jtxtLocalizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtLocalizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtLocalizacaoActionPerformed

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
    private javax.swing.JLabel jlLocalizacao;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNomeCadastro;
    private javax.swing.JLabel jlNota;
    private javax.swing.JLabel jlSubunidade;
    private javax.swing.JLabel jlTipoAquisicao;
    private javax.swing.JLabel jlTipoCompra;
    private javax.swing.JLabel jlTombo;
    private javax.swing.JLabel jlUnidade;
    private javax.swing.JLabel jlValor;
    private javax.swing.JLabel jlValorRecuperado;
    private javax.swing.JTable jtbDuraveis;
    private javax.swing.JFormattedTextField jtxtDataCadastro;
    private javax.swing.JFormattedTextField jtxtDataNota;
    private javax.swing.JTextField jtxtLocalizacao;
    private javax.swing.JTextField jtxtNome;
    private javax.swing.JTextField jtxtNomeCadastro;
    private javax.swing.JTextField jtxtNota;
    private javax.swing.JTextField jtxtSubunidade;
    private javax.swing.JTextField jtxtTombo;
    private javax.swing.JTextField jtxtUnidade;
    private javax.swing.JFormattedTextField jtxtValor;
    private javax.swing.JFormattedTextField jtxtValorRecuperado;
    // End of variables declaration//GEN-END:variables

}
