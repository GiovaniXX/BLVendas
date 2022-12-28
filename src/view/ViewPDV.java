package view;

import controller.ControllerProdutos;
import controller.ControllerVendas;
import controller.ControllerVendasProdutos;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Component;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import static java.lang.annotation.RetentionPolicy.CLASS;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.ModelProdutos;
import model.ModelSessaoUsuario;
import model.ModelVendas;
import model.ModelVendasProdutos;
import util.BLDatas;
import util.BLMascaras;

public class ViewPDV extends javax.swing.JFrame {

    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    ModelVendas modelVendas = new ModelVendas();
    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
    ArrayList<ModelVendasProdutos> listaModelVendasProdutos = new ArrayList<>();
    BLDatas blDatas = new BLDatas();
    ControllerVendas controllerVendas = new ControllerVendas();
    ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();
    ModelSessaoUsuario modelSessaoUsuario = new ModelSessaoUsuario();
    int quantidade;
    private ViewPagamentoPDV viewPagamentoPDV;
    BLMascaras blMascaras = new BLMascaras();

    public ViewPDV() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        quantidade = 1;
        setarOperador();
        this.viewPagamentoPDV = new ViewPagamentoPDV(this, true);
        limparTela();
        //Mudando cor inicial do JFrame
        getContentPane().setBackground(new Color(15, 70, 110));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JLoperador = new javax.swing.JLabel();
        JLcaixa = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JLstatus = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        JTFvalorBruto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTprodutos = new javax.swing.JTable();
        JTFcodigoProduto = new javax.swing.JFormattedTextField();
        JMBmenu = new javax.swing.JMenuBar();
        JMcomandos = new javax.swing.JMenu();
        JMIaddQuantidade = new javax.swing.JMenuItem();
        JMIfinalizarVenda = new javax.swing.JMenuItem();
        JMIpesquisarProdutos = new javax.swing.JMenuItem();
        JMIexcluir = new javax.swing.JMenuItem();
        JMarquivo = new javax.swing.JMenu();
        JMIsair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Interface PDV");
        setBackground(new java.awt.Color(8, 13, 32));

        jPanel1.setBackground(new java.awt.Color(8, 13, 32));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Caixa:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Operador:");

        JLoperador.setForeground(new java.awt.Color(255, 255, 255));

        JLcaixa.setForeground(new java.awt.Color(255, 255, 255));
        JLcaixa.setText("01");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Status:");

        JLstatus.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Valor Bruto");

        JTFvalorBruto.setBackground(new java.awt.Color(15, 70, 110));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Comandos");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("F3 = Quantidade");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("F4 = Finalizar Venda");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("F5 = Pesquisar Produto");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("S =  Sair");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("F2 = Excluir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTFvalorBruto)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLoperador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JLcaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JLstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JLcaixa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JLoperador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLstatus)
                    .addComponent(jLabel6))
                .addGap(45, 45, 45)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFvalorBruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(8, 13, 32));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aqui neste espaço vai a sua logo marca...!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(8, 13, 32));

        JTprodutos.setBackground(new java.awt.Color(15, 70, 110));
        JTprodutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Codigo", "Nome", "Quantidade", "Valor Unitario", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTprodutos.setGridColor(new java.awt.Color(15, 70, 110));
        JTprodutos.setSelectionBackground(new java.awt.Color(15, 70, 110));
        JTprodutos.setSelectionForeground(new java.awt.Color(15, 70, 110));
        jScrollPane1.setViewportView(JTprodutos);
        if (JTprodutos.getColumnModel().getColumnCount() > 0) {
            JTprodutos.getColumnModel().getColumn(0).setMinWidth(60);
            JTprodutos.getColumnModel().getColumn(0).setPreferredWidth(60);
            JTprodutos.getColumnModel().getColumn(0).setMaxWidth(60);
            JTprodutos.getColumnModel().getColumn(1).setMinWidth(60);
            JTprodutos.getColumnModel().getColumn(1).setPreferredWidth(60);
            JTprodutos.getColumnModel().getColumn(1).setMaxWidth(60);
            JTprodutos.getColumnModel().getColumn(3).setMinWidth(80);
            JTprodutos.getColumnModel().getColumn(3).setPreferredWidth(80);
            JTprodutos.getColumnModel().getColumn(3).setMaxWidth(80);
            JTprodutos.getColumnModel().getColumn(4).setMinWidth(100);
            JTprodutos.getColumnModel().getColumn(4).setPreferredWidth(100);
            JTprodutos.getColumnModel().getColumn(4).setMaxWidth(100);
            JTprodutos.getColumnModel().getColumn(5).setMinWidth(80);
            JTprodutos.getColumnModel().getColumn(5).setPreferredWidth(80);
            JTprodutos.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        JTFcodigoProduto.setBackground(new java.awt.Color(15, 70, 110));
        JTFcodigoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        JTFcodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFcodigoProdutoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                    .addComponent(JTFcodigoProduto))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFcodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JMBmenu.setBackground(new java.awt.Color(8, 13, 32));

        JMcomandos.setBackground(new java.awt.Color(8, 13, 32));
        JMcomandos.setText("Comandos");

        JMIaddQuantidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        JMIaddQuantidade.setText("Quantidade");
        JMIaddQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIaddQuantidadeActionPerformed(evt);
            }
        });
        JMcomandos.add(JMIaddQuantidade);

        JMIfinalizarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        JMIfinalizarVenda.setText("Finalizar Venda");
        JMIfinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIfinalizarVendaActionPerformed(evt);
            }
        });
        JMcomandos.add(JMIfinalizarVenda);

        JMIpesquisarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        JMIpesquisarProdutos.setText("Pesquisar Produtos");
        JMcomandos.add(JMIpesquisarProdutos);

        JMIexcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        JMIexcluir.setText("Excluir");
        JMIexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIexcluirActionPerformed(evt);
            }
        });
        JMcomandos.add(JMIexcluir);

        JMBmenu.add(JMcomandos);

        JMarquivo.setBackground(new java.awt.Color(8, 13, 32));
        JMarquivo.setText("Arquivo");
        JMarquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMarquivoActionPerformed(evt);
            }
        });

        JMIsair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, 0));
        JMIsair.setText("Sair");
        JMIsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIsairActionPerformed(evt);
            }
        });
        JMarquivo.add(JMIsair);

        JMBmenu.add(JMarquivo);

        setJMenuBar(JMBmenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JMIfinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIfinalizarVendaActionPerformed
        try {
            this.viewPagamentoPDV = new ViewPagamentoPDV(this, true);
            viewPagamentoPDV.setValorTotal(Float.parseFloat(JTFvalorBruto.getText()));
            viewPagamentoPDV.setJFTFsubTotal();
            viewPagamentoPDV.setVisible(true);

            System.err.println(viewPagamentoPDV.getFormaPagamento());

            if (viewPagamentoPDV.isVf_pago()) {
                salvarVenda();
                JOptionPane.showMessageDialog(this, "Venda salva com sucesso!", "AVISO", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Venda cancelada!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro de comunicaçaõ!", "ERRO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_JMIfinalizarVendaActionPerformed

    private void JMIaddQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIaddQuantidadeActionPerformed
        quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade!"));
    }//GEN-LAST:event_JMIaddQuantidadeActionPerformed

    private void JMarquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMarquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMarquivoActionPerformed

    private void JMIsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIsairActionPerformed
        dispose();
    }//GEN-LAST:event_JMIsairActionPerformed

    private void JMIexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIexcluirActionPerformed
        int quantidadeLinha = JTprodutos.getRowCount();
        if (quantidadeLinha < 1) {
            JOptionPane.showMessageDialog(this, "Não existe itens para excluir!");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) JTprodutos.getModel();
            int linha = Integer.parseInt(JOptionPane.showInputDialog("Informe o item que deseja excluir"));
            modelo.removeRow(linha - 1);
            JTFvalorBruto.setText(String.valueOf(somaValorTotal()));

            for (int i = 0; i < quantidadeLinha; i++) {
                modelo.setValueAt(i + 1, i, 0);
            }
        }
    }//GEN-LAST:event_JMIexcluirActionPerformed

    private void JTFcodigoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFcodigoProdutoKeyPressed
        pegarConteudo(evt);
    }//GEN-LAST:event_JTFcodigoProdutoKeyPressed

    private void salvarVenda() {
        int cont;
        int codigoProduto = 0;
        int codigoVenda = 0;
        modelVendas = new ModelVendas();
        modelVendas.setCliente(1);
        try {
            modelVendas.setVenDataVenda(blDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        modelVendas.setVenValorBruto(Double.parseDouble(JTFvalorBruto.getText()));
        modelVendas.setVenDesconto(viewPagamentoPDV.getDesconto());
        modelVendas.setVenValorLiquido(blMascaras.arredondamentoComPontoDuasCasasFDouble(viewPagamentoPDV.getValorTotal()));
        codigoVenda = controllerVendas.salvarVendasController(modelVendas);
        cont = JTprodutos.getRowCount();

        for (int i = 0; i < cont; i++) {
            codigoProduto = (int) JTprodutos.getValueAt(i, 1);
            modelVendasProdutos = new ModelVendasProdutos();
            modelProdutos = new ModelProdutos();
            modelVendasProdutos.setProduto(codigoProduto);
            modelVendasProdutos.setVendas(codigoVenda);
            modelVendasProdutos.setVenProValor((double) JTprodutos.getValueAt(i, 4));
            modelVendasProdutos.setVenProQuantidade(Integer.parseInt(JTprodutos.getValueAt(i, 3).toString()));

            modelProdutos.setIdProduto(codigoProduto);
            modelProdutos.setProEstoque(controllerProdutos.getProdutoController(codigoProduto).getProEstoque() - Integer.parseInt(JTprodutos.getValueAt(i, 3).toString()));
            listaModelVendasProdutos.add(modelVendasProdutos);
            listaModelProdutos.add(modelProdutos);
        }

        if (controllerVendasProdutos.salvarVendasProdutosController(listaModelVendasProdutos)) {
            controllerProdutos.alterarEstoqueProdutoController(listaModelProdutos);
            limparTela();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar os produtos", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparTela() {
        JTFvalorBruto.setText("");
        DefaultTableModel modelo = (DefaultTableModel) JTprodutos.getModel();
        modelo.setNumRows(0);
        JLstatus.setText("Caixa Livre!");
    }

    private void pegarConteudo(java.awt.event.KeyEvent e) {
        JLstatus.setText("Caixa Ocupado!");
        DefaultTableModel modelo = (DefaultTableModel) JTprodutos.getModel();
        if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            try {
                modelProdutos = controllerProdutos.getProdutoController(Integer.parseInt(JTFcodigoProduto.getText()));
                modelo.addRow(new Object[]{
                    modelo.getRowCount() + 1,
                    modelProdutos.getIdProduto(),
                    modelProdutos.getProNome(),
                    quantidade,
                    modelProdutos.getProValor(),
                    modelProdutos.getProValor() * quantidade
                });
                JTFvalorBruto.setText(String.valueOf(somaValorTotal()));
                JTFcodigoProduto.setText("");
                quantidade = 1;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Este campo não pode ser vazio!", "ALERT", JOptionPane.WARNING_MESSAGE);
                JOptionPane.showMessageDialog(this, "Neste campo somente números!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private float somaValorTotal() {
        float soma = 0;
        float valor = 0;
        int cont = JTprodutos.getRowCount();

        for (int i = 0; i < cont; i++) {
            valor = Float.parseFloat(String.valueOf(JTprodutos.getValueAt(i, 5)));
            soma += valor;
        }
        return soma;
    }

    /**
     * Method Diferencia com cores as linhas da tabela!
     */
    public void corNaLinha() {
        RetentionPolicy c = CLASS;

        JTprodutos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int colunm) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, colunm);

                Color c = Color.WHITE;
                Object texto = table.getValueAt(row, 4);

                /**
                 * Neste trecho de código, texto está sendo comparado a null e
                 * então ao resultado de texto.toString() sendo igual ao valor
                 * de CLASS. Se ambas as condições forem verdadeiras, o valor de
                 * c é definido como Color.RED. O operador && é um operador AND
                 * lógico, o que significa que ambas as condições em ambos os
                 * lados dele devem ser verdadeiras para que toda a expressão
                 * seja verdadeira. Nesse caso, a primeira condição verifica se
                 * o texto não é nulo. Se texto for nulo, a expressão será falsa
                 * e o bloco de código após a instrução if não será executado.
                 * Se texto não for nulo, verifica-se a segunda condição, que
                 * verifica se texto.toString() é igual a CLASS. Se essa
                 * condição também for verdadeira, o valor de c será definido
                 * como Color.RED. Se qualquer uma dessas condições for falsa, o
                 * valor de c não será alterado.
                 */
                if (texto != null && CLASS.equals(texto.toString())) {
                    c = Color.RED;
                }
                label.setBackground(c);
                JTprodutos.setSelectionForeground(Color.GREEN);

                return label;
            }
        });
    } //Fim method...

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPDV().setVisible(true);
            }
        });
    }

    private void setarOperador() {
        JLoperador.setText(modelSessaoUsuario.nome);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLcaixa;
    private javax.swing.JLabel JLoperador;
    private javax.swing.JLabel JLstatus;
    private javax.swing.JMenuBar JMBmenu;
    private javax.swing.JMenuItem JMIaddQuantidade;
    private javax.swing.JMenuItem JMIexcluir;
    private javax.swing.JMenuItem JMIfinalizarVenda;
    private javax.swing.JMenuItem JMIpesquisarProdutos;
    private javax.swing.JMenuItem JMIsair;
    private javax.swing.JMenu JMarquivo;
    private javax.swing.JMenu JMcomandos;
    private javax.swing.JFormattedTextField JTFcodigoProduto;
    private javax.swing.JTextField JTFvalorBruto;
    private javax.swing.JTable JTprodutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
