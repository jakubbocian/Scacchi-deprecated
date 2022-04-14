/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.*;
/**
 *
 * @author ADMIN
 */
public class FrameMenu extends javax.swing.JFrame {
    
    static int stile_scacchiera=1;
    
    /**
     * Creates new form FrameMenu
     */
    public FrameMenu() {
        initComponents();
        MenuOpzioni.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuMain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        MenuOpzioni = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scacchi");
        setResizable(false);

        MenuMain.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scacchi_text.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(188, 140, 99));
        jButton1.setText("Gioca");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BottoneEntra(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BottoneEsci(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(133, 94, 66));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Opzioni");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BottoneEntra(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BottoneEsci(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListenerApriOpzioni(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(133, 94, 66));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Esci :)");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BottoneEntraTriste(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BottoneEsciTriste(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(188, 140, 99));
        jButton4.setText("Partite precedenti");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BottoneEntra(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BottoneEsci(evt);
            }
        });

        javax.swing.GroupLayout MenuMainLayout = new javax.swing.GroupLayout(MenuMain);
        MenuMain.setLayout(MenuMainLayout);
        MenuMainLayout.setHorizontalGroup(
            MenuMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuMainLayout.createSequentialGroup()
                .addGroup(MenuMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuMainLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(MenuMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MenuMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                    .addGroup(MenuMainLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(200, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );
        MenuMainLayout.setVerticalGroup(
            MenuMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        MenuOpzioni.setBackground(new java.awt.Color(255, 255, 255));
        MenuOpzioni.setPreferredSize(new java.awt.Dimension(600, 400));
        MenuOpzioni.setVisible(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opzioni_text.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(155, 50));

        jButton5.setBackground(new java.awt.Color(188, 140, 99));
        jButton5.setText("Esci");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BottoneEntraTriste(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BottoneEsciTriste(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsciOpzioni(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frecciasx.png"))); // NOI18N
        jButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premi_frecciasx(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frecciadx.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premi_frecciadx(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 40)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Classico");

        jButton8.setText("Elimina risultati delle partite");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminaRisPartite(evt);
            }
        });

        javax.swing.GroupLayout MenuOpzioniLayout = new javax.swing.GroupLayout(MenuOpzioni);
        MenuOpzioni.setLayout(MenuOpzioniLayout);
        MenuOpzioniLayout.setHorizontalGroup(
            MenuOpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuOpzioniLayout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addGroup(MenuOpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuOpzioniLayout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuOpzioniLayout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuOpzioniLayout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))))
            .addGroup(MenuOpzioniLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MenuOpzioniLayout.setVerticalGroup(
            MenuOpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuOpzioniLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(MenuOpzioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MenuOpzioni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MenuOpzioni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BottoneEntra(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BottoneEntra
        // TODO add your handling code here:
        JButton bottone = (JButton)evt.getSource();
        bottone.setBounds(bottone.getLocation().x-7, bottone.getLocation().y-7, bottone.getSize().width+14, bottone.getSize().height+14);
        
    }//GEN-LAST:event_BottoneEntra

    private void BottoneEsci(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BottoneEsci
        // TODO add your handling code here:
        JButton bottone = (JButton)evt.getSource();
        bottone.setBounds(bottone.getLocation().x+7, bottone.getLocation().y+7, bottone.getSize().width-14, bottone.getSize().height-14);
    }//GEN-LAST:event_BottoneEsci

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BottoneEntraTriste(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BottoneEntraTriste
        // TODO add your handling code here:
        JButton bottone = (JButton)evt.getSource();      
        bottone.setText("Esci :(");
        bottone.setBounds(bottone.getLocation().x-7, bottone.getLocation().y-7, bottone.getSize().width+14, bottone.getSize().height+14);
    }//GEN-LAST:event_BottoneEntraTriste

    private void BottoneEsciTriste(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BottoneEsciTriste
        // TODO add your handling code here:
        JButton bottone = (JButton)evt.getSource();
        bottone.setBounds(bottone.getLocation().x+7, bottone.getLocation().y+7, bottone.getSize().width-14, bottone.getSize().height-14);
        bottone.setText("Esci :)");        
    }//GEN-LAST:event_BottoneEsciTriste

    private void ListenerApriOpzioni(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListenerApriOpzioni
        // TODO add your handling code here:
        MenuMain.setVisible(false);
        MenuOpzioni.setVisible(true);
    }//GEN-LAST:event_ListenerApriOpzioni

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EsciOpzioni(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsciOpzioni
        // TODO add your handling code here:
        MenuOpzioni.setVisible(false);
        MenuMain.setVisible(true);
    }//GEN-LAST:event_EsciOpzioni

    private void premi_frecciadx(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premi_frecciadx
        // TODO add your handling code here:
        if(stile_scacchiera==3)
            stile_scacchiera = 1;
        
        else
            stile_scacchiera = stile_scacchiera +1;
        
        imposta_stile();

    }//GEN-LAST:event_premi_frecciadx

    private void premi_frecciasx(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premi_frecciasx
        // TODO add your handling code here:
        
        if(stile_scacchiera==1)
            stile_scacchiera = 3;
        
        else
            stile_scacchiera = stile_scacchiera -1;
        
        imposta_stile();
    }//GEN-LAST:event_premi_frecciasx

    private void EliminaRisPartite(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminaRisPartite
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Lista delle partite precedenti pulita con successo", "Operazione effettuata", JOptionPane.PLAIN_MESSAGE);
        
    }//GEN-LAST:event_EliminaRisPartite
    
    private void imposta_stile(){
        
        if(stile_scacchiera == 1)
            jLabel3.setText("Classico");
        
        else if(stile_scacchiera == 2)
            jLabel3.setText("Anni 60");
        
        else
            jLabel3.setText("Moderno");
    
    }
    
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
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                FrameMenu f = new FrameMenu();
                
                f.setVisible(true);
                f.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuMain;
    private javax.swing.JPanel MenuOpzioni;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
