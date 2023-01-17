package view;

import controller.ControllerProdutos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelProdutos;
import util.Formatador;

public class ViewProduto extends javax.swing.JFrame {
    
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    Formatador formatador = new Formatador();
    String alterarSalvar;

    public ViewProduto() {
        initComponents();
        carregarProdutos();
        habilitarDesabilitarCampos(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPTelaProduto = new javax.swing.JPanel();
        JLCodigo = new javax.swing.JLabel();
        JTFcodigo = new javax.swing.JTextField();
        JTFnome = new javax.swing.JTextField();
        JLDescricaoProduto = new javax.swing.JLabel();
        JLValor = new javax.swing.JLabel();
        JBexcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTproduto = new javax.swing.JTable();
        JBcancelar = new javax.swing.JButton();
        JBnovo = new javax.swing.JButton();
        JBalterar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTFpesquisa = new javax.swing.JTextField();
        JBpesquisar = new javax.swing.JButton();
        JBsalvar = new javax.swing.JButton();
        JTFestoque = new javax.swing.JFormattedTextField();
        JTFvalor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Interface Produto");

        JPTelaProduto.setBackground(new java.awt.Color(8, 13, 32));

        JLCodigo.setForeground(new java.awt.Color(255, 255, 255));
        JLCodigo.setText("Código:");

        JTFcodigo.setBackground(new java.awt.Color(73, 128, 231));
        JTFcodigo.setEnabled(false);

        JTFnome.setBackground(new java.awt.Color(73, 128, 231));
        JTFnome.setForeground(new java.awt.Color(0, 0, 0));

        JLDescricaoProduto.setForeground(new java.awt.Color(255, 255, 255));
        JLDescricaoProduto.setText("Nome:");

        JLValor.setForeground(new java.awt.Color(255, 255, 255));
        JLValor.setText("Valor:");

        JBexcluir.setBackground(new java.awt.Color(73, 128, 231));
        JBexcluir.setForeground(new java.awt.Color(255, 255, 255));
        JBexcluir.setText("Excluir");
        JBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBexcluirActionPerformed(evt);
            }
        });

        JTproduto.setBackground(new java.awt.Color(73, 128, 231));
        JTproduto.setForeground(new java.awt.Color(0, 0, 0));
        JTproduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTproduto.setGridColor(new java.awt.Color(73, 128, 231));
        JTproduto.setSelectionBackground(new java.awt.Color(73, 128, 231));
        JTproduto.setSelectionForeground(new java.awt.Color(73, 128, 231));
        jScrollPane1.setViewportView(JTproduto);
        if (JTproduto.getColumnModel().getColumnCount() > 0) {
            JTproduto.getColumnModel().getColumn(0).setMinWidth(50);
            JTproduto.getColumnModel().getColumn(0).setPreferredWidth(50);
            JTproduto.getColumnModel().getColumn(0).setMaxWidth(50);
            JTproduto.getColumnModel().getColumn(2).setMinWidth(100);
            JTproduto.getColumnModel().getColumn(2).setPreferredWidth(100);
            JTproduto.getColumnModel().getColumn(2).setMaxWidth(100);
            JTproduto.getColumnModel().getColumn(3).setMinWidth(100);
            JTproduto.getColumnModel().getColumn(3).setPreferredWidth(100);
            JTproduto.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        JBcancelar.setBackground(new java.awt.Color(73, 128, 231));
        JBcancelar.setForeground(new java.awt.Color(255, 255, 255));
        JBcancelar.setText("Cancelar");
        JBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcancelarActionPerformed(evt);
            }
        });

        JBnovo.setBackground(new java.awt.Color(73, 128, 231));
        JBnovo.setForeground(new java.awt.Color(255, 255, 255));
        JBnovo.setText("Novo");
        JBnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBnovoActionPerformed(evt);
            }
        });

        JBalterar.setBackground(new java.awt.Color(73, 128, 231));
        JBalterar.setForeground(new java.awt.Color(255, 255, 255));
        JBalterar.setText("Alterar");
        JBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBalterarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estoque:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pesquisa:");

        JTFpesquisa.setBackground(new java.awt.Color(73, 128, 231));

        JBpesquisar.setBackground(new java.awt.Color(73, 128, 231));
        JBpesquisar.setText("Pesquisar");
        JBpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBpesquisarActionPerformed(evt);
            }
        });

        JBsalvar.setBackground(new java.awt.Color(73, 128, 231));
        JBsalvar.setText("Salvar");
        JBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsalvarActionPerformed(evt);
            }
        });

        JTFestoque.setBackground(new java.awt.Color(73, 128, 231));
        JTFestoque.setForeground(new java.awt.Color(0, 0, 0));
        JTFestoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        JTFvalor.setBackground(new java.awt.Color(73, 128, 231));
        JTFvalor.setForeground(new java.awt.Color(0, 0, 0));
        JTFvalor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        javax.swing.GroupLayout JPTelaProdutoLayout = new javax.swing.GroupLayout(JPTelaProduto);
        JPTelaProduto.setLayout(JPTelaProdutoLayout);
        JPTelaProdutoLayout.setHorizontalGroup(
            JPTelaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPTelaProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPTelaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                    .addGroup(JPTelaProdutoLayout.createSequentialGroup()
                        .addGroup(JPTelaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(JLCodigo)
                            .addComponent(jLabel1)
                            .addComponent(JTFestoque))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPTelaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPTelaProdutoLayout.createSequentialGroup()
                                .addGroup(JPTelaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLDescricaoProduto)
                                    .addComponent(JLValor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE))
                            .addComponent(JTFnome)
                            .addGroup(JPTelaProdutoLayout.createSequentialGroup()
                                .addComponent(JTFvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(100, 100, 100))
                    .addGroup(JPTelaProdutoLayout.createSequentialGroup()
                        .addComponent(JBcancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(JBalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPTelaProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(JPTelaProdutoLayout.createSequentialGroup()
                        .addComponent(JTFpesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBpesquisar)))
                .addContainerGap())
        );
        JPTelaProdutoLayout.setVerticalGroup(
            JPTelaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPTelaProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPTelaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLCodigo)
                    .addComponent(JLDescricaoProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPTelaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPTelaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPTelaProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPTelaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFestoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPTelaProdutoLayout.createSequentialGroup()
                        .addComponent(JLValor)
                        .addGap(25, 25, 25)))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPTelaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBpesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPTelaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBcancelar)
                    .addComponent(JBnovo)
                    .addComponent(JBalterar)
                    .addComponent(JBexcluir)
                    .addComponent(JBsalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPTelaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPTelaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBexcluirActionPerformed
        int linha = JTproduto.getSelectedRow();
        int codigoProduto = (int) JTproduto.getValueAt(linha, 0);
        if (controllerProdutos.excluirProdutoController(codigoProduto)) {
            JOptionPane.showMessageDialog(this, "Produto excluido com successo!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            carregarProdutos();
            habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir o produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBexcluirActionPerformed

    private void JBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcancelarActionPerformed
        habilitarDesabilitarCampos(false);
        limparCampos();
    }//GEN-LAST:event_JBcancelarActionPerformed

    private void JBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalvarActionPerformed
        if (alterarSalvar.equals("salvar")) {
            salvarProduto();
        } else if (alterarSalvar.equals("alterar")) {
            alterarProduto();
        }
    }//GEN-LAST:event_JBsalvarActionPerformed

    private void JBnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBnovoActionPerformed
        habilitarDesabilitarCampos(true);
        JTFnome.requestFocus();
        alterarSalvar = "salvar";
    }//GEN-LAST:event_JBnovoActionPerformed

    private void JBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBalterarActionPerformed
        alterarSalvar = "alterar";
        habilitarDesabilitarCampos(true);
        JTFnome.requestFocus();
        int linha = this.JTproduto.getSelectedRow();
        try {
            int codigoProduto = (int) this.JTproduto.getValueAt(linha, 0);
            modelProdutos = controllerProdutos.getProdutoController(codigoProduto);

            this.JTFcodigo.setText(String.valueOf(modelProdutos.getIdProduto()));
            this.JTFnome.setText(modelProdutos.getProNome());
            this.JTFestoque.setText(String.valueOf(modelProdutos.getProEstoque()));
            this.JTFvalor.setText(String.valueOf(modelProdutos.getProValor()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }
        //alterarProduto();
    }//GEN-LAST:event_JBalterarActionPerformed

    private void JBpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBpesquisarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.JTproduto.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.JTproduto.setRowSorter(classificador);
        String texto = JTFpesquisa.getText();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_JBpesquisarActionPerformed

    public static void main(String args[]) {       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduto().setVisible(true);
            }
        });
    }

    private void salvarProduto() {
        modelProdutos.setProNome(this.JTFnome.getText());
        modelProdutos.setProEstoque(Integer.parseInt(this.JTFestoque.getText()));
        //modelProdutos.setProValor(Double.parseDouble(this.JTFvalor.getText()));
        modelProdutos.setProValor(formatador.converterVirgulaParaPonto(this.JTFvalor.getText()));

        if (controllerProdutos.salvarProdutoController(modelProdutos) > 0) {
            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!", "AVISO", JOptionPane.WARNING_MESSAGE);
            carregarProdutos();
            limparCampos();
            habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar o produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void alterarProduto() {
        modelProdutos.setProNome(this.JTFnome.getText());
        modelProdutos.setProEstoque(Integer.parseInt(this.JTFestoque.getText()));
        //modelProdutos.setProValor(Double.valueOf(this.JTFvalor.getText()));
        //modelProdutos.setProValor(Double.parseDouble(this.JTFvalor.getText()));
        modelProdutos.setProValor(formatador.converterVirgulaParaPonto(this.JTFvalor.getText()));

        if (controllerProdutos.alterarProdutoController(modelProdutos)) {
            JOptionPane.showMessageDialog(this, "Produto alterado com sucesso!", "AVISO", JOptionPane.WARNING_MESSAGE);
            carregarProdutos();
            limparCampos();
            habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar o produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Habilita e desabilita os campos do formulário
     *
     * @param condicao
     */
    private void habilitarDesabilitarCampos(boolean condicao) {
        //JTFcodigo.setEnabled(condicao);
        JTFnome.setEnabled(condicao);
        JTFestoque.setEnabled(condicao);
        JTFvalor.setEnabled(condicao);
        JBsalvar.setEnabled(condicao);
    }

    /**
     * Limpa os campos do formulário
     */
    private void limparCampos() {
        JTFcodigo.setText("");
        JTFnome.setText("");
        JTFvalor.setText("");
    }

    // Carregar produtos na tabela
    private void carregarProdutos() {
        listaModelProdutos = controllerProdutos.getListaProdutosController();
        DefaultTableModel modelo = (DefaultTableModel) JTproduto.getModel();
        modelo.setNumRows(0);

        int cont = listaModelProdutos.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelProdutos.get(i).getIdProduto(),
                listaModelProdutos.get(i).getProNome(),
                listaModelProdutos.get(i).getProEstoque(),
                listaModelProdutos.get(i).getProValor()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBalterar;
    private javax.swing.JButton JBcancelar;
    private javax.swing.JButton JBexcluir;
    private javax.swing.JButton JBnovo;
    private javax.swing.JButton JBpesquisar;
    private javax.swing.JButton JBsalvar;
    private javax.swing.JLabel JLCodigo;
    private javax.swing.JLabel JLDescricaoProduto;
    private javax.swing.JLabel JLValor;
    private javax.swing.JPanel JPTelaProduto;
    private javax.swing.JTextField JTFcodigo;
    private javax.swing.JFormattedTextField JTFestoque;
    private javax.swing.JTextField JTFnome;
    private javax.swing.JTextField JTFpesquisa;
    private javax.swing.JFormattedTextField JTFvalor;
    private javax.swing.JTable JTproduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
