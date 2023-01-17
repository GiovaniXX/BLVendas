package view;

import controller.ControllerUsuarios;
import javax.swing.JOptionPane;
import model.ModelSessaoUsuario;
import model.ModelUsuarios;

public class ViewLogin extends javax.swing.JFrame {

    ControllerUsuarios controllerUsuario = new ControllerUsuarios();
    ModelUsuarios modelUsuarios = new ModelUsuarios();
    ModelSessaoUsuario modelSessaoUsuario = new ModelSessaoUsuario();

    public ViewLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPtelaLogin = new javax.swing.JPanel();
        JLlogo = new javax.swing.JLabel();
        JLloguin = new javax.swing.JLabel();
        JLsenha = new javax.swing.JLabel();
        JLtitulo = new javax.swing.JLabel();
        JSlogoI = new javax.swing.JSeparator();
        JSlogoII = new javax.swing.JSeparator();
        JTFlogin = new UI_Custom.TextField();
        JPFsenha = new UI_Custom.PasswordField();
        JBentrar = new UI_Custom.Button();
        JBsair = new UI_Custom.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interface Loguin");
        setResizable(false);

        JPtelaLogin.setBackground(new java.awt.Color(8, 13, 32));

        JLlogo.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        JLlogo.setForeground(new java.awt.Color(255, 255, 255));
        JLlogo.setText("Sistema de Login:");

        JLloguin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JLloguin.setForeground(new java.awt.Color(255, 255, 255));
        JLloguin.setText("L.:");

        JLsenha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JLsenha.setForeground(new java.awt.Color(255, 255, 255));
        JLsenha.setText("S.:");

        JLtitulo.setFont(new java.awt.Font("Dialog", 2, 8)); // NOI18N
        JLtitulo.setForeground(new java.awt.Color(0, 102, 153));
        JLtitulo.setText("Programador: Giovani V. Chaves");

        JSlogoI.setBackground(new java.awt.Color(0, 107, 161));
        JSlogoI.setForeground(new java.awt.Color(0, 107, 161));

        JSlogoII.setBackground(new java.awt.Color(0, 107, 161));
        JSlogoII.setForeground(new java.awt.Color(0, 107, 161));

        JTFlogin.setBackground(new java.awt.Color(8, 13, 32));
        JTFlogin.setForeground(new java.awt.Color(255, 255, 255));
        JTFlogin.setLabelText("Entre com seu login");
        JTFlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFloginActionPerformed(evt);
            }
        });

        JPFsenha.setBackground(new java.awt.Color(8, 13, 32));
        JPFsenha.setForeground(new java.awt.Color(255, 255, 255));
        JPFsenha.setLabelText("Entre com sua senha");
        JPFsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPFsenhaActionPerformed(evt);
            }
        });

        JBentrar.setBorder(null);
        JBentrar.setText("Entrar");
        JBentrar.setColor(new java.awt.Color(0, 107, 161));
        JBentrar.setColorOver(new java.awt.Color(0, 51, 0));
        JBentrar.setRadius(25);
        JBentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBentrarActionPerformed(evt);
            }
        });

        JBsair.setBackground(new java.awt.Color(0, 102, 153));
        JBsair.setBorder(null);
        JBsair.setText("Sair");
        JBsair.setColor(new java.awt.Color(0, 102, 153));
        JBsair.setColorOver(new java.awt.Color(51, 0, 0));
        JBsair.setRadius(25);
        JBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPtelaLoginLayout = new javax.swing.GroupLayout(JPtelaLogin);
        JPtelaLogin.setLayout(JPtelaLoginLayout);
        JPtelaLoginLayout.setHorizontalGroup(
            JPtelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPtelaLoginLayout.createSequentialGroup()
                .addGroup(JPtelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPtelaLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JPtelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JSlogoII)
                            .addComponent(JSlogoI)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPtelaLoginLayout.createSequentialGroup()
                                .addGap(0, 22, Short.MAX_VALUE)
                                .addGroup(JPtelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(JPtelaLoginLayout.createSequentialGroup()
                                        .addComponent(JBentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(186, 186, 186)
                                        .addComponent(JBsair, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPtelaLoginLayout.createSequentialGroup()
                                        .addComponent(JLloguin)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTFlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPtelaLoginLayout.createSequentialGroup()
                                        .addComponent(JLsenha)
                                        .addGap(18, 18, 18)
                                        .addComponent(JPFsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24))))
                    .addGroup(JPtelaLoginLayout.createSequentialGroup()
                        .addGroup(JPtelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPtelaLoginLayout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(JLlogo))
                            .addGroup(JPtelaLoginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(JLtitulo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPtelaLoginLayout.setVerticalGroup(
            JPtelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPtelaLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JSlogoI, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLlogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSlogoII, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(JPtelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLloguin)
                    .addComponent(JTFlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPtelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLsenha)
                    .addComponent(JPFsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPtelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBsair, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(JLtitulo)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPtelaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPtelaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBentrarActionPerformed
        entrar();
    }//GEN-LAST:event_JBentrarActionPerformed

    private void JBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsairActionPerformed
        dispose();
    }//GEN-LAST:event_JBsairActionPerformed

    private void JTFloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFloginActionPerformed
        JPFsenha.requestFocus();
    }//GEN-LAST:event_JTFloginActionPerformed

    private void JPFsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPFsenhaActionPerformed
        entrar();
    }//GEN-LAST:event_JPFsenhaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }

    private void entrar() {
        modelUsuarios.setUsuLogin(JTFlogin.getText());
        modelUsuarios.setUsuSenha(String.valueOf(JPFsenha.getPassword()));

        if (controllerUsuario.getValidarUsuarioController(modelUsuarios)) {
            modelUsuarios = controllerUsuario.getUsuarioController(JTFlogin.getText());
            modelSessaoUsuario.codigo = modelUsuarios.getIdUsuario();
            modelSessaoUsuario.nome = modelUsuarios.getUsuNome();
            modelSessaoUsuario.login = modelUsuarios.getUsuLogin();

            new ViewPrincipal().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou Senha incorretas!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(this, "Verifique no SGBD suas credenciais!", "ALERTA", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private UI_Custom.Button JBentrar;
    private UI_Custom.Button JBsair;
    private javax.swing.JLabel JLlogo;
    private javax.swing.JLabel JLloguin;
    private javax.swing.JLabel JLsenha;
    private javax.swing.JLabel JLtitulo;
    private UI_Custom.PasswordField JPFsenha;
    private javax.swing.JPanel JPtelaLogin;
    private javax.swing.JSeparator JSlogoI;
    private javax.swing.JSeparator JSlogoII;
    private UI_Custom.TextField JTFlogin;
    // End of variables declaration//GEN-END:variables
}
