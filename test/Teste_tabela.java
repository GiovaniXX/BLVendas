
import java.awt.Color;
import controller.ControllerUsuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelUsuarios;

public class Teste_tabela extends javax.swing.JFrame {

    ControllerUsuarios controllerUsuarios = new ControllerUsuarios();
    ModelUsuarios modelUsuarios = new ModelUsuarios();
    ArrayList<ModelUsuarios> listaModelUsuarios = new ArrayList<>();
    String cadastrar;

    public Teste_tabela() {
        initComponents();
        carregarUsuarios();
        // Muda a cor inicial do JFrame
        getContentPane().setBackground(new Color(15, 70, 110));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLcodigo = new javax.swing.JLabel();
        JTFcodigo = new javax.swing.JTextField();
        JLnome = new javax.swing.JLabel();
        JTFnome = new javax.swing.JTextField();
        JLlogin = new javax.swing.JLabel();
        JTFlogin = new javax.swing.JTextField();
        JBcadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTusuario = new javax.swing.JTable();
        JBcarregarCampos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabela");
        setResizable(false);

        JLcodigo.setText("Codigo");

        JLnome.setText("Nome");

        JLlogin.setText("Login");

        JBcadastrar.setText("Cadastrar");
        JBcadastrar.setEnabled(false);
        JBcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcadastrarActionPerformed(evt);
            }
        });

        JTusuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "CODIGO", "NOME", "LOGIN"
            }
        ));
        jScrollPane1.setViewportView(JTusuario);

        JBcarregarCampos.setText("Carregar Campos");
        JBcarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcarregarCamposActionPerformed(evt);
            }
        });

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JLnome)
                            .addComponent(JLcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JLlogin)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                            .addComponent(JTFnome)
                            .addComponent(JTFlogin)
                            .addComponent(JTFcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBcadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBcarregarCampos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLcodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLnome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLlogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBcadastrar)
                    .addComponent(JBcarregarCampos)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBcarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcarregarCamposActionPerformed
        carregarCampos();
    }//GEN-LAST:event_JBcarregarCamposActionPerformed

    private void JBcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcadastrarActionPerformed
        try {
            modelUsuarios.setIdUsuario(Integer.parseInt(JTFcodigo.getText()));
        } catch (NumberFormatException e) {
        }
        modelUsuarios.setUsuNome(JTFnome.getText());
        modelUsuarios.setUsuLogin(JTFlogin.getText());

        if (cadastrar.equals("salvar")) {
            if (controllerUsuarios.salvarUsuarioController(modelUsuarios) > 0) {
                JOptionPane.showMessageDialog(this, "Registro cadastrado com sucesso!", "AVISO", JOptionPane.WARNING_MESSAGE);
                carregarUsuarios();
                limparCampos();
                //habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar o registro!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_JBcadastrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Teste_tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teste_tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teste_tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teste_tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teste_tabela().setVisible(true);
            }
        });
    }

    //Carrega dados do SGBD na tabela JTusuarios
    private void carregarUsuarios() {
        listaModelUsuarios = controllerUsuarios.getListaUsuariosController();
        DefaultTableModel modelo = (DefaultTableModel) JTusuario.getModel();
        modelo.setNumRows(0);

        int cont = listaModelUsuarios.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelUsuarios.get(i).getIdUsuario(),
                listaModelUsuarios.get(i).getUsuNome(),
                listaModelUsuarios.get(i).getUsuLogin()
            });
        }
    }

    private void carregarCampos() {
        int setar = JTusuario.getSelectedRow();

        JTFcodigo.setText(JTusuario.getModel().getValueAt(setar, 0).toString());
        JTFnome.setText(JTusuario.getModel().getValueAt(setar, 1).toString());
        JTFlogin.setText(JTusuario.getModel().getValueAt(setar, 2).toString());
    }

    // Limpa formularios do usuario
    private void limparCampos() {
        JTFcodigo.setText("");
        JTFnome.setText("");
        JTFlogin.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBcadastrar;
    private javax.swing.JButton JBcarregarCampos;
    private javax.swing.JLabel JLcodigo;
    private javax.swing.JLabel JLlogin;
    private javax.swing.JLabel JLnome;
    private javax.swing.JTextField JTFcodigo;
    private javax.swing.JTextField JTFlogin;
    private javax.swing.JTextField JTFnome;
    private javax.swing.JTable JTusuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
