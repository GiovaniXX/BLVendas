package view;

import javax.swing.JFrame;
import model.ModelSessaoUsuario;
import util.BLDatas;

public class ViewPrincipal extends javax.swing.JFrame {

    public ViewPrincipal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        JLusuario.setText(ModelSessaoUsuario.nome);
        JLdata.setText(BLDatas.retornarDataHora());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UJPIlogo = new componentes.UJPanelImagem();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        JLusuario = new javax.swing.JLabel();
        JLdata = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JMBmenu = new javax.swing.JMenuBar();
        JMarquivos = new javax.swing.JMenu();
        JMIsair = new javax.swing.JMenuItem();
        JMcadastros = new javax.swing.JMenu();
        JMIclientes = new javax.swing.JMenuItem();
        JMIprodutos = new javax.swing.JMenuItem();
        JMIusuarios = new javax.swing.JMenuItem();
        JMvendas = new javax.swing.JMenu();
        JMIvendas = new javax.swing.JMenuItem();
        JMdeveloper = new javax.swing.JMenu();
        JMIinfo = new javax.swing.JMenuItem();
        JMsystemPdv = new javax.swing.JMenu();
        JMIpdv = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Interface Menu");
        setBackground(new java.awt.Color(15, 70, 110));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));

        UJPIlogo.setBackground(new java.awt.Color(8, 13, 32));
        UJPIlogo.setImagem(new java.io.File("D:\\Outros backup\\NetBeansProjects(TESTES)\\BLVendas\\src\\imagens\\000.jpg"));

        jPanel3.setBackground(new java.awt.Color(15, 70, 110));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Logado como:");

        JLusuario.setForeground(new java.awt.Color(255, 255, 255));
        JLusuario.setText("usuario");

        JLdata.setForeground(new java.awt.Color(255, 255, 255));
        JLdata.setText("data");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data/Hora de login:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLusuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLdata))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLusuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JLdata, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout UJPIlogoLayout = new javax.swing.GroupLayout(UJPIlogo);
        UJPIlogo.setLayout(UJPIlogoLayout);
        UJPIlogoLayout.setHorizontalGroup(
            UJPIlogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        UJPIlogoLayout.setVerticalGroup(
            UJPIlogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UJPIlogoLayout.createSequentialGroup()
                .addGap(0, 679, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JMBmenu.setBackground(new java.awt.Color(15, 70, 110));

        JMarquivos.setBackground(new java.awt.Color(15, 70, 110));
        JMarquivos.setForeground(new java.awt.Color(0, 0, 0));
        JMarquivos.setText("Arquivos");
        JMarquivos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        JMIsair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        JMIsair.setBackground(new java.awt.Color(8, 13, 32));
        JMIsair.setText("Sair");
        JMIsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIsairActionPerformed(evt);
            }
        });
        JMarquivos.add(JMIsair);

        JMBmenu.add(JMarquivos);

        JMcadastros.setBackground(new java.awt.Color(15, 70, 110));
        JMcadastros.setForeground(new java.awt.Color(0, 0, 0));
        JMcadastros.setText("Cadastros");
        JMcadastros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        JMIclientes.setBackground(new java.awt.Color(8, 13, 32));
        JMIclientes.setText("Clientes");
        JMIclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIclientesActionPerformed(evt);
            }
        });
        JMcadastros.add(JMIclientes);

        JMIprodutos.setBackground(new java.awt.Color(8, 13, 32));
        JMIprodutos.setText("Produtos");
        JMIprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIprodutosActionPerformed(evt);
            }
        });
        JMcadastros.add(JMIprodutos);

        JMIusuarios.setBackground(new java.awt.Color(8, 13, 32));
        JMIusuarios.setText("Usuários");
        JMIusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIusuariosActionPerformed(evt);
            }
        });
        JMcadastros.add(JMIusuarios);

        JMBmenu.add(JMcadastros);

        JMvendas.setBackground(new java.awt.Color(15, 70, 110));
        JMvendas.setForeground(new java.awt.Color(0, 0, 0));
        JMvendas.setText("Vendas");
        JMvendas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JMvendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMvendasActionPerformed(evt);
            }
        });

        JMIvendas.setBackground(new java.awt.Color(8, 13, 32));
        JMIvendas.setText("Vendas");
        JMIvendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIvendasActionPerformed(evt);
            }
        });
        JMvendas.add(JMIvendas);

        JMBmenu.add(JMvendas);

        JMdeveloper.setBackground(new java.awt.Color(15, 70, 110));
        JMdeveloper.setForeground(new java.awt.Color(0, 0, 0));
        JMdeveloper.setText("Developer");
        JMdeveloper.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        JMIinfo.setBackground(new java.awt.Color(8, 13, 32));
        JMIinfo.setText("Info");
        JMIinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIinfoActionPerformed(evt);
            }
        });
        JMdeveloper.add(JMIinfo);

        JMBmenu.add(JMdeveloper);

        JMsystemPdv.setBackground(new java.awt.Color(15, 70, 110));
        JMsystemPdv.setForeground(new java.awt.Color(0, 0, 0));
        JMsystemPdv.setText("System PDV");
        JMsystemPdv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JMsystemPdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMsystemPdvActionPerformed(evt);
            }
        });

        JMIpdv.setText("PDV");
        JMIpdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIpdvActionPerformed(evt);
            }
        });
        JMsystemPdv.add(JMIpdv);

        JMBmenu.add(JMsystemPdv);

        setJMenuBar(JMBmenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UJPIlogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UJPIlogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1366, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void JMIsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIsairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JMIsairActionPerformed

    private void JMIclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIclientesActionPerformed
        new ViewCliente().setVisible(true);
    }//GEN-LAST:event_JMIclientesActionPerformed

    private void JMIprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIprodutosActionPerformed
        new ViewProduto().setVisible(true);
    }//GEN-LAST:event_JMIprodutosActionPerformed

    private void JMIusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIusuariosActionPerformed
        new ViewUsuario().setVisible(true);
    }//GEN-LAST:event_JMIusuariosActionPerformed

    private void JMvendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMvendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMvendasActionPerformed

    private void JMIvendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIvendasActionPerformed
        new ViewVendas().setVisible(true);
    }//GEN-LAST:event_JMIvendasActionPerformed

    private void JMIinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIinfoActionPerformed
        new ViewDeveloper().setVisible(true);
    }//GEN-LAST:event_JMIinfoActionPerformed

    private void JMsystemPdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMsystemPdvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMsystemPdvActionPerformed

    private void JMIpdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIpdvActionPerformed
        new ViewPDV().setVisible(true);
    }//GEN-LAST:event_JMIpdvActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLdata;
    private javax.swing.JLabel JLusuario;
    private javax.swing.JMenuBar JMBmenu;
    private javax.swing.JMenuItem JMIclientes;
    private javax.swing.JMenuItem JMIinfo;
    private javax.swing.JMenuItem JMIpdv;
    private javax.swing.JMenuItem JMIprodutos;
    private javax.swing.JMenuItem JMIsair;
    private javax.swing.JMenuItem JMIusuarios;
    private javax.swing.JMenuItem JMIvendas;
    private javax.swing.JMenu JMarquivos;
    private javax.swing.JMenu JMcadastros;
    private javax.swing.JMenu JMdeveloper;
    private javax.swing.JMenu JMsystemPdv;
    private javax.swing.JMenu JMvendas;
    private componentes.UJPanelImagem UJPIlogo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
