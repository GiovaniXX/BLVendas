package view;

import controller.ControllerFormaPagamento;
import java.util.ArrayList;
import model.ModelFormaPagamentos;
import util.BLMascaras;

public class ViewPagamentoPDV extends javax.swing.JDialog {

    ArrayList<ModelFormaPagamentos> listaModelFormaPagamentos = new ArrayList<>();
    ControllerFormaPagamento controllerFormaPagamento = new ControllerFormaPagamento();
    BLMascaras blMascaras = new BLMascaras();

    private float valorTotal;
    private float desconto;
    private float valorRecebido;
    private float troco;
    private String formaPagamento;
    private boolean vf_pago;

    public ViewPagamentoPDV(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listaFormaPagamento();
        this.vf_pago = false;
        calcularPagamento();
        limparCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JFTFsubtotal = new javax.swing.JFormattedTextField();
        JFTFdesconto = new javax.swing.JFormattedTextField();
        JFTFvalorRecebido = new javax.swing.JFormattedTextField();
        JCBpagamento = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        JLvalorTotalPagar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTFtroco = new javax.swing.JTextField();
        JBimprimirCupomFiscal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Interface Pagamento PDV");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(8, 13, 32));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Pagamento.:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Subtotal.:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Desconto.:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor Recebido.:");

        JFTFsubtotal.setBackground(new java.awt.Color(15, 70, 110));
        JFTFsubtotal.setEnabled(false);

        JFTFdesconto.setBackground(new java.awt.Color(15, 70, 110));
        JFTFdesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JFTFdescontoFocusLost(evt);
            }
        });
        JFTFdesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFTFdescontoActionPerformed(evt);
            }
        });

        JFTFvalorRecebido.setBackground(new java.awt.Color(15, 70, 110));
        JFTFvalorRecebido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JFTFvalorRecebidoFocusLost(evt);
            }
        });
        JFTFvalorRecebido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFTFvalorRecebidoActionPerformed(evt);
            }
        });

        JCBpagamento.setBackground(new java.awt.Color(15, 70, 110));
        JCBpagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A VISTA", "CARTÃO", "PIX", "PARCELADO" }));
        JCBpagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBpagamentoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(15, 70, 110));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor Total a Pagar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        JLvalorTotalPagar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JLvalorTotalPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLvalorTotalPagar.setText("jLabel5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLvalorTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(JLvalorTotalPagar)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Troco.:");

        JTFtroco.setBackground(new java.awt.Color(15, 70, 110));

        JBimprimirCupomFiscal.setBackground(new java.awt.Color(15, 70, 110));
        JBimprimirCupomFiscal.setForeground(new java.awt.Color(255, 255, 255));
        JBimprimirCupomFiscal.setText("Imprimir Cupom Fiscal");
        JBimprimirCupomFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBimprimirCupomFiscalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFtroco, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(JBimprimirCupomFiscal))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JFTFsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(JFTFdesconto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                                        .addComponent(JFTFvalorRecebido, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addComponent(JCBpagamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JCBpagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JFTFsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JFTFdesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JFTFvalorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTFtroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBimprimirCupomFiscal))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBimprimirCupomFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBimprimirCupomFiscalActionPerformed
        this.desconto = Float.parseFloat(this.JFTFdesconto.getText());
        this.valorRecebido = Float.parseFloat(this.JFTFvalorRecebido.getText());
        this.troco = Float.parseFloat(this.JTFtroco.getText());
        this.valorTotal = Float.parseFloat(this.JLvalorTotalPagar.getText());
        this.formaPagamento = JCBpagamento.getSelectedItem().toString();
        this.vf_pago = true;
        dispose();
    }//GEN-LAST:event_JBimprimirCupomFiscalActionPerformed

    private void JFTFdescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JFTFdescontoFocusLost
        JFTFdesconto.setText(blMascaras.converterVirgulaParaPonto(JFTFdesconto.getText()));
        calcularPagamento();
    }//GEN-LAST:event_JFTFdescontoFocusLost

    private void JFTFvalorRecebidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JFTFvalorRecebidoFocusLost
        JFTFvalorRecebido.setText(blMascaras.converterVirgulaParaPonto(JFTFvalorRecebido.getText()));
        calcularPagamento();
    }//GEN-LAST:event_JFTFvalorRecebidoFocusLost

    private void JCBpagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBpagamentoActionPerformed
        JFTFdesconto.requestFocus();
    }//GEN-LAST:event_JCBpagamentoActionPerformed

    private void JFTFdescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFTFdescontoActionPerformed
        JFTFvalorRecebido.requestFocus();
    }//GEN-LAST:event_JFTFdescontoActionPerformed

    private void JFTFvalorRecebidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFTFvalorRecebidoActionPerformed
        // Finaliza o pagamento
        this.desconto = Float.parseFloat(this.JFTFdesconto.getText());
        this.valorRecebido = Float.parseFloat(this.JFTFvalorRecebido.getText());
        this.troco = Float.parseFloat(this.JTFtroco.getText());
        this.valorTotal = Float.parseFloat(this.JLvalorTotalPagar.getText());
        this.formaPagamento = JCBpagamento.getSelectedItem().toString();
        this.vf_pago = true;
        dispose();
    }//GEN-LAST:event_JFTFvalorRecebidoActionPerformed

    // Calcula o valor total a pagar e o troco
    private void calcularPagamento() {
        float subTotal, desconto, recebido, pagar, troco;

        try {
            subTotal = Float.parseFloat(JFTFsubtotal.getText());
        } catch (NumberFormatException e) {
            subTotal = 0;
        }
        try {
            desconto = Float.parseFloat(JFTFdesconto.getText());
        } catch (NumberFormatException e) {
            desconto = 0;
            JFTFdesconto.setText("0");
        }
        try {
            recebido = Float.parseFloat(JFTFvalorRecebido.getText());
        } catch (NumberFormatException e) {
            recebido = 0;
            JFTFvalorRecebido.setText("0");
        }

        pagar = subTotal - desconto;
        JLvalorTotalPagar.setText(blMascaras.arredondamentoComPontoDuasCasasString(pagar));
        troco = recebido - pagar;

        JTFtroco.setText(blMascaras.arredondamentoComPontoDuasCasasString(troco));
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewPagamentoPDV dialog = new ViewPagamentoPDV(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void listaFormaPagamento() {
        listaModelFormaPagamentos = controllerFormaPagamento.getListaFormaPagamentoController();
        JCBpagamento.addItem(formaPagamento);
        // Testando se é null
        if (this.listaModelFormaPagamentos == null) {
            this.listaModelFormaPagamentos = new ArrayList<>();
        }

        for (int i = 0; i < listaModelFormaPagamentos.size(); i++) {
            JCBpagamento.addItem(listaModelFormaPagamentos.get(i).getDescricaoForPag());
        }
    }

    private void limparCampos() {
        JFTFdesconto.setText("");
        JFTFvalorRecebido.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBimprimirCupomFiscal;
    private javax.swing.JComboBox<String> JCBpagamento;
    private javax.swing.JFormattedTextField JFTFdesconto;
    private javax.swing.JFormattedTextField JFTFsubtotal;
    private javax.swing.JFormattedTextField JFTFvalorRecebido;
    private javax.swing.JLabel JLvalorTotalPagar;
    private javax.swing.JTextField JTFtroco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the valorTotal
     */
    public float getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the desconto
     */
    public float getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the valorRecebido
     */
    public float getValorRecebido() {
        return valorRecebido;
    }

    /**
     * @param valorRecebido the valorRecebido to set
     */
    public void setValorRecebido(float valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    /**
     * @return the troco
     */
    public float getTroco() {
        return troco;
    }

    /**
     * @param troco the troco to set
     */
    public void setTroco(float troco) {
        this.troco = troco;
    }

    /**
     * @return the formaPagamento
     */
    public String getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * @param formaPagamento the formaPagamento to set
     */
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setJFTFsubTotal() { //ou ----> setJFTFValorTotal
        //this.JFTFsubtotal.setText(this.valorTotal + "");      
        this.JFTFsubtotal.setText(String.valueOf(this.valorTotal));
    }

    /**
     * @return the vf_pago
     */
    public boolean isVf_pago() {
        return vf_pago;
    }

    /**
     * @param vf_pago the vf_pago to set
     */
    public void setVf_pago(boolean vf_pago) {
        this.vf_pago = vf_pago;
    }
}
