package br.com.senactech.ProjetoIntegradorVCc.view;

/**
 *
 * @author aug
 */
public class Instrucoes extends javax.swing.JFrame {

    /**
     * Creates new form Tela2
     */
    public Instrucoes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpFundo = new javax.swing.JDesktopPane();
        jbtOnde = new javax.swing.JButton();
        jbtEfic = new javax.swing.JButton();
        jbtEfei = new javax.swing.JButton();
        jbtGrup = new javax.swing.JButton();
        jbtCalen = new javax.swing.JButton();
        jbtLevarLocal = new javax.swing.JButton();
        jlbSaibaTudo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JButton();
        botaoAjuda = new javax.swing.JButton();
        botaoInstrucoes = new javax.swing.JButton();
        botaoLocaisVacinacao = new javax.swing.JButton();
        botaoCalendario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jdpFundo.setBackground(new java.awt.Color(255, 255, 255));
        jdpFundo.setMaximumSize(new java.awt.Dimension(797, 524));
        jdpFundo.setPreferredSize(new java.awt.Dimension(797, 524));

        jbtOnde.setBackground(new java.awt.Color(205, 205, 205));
        jbtOnde.setForeground(new java.awt.Color(205, 205, 205));
        jbtOnde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senactech/ProjetoIntegradorVCc/view/1onde.png"))); // NOI18N
        jbtOnde.setBorder(null);
        jbtOnde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtOndeActionPerformed(evt);
            }
        });

        jbtEfic.setBackground(new java.awt.Color(205, 205, 205));
        jbtEfic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senactech/ProjetoIntegradorVCc/view/2eficacia.png"))); // NOI18N
        jbtEfic.setBorder(null);
        jbtEfic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEficActionPerformed(evt);
            }
        });

        jbtEfei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senactech/ProjetoIntegradorVCc/view/3efeitos.png"))); // NOI18N
        jbtEfei.setBorder(null);

        jbtGrup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senactech/ProjetoIntegradorVCc/view/4grupos.png"))); // NOI18N
        jbtGrup.setBorder(null);

        jbtCalen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senactech/ProjetoIntegradorVCc/view/5calendario.png"))); // NOI18N
        jbtCalen.setBorder(null);

        jbtLevarLocal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senactech/ProjetoIntegradorVCc/view/6oqLevar.png"))); // NOI18N
        jbtLevarLocal.setBorder(null);
        jbtLevarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLevarLocalActionPerformed(evt);
            }
        });

        jlbSaibaTudo.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jlbSaibaTudo.setText("Saiba tudo sobre a vacinação");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setText("© 2021 WHO");

        BotaoVoltar.setBackground(new java.awt.Color(38, 135, 68));
        BotaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoVoltar.setText("Voltar");
        BotaoVoltar.setFocusable(false);
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });

        botaoAjuda.setBackground(new java.awt.Color(255, 255, 255));
        botaoAjuda.setForeground(new java.awt.Color(102, 102, 102));
        botaoAjuda.setText("Ajuda");
        botaoAjuda.setBorder(null);
        botaoAjuda.setBorderPainted(false);
        botaoAjuda.setContentAreaFilled(false);
        botaoAjuda.setFocusPainted(false);
        botaoAjuda.setFocusable(false);

        botaoInstrucoes.setForeground(new java.awt.Color(102, 102, 102));
        botaoInstrucoes.setText("Instruções");
        botaoInstrucoes.setBorder(null);
        botaoInstrucoes.setBorderPainted(false);
        botaoInstrucoes.setContentAreaFilled(false);

        botaoLocaisVacinacao.setForeground(new java.awt.Color(102, 102, 102));
        botaoLocaisVacinacao.setText("Locais de vacinação");
        botaoLocaisVacinacao.setBorder(null);
        botaoLocaisVacinacao.setBorderPainted(false);
        botaoLocaisVacinacao.setContentAreaFilled(false);

        botaoCalendario.setForeground(new java.awt.Color(102, 102, 102));
        botaoCalendario.setText("Calendário");
        botaoCalendario.setBorderPainted(false);
        botaoCalendario.setContentAreaFilled(false);

        jdpFundo.setLayer(jbtOnde, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpFundo.setLayer(jbtEfic, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpFundo.setLayer(jbtEfei, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpFundo.setLayer(jbtGrup, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpFundo.setLayer(jbtCalen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpFundo.setLayer(jbtLevarLocal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpFundo.setLayer(jlbSaibaTudo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpFundo.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpFundo.setLayer(BotaoVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpFundo.setLayer(botaoAjuda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpFundo.setLayer(botaoInstrucoes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpFundo.setLayer(botaoLocaisVacinacao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpFundo.setLayer(botaoCalendario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpFundoLayout = new javax.swing.GroupLayout(jdpFundo);
        jdpFundo.setLayout(jdpFundoLayout);
        jdpFundoLayout.setHorizontalGroup(
            jdpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpFundoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jdpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpFundoLayout.createSequentialGroup()
                        .addGroup(jdpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtGrup)
                            .addComponent(jbtOnde, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdpFundoLayout.createSequentialGroup()
                                .addComponent(jbtCalen)
                                .addGap(18, 18, 18)
                                .addComponent(jbtLevarLocal))
                            .addGroup(jdpFundoLayout.createSequentialGroup()
                                .addComponent(jbtEfic)
                                .addGap(18, 18, 18)
                                .addComponent(jbtEfei))))
                    .addComponent(jlbSaibaTudo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jdpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpFundoLayout.createSequentialGroup()
                        .addComponent(botaoCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(botaoLocaisVacinacao)
                        .addGap(21, 21, 21)
                        .addComponent(botaoInstrucoes)
                        .addGap(21, 21, 21)
                        .addComponent(botaoAjuda)
                        .addGap(295, 295, 295)
                        .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpFundoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(79, 79, 79))))
        );
        jdpFundoLayout.setVerticalGroup(
            jdpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jdpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jdpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoAjuda)
                        .addComponent(botaoInstrucoes)
                        .addComponent(botaoLocaisVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbSaibaTudo)
                .addGap(18, 18, 18)
                .addGroup(jdpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpFundoLayout.createSequentialGroup()
                        .addComponent(jbtEfei)
                        .addGap(18, 18, 18)
                        .addComponent(jbtLevarLocal))
                    .addGroup(jdpFundoLayout.createSequentialGroup()
                        .addGroup(jdpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtEfic)
                            .addComponent(jbtOnde))
                        .addGap(18, 18, 18)
                        .addGroup(jdpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtGrup)
                            .addComponent(jbtCalen))))
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpFundo, 773, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpFundo, 498, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void jbtLevarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLevarLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtLevarLocalActionPerformed

    private void jbtEficActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEficActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtEficActionPerformed

    private void jbtOndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtOndeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtOndeActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Instrucoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instrucoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instrucoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instrucoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instrucoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JButton botaoAjuda;
    private javax.swing.JButton botaoCalendario;
    private javax.swing.JButton botaoInstrucoes;
    private javax.swing.JButton botaoLocaisVacinacao;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtCalen;
    private javax.swing.JButton jbtEfei;
    private javax.swing.JButton jbtEfic;
    private javax.swing.JButton jbtGrup;
    private javax.swing.JButton jbtLevarLocal;
    private javax.swing.JButton jbtOnde;
    private javax.swing.JDesktopPane jdpFundo;
    private javax.swing.JLabel jlbSaibaTudo;
    // End of variables declaration//GEN-END:variables
}
