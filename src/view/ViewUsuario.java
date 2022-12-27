package view;

import controller.ControllerUsuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.ModelUsuarios;

public class ViewUsuario extends javax.swing.JFrame {

    ControllerUsuarios controllerUsuarios = new ControllerUsuarios();
    ModelUsuarios modelUsuarios = new ModelUsuarios();
    ArrayList<ModelUsuarios> listaModelUsuarios = new ArrayList<>();
    String alterarSalvar;

    public ViewUsuario() {
        initComponents();
        carregarUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPTelaUsuario = new javax.swing.JPanel();
        JLCodigo = new javax.swing.JLabel();
        JTFCodigo = new javax.swing.JTextField();
        JTFNome = new javax.swing.JTextField();
        JLNome = new javax.swing.JLabel();
        JTFLogin = new javax.swing.JTextField();
        JLLoguin = new javax.swing.JLabel();
        JPFSenha = new javax.swing.JPasswordField();
        JLSenha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTusuario = new javax.swing.JTable();
        JBsalvar = new javax.swing.JButton();
        JBcancelar = new javax.swing.JButton();
        JBexcluir = new javax.swing.JButton();
        JBAalterar = new javax.swing.JButton();
        JBnovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Interface Usuário");
        setResizable(false);

        JPTelaUsuario.setBackground(new java.awt.Color(8, 13, 32));

        JLCodigo.setForeground(new java.awt.Color(255, 255, 255));
        JLCodigo.setText("Código:");

        JTFCodigo.setEditable(false);
        JTFCodigo.setBackground(new java.awt.Color(73, 128, 231));
        JTFCodigo.setForeground(new java.awt.Color(0, 0, 0));
        JTFCodigo.setEnabled(false);

        JTFNome.setBackground(new java.awt.Color(73, 128, 231));
        JTFNome.setForeground(new java.awt.Color(0, 0, 0));
        JTFNome.setEnabled(false);

        JLNome.setForeground(new java.awt.Color(255, 255, 255));
        JLNome.setText("Nome:");

        JTFLogin.setBackground(new java.awt.Color(73, 128, 231));
        JTFLogin.setForeground(new java.awt.Color(0, 0, 0));
        JTFLogin.setEnabled(false);

        JLLoguin.setForeground(new java.awt.Color(255, 255, 255));
        JLLoguin.setText("Login:");

        JPFSenha.setBackground(new java.awt.Color(73, 128, 231));
        JPFSenha.setForeground(new java.awt.Color(0, 0, 0));
        JPFSenha.setEnabled(false);

        JLSenha.setForeground(new java.awt.Color(255, 255, 255));
        JLSenha.setText("Senha:");

        JTusuario.setBackground(new java.awt.Color(73, 128, 231));
        JTusuario.setForeground(new java.awt.Color(0, 0, 0));
        JTusuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Login"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTusuario);
        if (JTusuario.getColumnModel().getColumnCount() > 0) {
            JTusuario.getColumnModel().getColumn(0).setMinWidth(50);
            JTusuario.getColumnModel().getColumn(0).setPreferredWidth(50);
            JTusuario.getColumnModel().getColumn(0).setMaxWidth(50);
            JTusuario.getColumnModel().getColumn(2).setMinWidth(200);
            JTusuario.getColumnModel().getColumn(2).setPreferredWidth(200);
            JTusuario.getColumnModel().getColumn(2).setMaxWidth(200);
        }

        JBsalvar.setBackground(new java.awt.Color(73, 128, 231));
        JBsalvar.setForeground(new java.awt.Color(0, 0, 0));
        JBsalvar.setText("Salvar");
        JBsalvar.setEnabled(false);
        JBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsalvarActionPerformed(evt);
            }
        });

        JBcancelar.setBackground(new java.awt.Color(73, 128, 231));
        JBcancelar.setForeground(new java.awt.Color(0, 0, 0));
        JBcancelar.setText("Cancelar");
        JBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcancelarActionPerformed(evt);
            }
        });

        JBexcluir.setBackground(new java.awt.Color(73, 128, 231));
        JBexcluir.setForeground(new java.awt.Color(0, 0, 0));
        JBexcluir.setText("Excluir");
        JBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBexcluirActionPerformed(evt);
            }
        });

        JBAalterar.setBackground(new java.awt.Color(73, 128, 231));
        JBAalterar.setForeground(new java.awt.Color(0, 0, 0));
        JBAalterar.setText("Alterar");
        JBAalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAalterarActionPerformed(evt);
            }
        });

        JBnovo.setBackground(new java.awt.Color(73, 128, 231));
        JBnovo.setForeground(new java.awt.Color(0, 0, 0));
        JBnovo.setText("Novo");
        JBnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBnovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPTelaUsuarioLayout = new javax.swing.GroupLayout(JPTelaUsuario);
        JPTelaUsuario.setLayout(JPTelaUsuarioLayout);
        JPTelaUsuarioLayout.setHorizontalGroup(
            JPTelaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPTelaUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPTelaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                    .addGroup(JPTelaUsuarioLayout.createSequentialGroup()
                        .addGroup(JPTelaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JPTelaUsuarioLayout.createSequentialGroup()
                                .addGroup(JPTelaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPTelaUsuarioLayout.createSequentialGroup()
                                        .addComponent(JLLoguin)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(JTFLogin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JPTelaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLSenha)))
                            .addGroup(JPTelaUsuarioLayout.createSequentialGroup()
                                .addGroup(JPTelaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLCodigo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JPTelaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLNome)
                                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(JPTelaUsuarioLayout.createSequentialGroup()
                        .addComponent(JBcancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBAalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JPTelaUsuarioLayout.setVerticalGroup(
            JPTelaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPTelaUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPTelaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLCodigo)
                    .addComponent(JLNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPTelaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPTelaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLLoguin)
                    .addComponent(JLSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPTelaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPTelaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBcancelar)
                    .addComponent(JBexcluir)
                    .addComponent(JBAalterar)
                    .addComponent(JBnovo)
                    .addComponent(JBsalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPTelaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPTelaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalvarActionPerformed
        try {
            modelUsuarios.setIdUsuario(Integer.parseInt(JTFCodigo.getText()));
        } catch (NumberFormatException e) {
        }
        modelUsuarios.setUsuNome(JTFNome.getText());
        modelUsuarios.setUsuLogin(JTFLogin.getText());
        modelUsuarios.setUsuSenha(String.valueOf(JPFSenha.getPassword()));

        if (alterarSalvar.equals("salvar")) {
            if (controllerUsuarios.salvarUsuarioController(modelUsuarios) > 0) {
                JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                carregarUsuarios();
                limparCampos();
                habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar o registro!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (controllerUsuarios.atualizarUsuarioController(modelUsuarios)) {
                JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                carregarUsuarios();
                limparCampos();
                habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao alterar o registro!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_JBsalvarActionPerformed

    private void JBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBexcluirActionPerformed
        int linha = JTusuario.getSelectedRow();
        int codigoUsuario = (int) JTusuario.getValueAt(linha, 0);
        if (controllerUsuarios.excluirUsuarioController(codigoUsuario)) {
            JOptionPane.showMessageDialog(this, "Usuário excluido com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            carregarUsuarios();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir usuário!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBexcluirActionPerformed

    private void JBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcancelarActionPerformed
        habilitarDesabilitarCampos(false);
        limparCampos();
    }//GEN-LAST:event_JBcancelarActionPerformed

    private void JBAalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAalterarActionPerformed
        int linha = JTusuario.getSelectedRow();
        int codigo = (int) JTusuario.getValueAt(linha, 0);

        modelUsuarios = controllerUsuarios.getUsuarioController(codigo);
        JTFCodigo.setText(String.valueOf(modelUsuarios.getIdUsuario()));
        JTFNome.setText(modelUsuarios.getUsuNome());
        JTFLogin.setText(modelUsuarios.getUsuLogin());
        JPFSenha.setText(modelUsuarios.getUsuSenha());

        alterarSalvar = "alterar";
        habilitarDesabilitarCampos(true);
        JTFNome.requestFocus();
    }//GEN-LAST:event_JBAalterarActionPerformed

    private void JBnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBnovoActionPerformed
        limparCampos();
        habilitarDesabilitarCampos(true);
        JTFNome.requestFocus();
        alterarSalvar = "salvar";
    }//GEN-LAST:event_JBnovoActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
        } catch (Exception e) {
        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUsuario().setVisible(true);
            }
        });
    }

    // Carregar usuarios na tabela
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

    // Limpar formularios do usuario
    private void limparCampos() {
        JTFCodigo.setText("");
        JTFNome.setText("");
        JTFLogin.setText("");
        JPFSenha.setText("");
    }

    // Habilitar e desabilitar campos e botões do formulario
    private void habilitarDesabilitarCampos(boolean condicao) {
        JTFCodigo.setEnabled(condicao);
        JTFNome.setEnabled(condicao);
        JTFLogin.setEnabled(condicao);
        JPFSenha.setEnabled(condicao);
        JBsalvar.setEnabled(condicao);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAalterar;
    private javax.swing.JButton JBcancelar;
    private javax.swing.JButton JBexcluir;
    private javax.swing.JButton JBnovo;
    private javax.swing.JButton JBsalvar;
    private javax.swing.JLabel JLCodigo;
    private javax.swing.JLabel JLLoguin;
    private javax.swing.JLabel JLNome;
    private javax.swing.JLabel JLSenha;
    private javax.swing.JPasswordField JPFSenha;
    private javax.swing.JPanel JPTelaUsuario;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JTextField JTFLogin;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTable JTusuario;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
