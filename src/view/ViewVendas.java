package view;

import controller.ControllerClientes;
import controller.ControllerProdutos;
import controller.ControllerProdutosVendasProdutos;
import controller.ControllerVendas;
import controller.ControllerVendasClientes;
import controller.ControllerVendasProdutos;
import java.awt.Color;
import java.awt.Component;
import static java.lang.annotation.RetentionPolicy.CLASS;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.ModelClientes;
import model.ModelProdutos;
import model.ModelProdutosVendasProdutos;
import model.ModelVendas;
import model.ModelVendasClientes;
import model.ModelVendasProdutos;
import util.BLDatas;

public class ViewVendas extends javax.swing.JFrame {

    ControllerClientes controllerClientes = new ControllerClientes();
    ModelClientes modelClientes = new ModelClientes();
    ArrayList<ModelClientes> listaModelClientes = new ArrayList<>();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    ArrayList<ModelVendasClientes> listaModelVendasClientes = new ArrayList<>();
    ControllerVendasClientes controllerVendasClientes = new ControllerVendasClientes();
    ControllerVendas controllerVendas = new ControllerVendas();
    ModelVendas modelVendas = new ModelVendas();
    BLDatas blDatas = new BLDatas();
    ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();
    ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
    ArrayList<ModelVendasProdutos> listaModelVendasProdutos = new ArrayList<>();
    ControllerProdutosVendasProdutos controllerProdutosVendasProdutos = new ControllerProdutosVendasProdutos();
    ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
    String alterarSalvar;

    public ViewVendas() {
        initComponents();
        listarClientes();
        listarProdutos();
        carregarVendas();
        preencherCodigoClientePeloComboBox();
        preencherCodigoProdutoPeloComboBox();
        //corNaLinha();
        //Mudando cor inicial do JFrame
        getContentPane().setBackground(new Color(15, 70, 110));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTFcodigoCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFcodigoProduto = new javax.swing.JTextField();
        JTFquantidade = new javax.swing.JTextField();
        JBadicionar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTFnumeroVenda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTtabelaProdutos = new javax.swing.JTable();
        JBcancelar = new javax.swing.JButton();
        JBnovo = new javax.swing.JButton();
        JBremoverProdutos = new javax.swing.JButton();
        JBsalvar = new javax.swing.JButton();
        JTFvalorTotal = new javax.swing.JTextField();
        JTFdesconto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JCBnomeCliente = new componentes.UJComboBox();
        JCBnomeProduto = new componentes.UJComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        JTFpesquisa = new javax.swing.JTextField();
        JBpesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTtabelaVendas = new javax.swing.JTable();
        JBexcluir = new javax.swing.JButton();
        JBalterar = new javax.swing.JButton();
        JBimprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Interface Vendas");
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(8, 13, 32));

        jPanel1.setBackground(new java.awt.Color(8, 13, 32));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo Cliente");

        JTFcodigoCliente.setBackground(new java.awt.Color(73, 128, 231));
        JTFcodigoCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTFcodigoClienteFocusLost(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome Cliente");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Codigo Produto");

        JTFcodigoProduto.setBackground(new java.awt.Color(73, 128, 231));
        JTFcodigoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTFcodigoProdutoFocusLost(evt);
            }
        });

        JTFquantidade.setBackground(new java.awt.Color(73, 128, 231));

        JBadicionar.setBackground(new java.awt.Color(73, 128, 231));
        JBadicionar.setText("Adicionar");
        JBadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBadicionarActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome produto");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantidade");

        JTFnumeroVenda.setBackground(new java.awt.Color(73, 128, 231));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Número da Venda");

        JTtabelaProdutos.setBackground(new java.awt.Color(73, 128, 231));
        JTtabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Produto ", "Nome Produto", "Quantidade", "Valor Unitario", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTtabelaProdutos.setGridColor(new java.awt.Color(73, 128, 231));
        JTtabelaProdutos.setSelectionBackground(new java.awt.Color(73, 128, 231));
        JTtabelaProdutos.setSelectionForeground(new java.awt.Color(73, 128, 231));
        jScrollPane1.setViewportView(JTtabelaProdutos);
        if (JTtabelaProdutos.getColumnModel().getColumnCount() > 0) {
            JTtabelaProdutos.getColumnModel().getColumn(0).setMinWidth(100);
            JTtabelaProdutos.getColumnModel().getColumn(0).setPreferredWidth(100);
            JTtabelaProdutos.getColumnModel().getColumn(0).setMaxWidth(100);
            JTtabelaProdutos.getColumnModel().getColumn(2).setMinWidth(100);
            JTtabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
            JTtabelaProdutos.getColumnModel().getColumn(2).setMaxWidth(100);
            JTtabelaProdutos.getColumnModel().getColumn(3).setMinWidth(100);
            JTtabelaProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
            JTtabelaProdutos.getColumnModel().getColumn(3).setMaxWidth(100);
            JTtabelaProdutos.getColumnModel().getColumn(4).setMinWidth(100);
            JTtabelaProdutos.getColumnModel().getColumn(4).setPreferredWidth(100);
            JTtabelaProdutos.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        JBcancelar.setBackground(new java.awt.Color(73, 128, 231));
        JBcancelar.setText("Cancelar");
        JBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcancelarActionPerformed(evt);
            }
        });

        JBnovo.setBackground(new java.awt.Color(73, 128, 231));
        JBnovo.setText("Novo");
        JBnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBnovoActionPerformed(evt);
            }
        });

        JBremoverProdutos.setBackground(new java.awt.Color(73, 128, 231));
        JBremoverProdutos.setText("Remover Produtos");
        JBremoverProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBremoverProdutosActionPerformed(evt);
            }
        });

        JBsalvar.setBackground(new java.awt.Color(73, 128, 231));
        JBsalvar.setText("Salvar");
        JBsalvar.setEnabled(false);
        JBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsalvarActionPerformed(evt);
            }
        });

        JTFvalorTotal.setBackground(new java.awt.Color(73, 128, 231));

        JTFdesconto.setBackground(new java.awt.Color(73, 128, 231));
        JTFdesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTFdescontoFocusLost(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Desconto");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Valor Total");

        JCBnomeCliente.setBackground(new java.awt.Color(73, 128, 231));
        JCBnomeCliente.setAutocompletar(true);
        JCBnomeCliente.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                JCBnomeClientePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        JCBnomeProduto.setBackground(new java.awt.Color(73, 128, 231));
        JCBnomeProduto.setAutocompletar(true);
        JCBnomeProduto.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                JCBnomeProdutoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JTFcodigoProduto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(383, 383, 383))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JCBnomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(12, 12, 12))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JTFcodigoCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JCBnomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(12, 12, 12)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JTFnumeroVenda, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFquantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBadicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JBcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBremoverProdutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFdesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(JTFvalorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(140, 140, 140))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFcodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFnumeroVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBnomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFcodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBadicionar)
                    .addComponent(JCBnomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFvalorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFdesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBremoverProdutos)
                    .addComponent(JBcancelar)
                    .addComponent(JBnovo)
                    .addComponent(JBsalvar))
                .addGap(11, 11, 11))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        jPanel2.setBackground(new java.awt.Color(8, 13, 32));

        jLabel9.setText("Pesquisa");

        JTFpesquisa.setBackground(new java.awt.Color(73, 128, 231));

        JBpesquisar.setBackground(new java.awt.Color(73, 128, 231));
        JBpesquisar.setText("Pesquisar");

        JTtabelaVendas.setBackground(new java.awt.Color(73, 128, 231));
        JTtabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome Cliente", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTtabelaVendas.setGridColor(new java.awt.Color(73, 128, 231));
        JTtabelaVendas.setSelectionBackground(new java.awt.Color(73, 128, 231));
        JTtabelaVendas.setSelectionForeground(new java.awt.Color(73, 128, 231));
        jScrollPane2.setViewportView(JTtabelaVendas);
        if (JTtabelaVendas.getColumnModel().getColumnCount() > 0) {
            JTtabelaVendas.getColumnModel().getColumn(0).setMinWidth(80);
            JTtabelaVendas.getColumnModel().getColumn(0).setPreferredWidth(80);
            JTtabelaVendas.getColumnModel().getColumn(0).setMaxWidth(80);
            JTtabelaVendas.getColumnModel().getColumn(2).setMinWidth(130);
            JTtabelaVendas.getColumnModel().getColumn(2).setPreferredWidth(130);
            JTtabelaVendas.getColumnModel().getColumn(2).setMaxWidth(130);
        }

        JBexcluir.setBackground(new java.awt.Color(73, 128, 231));
        JBexcluir.setText("Excluir");
        JBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBexcluirActionPerformed(evt);
            }
        });

        JBalterar.setBackground(new java.awt.Color(73, 128, 231));
        JBalterar.setText("Alterar");
        JBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBalterarActionPerformed(evt);
            }
        });

        JBimprimir.setBackground(new java.awt.Color(73, 128, 231));
        JBimprimir.setText("Imprimir");
        JBimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBimprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JTFpesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBpesquisar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(JBalterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBimprimir)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBpesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBexcluir)
                    .addComponent(JBalterar)
                    .addComponent(JBimprimir))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultar/Excluir/Alterar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBexcluirActionPerformed
        int linha = JTtabelaVendas.getSelectedRow();
        int codigoVenda = (int) JTtabelaVendas.getValueAt(linha, 0);
        listaModelProdutos = new ArrayList<>();
        listaModelProdutosVendasProdutos = controllerProdutosVendasProdutos.getListaProdutosVendasProdutosController(codigoVenda);

        for (int i = 0; i < listaModelProdutosVendasProdutos.size(); i++) {
            modelProdutos = new ModelProdutos();
            modelProdutos.setIdProduto(listaModelProdutosVendasProdutos.get(i).getModelProdutos().getIdProduto());
            modelProdutos.setProEstoque(listaModelProdutosVendasProdutos.get(i).getModelProdutos().getProEstoque() + listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQuantidade());
            listaModelProdutos.add(modelProdutos);
        }

        if (controllerProdutos.alterarEstoqueProdutoController(listaModelProdutos)) {
            controllerVendasProdutos.excluirVendasProdutosController(codigoVenda);
            if (controllerVendas.excluirVendasController(codigoVenda)) {
                JOptionPane.showMessageDialog(this, "Venda excluida com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                carregarVendas();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir a venda!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir a venda!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBexcluirActionPerformed

    private void JBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBalterarActionPerformed
        JBsalvar.setEnabled(true);
        alterarSalvar = "alterar";
        int linha = JTtabelaVendas.getSelectedRow();
        int codigoVenda = (int) JTtabelaVendas.getValueAt(linha, 0);
        listaModelProdutosVendasProdutos = controllerProdutosVendasProdutos.getListaProdutosVendasProdutosController(codigoVenda);
        DefaultTableModel modelo = (DefaultTableModel) JTtabelaProdutos.getModel();
        modelo.setNumRows(0);

        for (int i = 0; i < listaModelProdutosVendasProdutos.size(); i++) {
            JTFnumeroVenda.setText(String.valueOf(listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVendas()));
            modelo.addRow(new Object[]{
                listaModelProdutosVendasProdutos.get(i).getModelProdutos().getIdProduto(),
                listaModelProdutosVendasProdutos.get(i).getModelProdutos().getProNome(),
                listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQuantidade(),
                listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProValor(),
                listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQuantidade()
                * listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProValor()
            });
        }
        somarValorTotalProdutos();
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_JBalterarActionPerformed

    private void JBimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBimprimirActionPerformed
        int linha = JTtabelaVendas.getSelectedRow();
        int codigoVenda = (int) JTtabelaVendas.getValueAt(linha, 0);

        final ViewAguarde carregando = new ViewAguarde();
        carregando.setVisible(true);
        Thread thd = new Thread() {

            public void run() {
                try {
                    controllerVendas.gerarRelatorioVenda(codigoVenda);
                    carregando.dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro");
                }
            }
        };
        thd.start();
    }//GEN-LAST:event_JBimprimirActionPerformed

    private void JCBnomeProdutoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_JCBnomeProdutoPopupMenuWillBecomeInvisible
        if (JCBnomeProduto.isPopupVisible()) {
            preencherCodigoProdutoPeloComboBox();
        }
    }//GEN-LAST:event_JCBnomeProdutoPopupMenuWillBecomeInvisible

    private void JTFcodigoProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFcodigoProdutoFocusLost
        modelProdutos = controllerProdutos.getProdutoController(Integer.parseInt(JTFcodigoProduto.getText()));
        JCBnomeProduto.setSelectedItem(modelProdutos.getProNome());
    }//GEN-LAST:event_JTFcodigoProdutoFocusLost

    private void JCBnomeClientePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_JCBnomeClientePopupMenuWillBecomeInvisible
        if (JCBnomeCliente.isPopupVisible()) {
            preencherCodigoClientePeloComboBox();
        }
    }//GEN-LAST:event_JCBnomeClientePopupMenuWillBecomeInvisible

    private void JTFcodigoClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFcodigoClienteFocusLost
        modelClientes = controllerClientes.getClienteController(Integer.parseInt(JTFcodigoCliente.getText()));
        JCBnomeCliente.setSelectedItem(modelClientes.getCliNome());
    }//GEN-LAST:event_JTFcodigoClienteFocusLost

    private void JTFdescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFdescontoFocusLost
        somarValorTotalProdutos();
    }//GEN-LAST:event_JTFdescontoFocusLost

    private void JBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalvarActionPerformed
        int codigoVenda = 0, codigoProduto = 0;
        double desconto = 0;
        listaModelVendasProdutos = new ArrayList<>();

        if (JTFdesconto.getText().equals("")) {
            desconto = 0;
        } else {
            desconto = Double.parseDouble(JTFdesconto.getText());
        }
        if (!JTFnumeroVenda.getText().equals("")) {
            modelVendas.setIdVenda(Integer.parseInt(JTFnumeroVenda.getText()));
        }
        modelVendas.setCliente(Integer.parseInt(JTFcodigoCliente.getText()));

        try {
            modelVendas.setVenDataVenda(blDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception e) {
        }
        modelVendas.setVenValorLiquido(Double.parseDouble(JTFvalorTotal.getText()));
        modelVendas.setVenValorBruto(Double.parseDouble(JTFvalorTotal.getText()) + desconto);
        modelVendas.setVenDesconto(desconto);

        if (alterarSalvar.equals("salvar")) {
            codigoVenda = controllerVendas.salvarVendasController(modelVendas);
            if (codigoVenda > 0) {
                JOptionPane.showMessageDialog(this, "Venda salva com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar a venda!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            int cont = JTtabelaProdutos.getRowCount();
            for (int i = 0; i < cont; i++) {
                codigoProduto = (int) JTtabelaProdutos.getValueAt(i, 0);
                modelVendasProdutos = new ModelVendasProdutos();
                modelProdutos = new ModelProdutos();
                modelVendasProdutos.setProduto(codigoProduto);
                modelVendasProdutos.setVendas(codigoVenda);
                modelVendasProdutos.setVenProValor((double) JTtabelaProdutos.getValueAt(i, 3));
                modelVendasProdutos.setVenProQuantidade(Integer.parseInt(JTtabelaProdutos.getValueAt(i, 2).toString()));
                modelProdutos.setIdProduto(codigoProduto);
                modelProdutos.setProEstoque(controllerProdutos.getProdutoController(codigoProduto).getProEstoque() - Integer.parseInt(JTtabelaProdutos.getValueAt(i, 2).toString()));
                listaModelVendasProdutos.add(modelVendasProdutos);
                listaModelProdutos.add(modelProdutos);
            }
            // Salvar os produtos da venda
            if (controllerVendasProdutos.salvarVendasProdutosController(listaModelVendasProdutos)) {
                controllerProdutos.alterarEstoqueProdutoController(listaModelProdutos);
                //JOptionPane.showMessageDialog(this, "Produtos da venda salvo com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                carregarVendas();
                limparFormulario();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar os produtos!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else { //Inicio... retorna para o estoque e exclui produtos da venda!
            int linha = JTtabelaVendas.getSelectedRow();
            codigoVenda = (int) JTtabelaVendas.getValueAt(linha, 0);
            listaModelProdutos = new ArrayList<>();
            listaModelProdutosVendasProdutos = controllerProdutosVendasProdutos.getListaProdutosVendasProdutosController(codigoVenda);

            for (int i = 0; i < listaModelProdutosVendasProdutos.size(); i++) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setIdProduto(listaModelProdutosVendasProdutos.get(i).getModelProdutos().getIdProduto());
                modelProdutos.setProEstoque(listaModelProdutosVendasProdutos.get(i).getModelProdutos().getProEstoque() + listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQuantidade());
                listaModelProdutos.add(modelProdutos);
            }

            if (controllerProdutos.alterarEstoqueProdutoController(listaModelProdutos)) {
                if (controllerVendasProdutos.excluirVendasProdutosController(codigoVenda)) {
                    //JOptionPane.showMessageDialog(this, "Venda excluida com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                    carregarVendas();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir a venda!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir a venda!", "ERRO", JOptionPane.ERROR_MESSAGE);
            } //Fim...

            if (controllerVendas.atualizarVendasController(modelVendas)) {
                JOptionPane.showMessageDialog(this, "Venda alterada com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao alterar a venda!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }

            int cont = JTtabelaProdutos.getRowCount();
            for (int i = 0; i < cont; i++) {
                codigoProduto = (int) JTtabelaProdutos.getValueAt(i, 0);
                modelVendasProdutos = new ModelVendasProdutos();
                modelProdutos = new ModelProdutos();
                modelVendasProdutos.setProduto(codigoProduto);
                modelVendasProdutos.setVendas(codigoVenda);
                modelVendasProdutos.setVenProValor((double) JTtabelaProdutos.getValueAt(i, 3));
                modelVendasProdutos.setVenProQuantidade(Integer.parseInt(JTtabelaProdutos.getValueAt(i, 2).toString()));
                modelProdutos.setIdProduto(codigoProduto);
                modelProdutos.setProEstoque(controllerProdutos.getProdutoController(codigoProduto).getProEstoque() - Integer.parseInt(JTtabelaProdutos.getValueAt(i, 2).toString()));
                listaModelVendasProdutos.add(modelVendasProdutos);
                listaModelProdutos.add(modelProdutos);
            }

            if (controllerVendasProdutos.salvarVendasProdutosController(listaModelVendasProdutos)) {
                //JOptionPane.showMessageDialog(this, "Produtos da venda salvo com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                carregarVendas();
                limparFormulario();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar os produtos da venda!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
        JBsalvar.setEnabled(false);
    }//GEN-LAST:event_JBsalvarActionPerformed

    private void JBremoverProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBremoverProdutosActionPerformed
        int linha = JTtabelaProdutos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) JTtabelaProdutos.getModel();
        modelo.removeRow(linha);
        somarValorTotalProdutos();
    }//GEN-LAST:event_JBremoverProdutosActionPerformed

    private void JBnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBnovoActionPerformed
        JBsalvar.setEnabled(true);
        alterarSalvar = "salvar";
        limparFormulario();
    }//GEN-LAST:event_JBnovoActionPerformed

    private void JBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcancelarActionPerformed
        JBsalvar.setEnabled(false);
        limparFormulario();
    }//GEN-LAST:event_JBcancelarActionPerformed

    private void JBadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBadicionarActionPerformed
        if (JTFquantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Voçê deve preencher todos os campos!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {
            modelProdutos = controllerProdutos.getProdutoController(Integer.parseInt(JTFcodigoProduto.getText()));
            DefaultTableModel modelo = (DefaultTableModel) JTtabelaProdutos.getModel();
            int cont = 0;
            double quantidade = 0;
            quantidade = Double.parseDouble(JTFquantidade.getText());

            for (int i = 0; i < cont; i++) {
                modelo.setNumRows(0);
            }
            modelo.addRow(new Object[]{
                modelProdutos.getIdProduto(),
                modelProdutos.getProNome(),
                JTFquantidade.getText(),
                modelProdutos.getProValor(),
                quantidade * modelProdutos.getProValor()
            });
            somarValorTotalProdutos();
        }
    }//GEN-LAST:event_JBadicionarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewVendas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVendas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVendas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVendas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVendas().setVisible(true);
            }
        });
    }

    private void preencherCodigoClientePeloComboBox() {
        modelClientes = controllerClientes.getClienteController(JCBnomeCliente.getSelectedItem().toString());
        JTFcodigoCliente.setText(String.valueOf(modelClientes.getIdCliente()));
    }

    private void preencherCodigoProdutoPeloComboBox() {
        modelProdutos = controllerProdutos.getProdutoController(JCBnomeProduto.getSelectedItem().toString());
        JTFcodigoProduto.setText(String.valueOf(modelProdutos.getIdProduto()));
    }

    private void listarClientes() {
        listaModelClientes = controllerClientes.getListaClientesController();
        JCBnomeCliente.removeAllItems();

        for (int i = 0; i < listaModelClientes.size(); i++) {
            JCBnomeCliente.addItem(listaModelClientes.get(i).getCliNome());
        }
    }

    private void listarProdutos() {
        listaModelProdutos = controllerProdutos.getListaProdutosController();
        JCBnomeProduto.removeAllItems();

        for (int i = 0; i < listaModelProdutos.size(); i++) {
            JCBnomeProduto.addItem(listaModelProdutos.get(i).getProNome());
        }
    }

    private void aplicarDesconto() {
        try {
            JTFvalorTotal.setText(String.valueOf(Double.parseDouble(JTFvalorTotal.getText()) - Double.parseDouble(JTFdesconto.getText())));
        } catch (NumberFormatException e) {

        }
    }

    private void somarValorTotalProdutos() {
        double soma = 0, valor;
        int cont = JTtabelaProdutos.getRowCount();

        for (int i = 0; i < cont; i++) {
            valor = (double) JTtabelaProdutos.getValueAt(i, 4);
            soma = soma + valor;
        }
        JTFvalorTotal.setText(String.valueOf(soma));
        aplicarDesconto();
    }

    private void carregarVendas() {
        DefaultTableModel modelo = (DefaultTableModel) JTtabelaVendas.getModel();
        listaModelVendasClientes = controllerVendasClientes.getListaVendasClientesController();
        //modelo.setNumRows(0);

        int cont = listaModelVendasClientes.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelVendasClientes.get(i).getModelVendas().getIdVenda(),
                listaModelVendasClientes.get(i).getModelClientes().getCliNome(),
                listaModelVendasClientes.get(i).getModelVendas().getVenDataVenda()
            });
        }
    }

    /**
     * Method Diferencia com cores as linhas da tabela!
     */
    public void corNaLinha() {
        //CLASS = "Texto"; 
        JTtabelaVendas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int colunm) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, colunm);

                Color c = new Color(73, 128, 231);
                Object texto = table.getValueAt(row, 4);

                if (texto != null && CLASS.equals(texto.toString())) {
                    c = new Color(8, 13, 32);
                }
                label.setBackground(c);
                JTtabelaVendas.setSelectionForeground(Color.GREEN);

                return label;
            }
        });
    }

    private void limparFormulario() {
        JTFquantidade.setText("");
        JTFdesconto.setText("");
        JTFvalorTotal.setText("");
        DefaultTableModel modelo = (DefaultTableModel) JTtabelaProdutos.getModel();
        modelo.setNumRows(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBadicionar;
    private javax.swing.JButton JBalterar;
    private javax.swing.JButton JBcancelar;
    private javax.swing.JButton JBexcluir;
    private javax.swing.JButton JBimprimir;
    private javax.swing.JButton JBnovo;
    private javax.swing.JButton JBpesquisar;
    private javax.swing.JButton JBremoverProdutos;
    private javax.swing.JButton JBsalvar;
    private componentes.UJComboBox JCBnomeCliente;
    private componentes.UJComboBox JCBnomeProduto;
    private javax.swing.JTextField JTFcodigoCliente;
    private javax.swing.JTextField JTFcodigoProduto;
    private javax.swing.JTextField JTFdesconto;
    private javax.swing.JTextField JTFnumeroVenda;
    private javax.swing.JTextField JTFpesquisa;
    private javax.swing.JTextField JTFquantidade;
    private javax.swing.JTextField JTFvalorTotal;
    private javax.swing.JTable JTtabelaProdutos;
    private javax.swing.JTable JTtabelaVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
