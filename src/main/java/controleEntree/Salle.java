/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleEntree;

/**
 *
 * @author Massi
 */
public class Salle extends javax.swing.JFrame {

    /**
     * Creates new form Salle
     */
    public Salle() {
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

        compteur1 = new controleEntree.Compteur();
        compteur2 = new controleEntree.Compteur();
        compteur3 = new controleEntree.Compteur();
        compteur4 = new controleEntree.Compteur();
        salleDeConcert1 = new controleEntree.SalleDeConcert();
        porte1 = new controleEntree.Porte();
        afficheurSalle1 = new controleEntree.AfficheurSalle();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        porte2 = new controleEntree.Porte();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        afficheurSalle2 = new controleEntree.AfficheurSalle();
        porte3 = new controleEntree.Porte();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        afficheurSalle3 = new controleEntree.AfficheurSalle();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        afficheurSalle4 = new controleEntree.AfficheurSalle();

        compteur1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                compteur1PropertyChange(evt);
            }
        });

        compteur2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                compteur2PropertyChange(evt);
            }
        });

        compteur3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                compteur3PropertyChange(evt);
            }
        });

        compteur4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                compteur4PropertyChange(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        salleDeConcert1.setBackground(new java.awt.Color(204, 0, 0));

        porte1.setBackground(new java.awt.Color(51, 51, 51));

        afficheurSalle1.setForeground(new java.awt.Color(255, 255, 255));
        afficheurSalle1.setText("0");

        jButton1.setText("Entree");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
                jButton1MouseClicked1(evt);
            }
        });

        jButton2.setText("Sortie");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
                jButton2MouseClicked1(evt);
            }
        });

        javax.swing.GroupLayout porte1Layout = new javax.swing.GroupLayout(porte1);
        porte1.setLayout(porte1Layout);
        porte1Layout.setHorizontalGroup(
            porte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(porte1Layout.createSequentialGroup()
                .addGroup(porte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(porte1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(afficheurSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(porte1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(porte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        porte1Layout.setVerticalGroup(
            porte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(porte1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(afficheurSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addComponent(jButton2)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        porte2.setBackground(new java.awt.Color(51, 51, 51));

        jButton6.setText("Entree");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
                jButton6MouseClicked1(evt);
                jButton6MouseClicked2(evt);
            }
        });

        jButton7.setText("Sortie");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
                jButton7MouseClicked1(evt);
                jButton7MouseClicked2(evt);
            }
        });

        afficheurSalle2.setForeground(new java.awt.Color(255, 255, 255));
        afficheurSalle2.setText("0");

        javax.swing.GroupLayout porte2Layout = new javax.swing.GroupLayout(porte2);
        porte2.setLayout(porte2Layout);
        porte2Layout.setHorizontalGroup(
            porte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(porte2Layout.createSequentialGroup()
                .addGroup(porte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(porte2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(porte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addComponent(jButton6)))
                    .addGroup(porte2Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(afficheurSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        porte2Layout.setVerticalGroup(
            porte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(porte2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(afficheurSalle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(47, 47, 47))
        );

        porte3.setBackground(new java.awt.Color(51, 51, 51));

        jButton8.setText("Entree");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
                jButton8MouseClicked1(evt);
                jButton8MouseClicked2(evt);
            }
        });

        jButton9.setText("Sortie");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
                jButton9MouseClicked1(evt);
                jButton9MouseClicked2(evt);
            }
        });

        afficheurSalle3.setForeground(new java.awt.Color(255, 255, 255));
        afficheurSalle3.setText("0");

        javax.swing.GroupLayout porte3Layout = new javax.swing.GroupLayout(porte3);
        porte3.setLayout(porte3Layout);
        porte3Layout.setHorizontalGroup(
            porte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(porte3Layout.createSequentialGroup()
                .addGroup(porte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(porte3Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(porte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton8)
                            .addComponent(jButton9)))
                    .addGroup(porte3Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(afficheurSalle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        porte3Layout.setVerticalGroup(
            porte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(porte3Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(afficheurSalle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9)
                .addContainerGap())
        );

        jButton3.setText("Ouvrire Salle");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
                jButton3MouseClicked1(evt);
                jButton3MouseClicked2(evt);
                jButton3MouseClicked3(evt);
            }
        });

        jButton4.setText("Fermer Salle");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
                jButton4MouseClicked1(evt);
                jButton4MouseClicked2(evt);
                jButton4MouseClicked3(evt);
            }
        });

        jButton5.setText("Remettre à zero");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
                jButton5MouseClicked1(evt);
                jButton5MouseClicked2(evt);
                jButton5MouseClicked3(evt);
            }
        });

        afficheurSalle4.setForeground(new java.awt.Color(255, 255, 255));
        afficheurSalle4.setText("0");
        afficheurSalle4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        javax.swing.GroupLayout salleDeConcert1Layout = new javax.swing.GroupLayout(salleDeConcert1);
        salleDeConcert1.setLayout(salleDeConcert1Layout);
        salleDeConcert1Layout.setHorizontalGroup(
            salleDeConcert1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salleDeConcert1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(porte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(salleDeConcert1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salleDeConcert1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(porte3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(salleDeConcert1Layout.createSequentialGroup()
                        .addGroup(salleDeConcert1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salleDeConcert1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(salleDeConcert1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(90, 90, 90))
                            .addGroup(salleDeConcert1Layout.createSequentialGroup()
                                .addGroup(salleDeConcert1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(salleDeConcert1Layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(jButton5))
                                    .addGroup(salleDeConcert1Layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addComponent(afficheurSalle4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)))
                        .addComponent(porte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        salleDeConcert1Layout.setVerticalGroup(
            salleDeConcert1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salleDeConcert1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(salleDeConcert1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salleDeConcert1Layout.createSequentialGroup()
                        .addGroup(salleDeConcert1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(salleDeConcert1Layout.createSequentialGroup()
                                .addComponent(porte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(salleDeConcert1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(afficheurSalle4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addComponent(porte3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(porte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salleDeConcert1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salleDeConcert1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        compteur1.augmenter();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        compteur1.diminuer();
    }//GEN-LAST:event_jButton2MouseClicked

    private void compteur1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_compteur1PropertyChange
        afficheurSalle1.setText(compteur1.getCompteur());
    }//GEN-LAST:event_compteur1PropertyChange

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        compteur1.start();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        compteur1.stop();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        compteur1.raz();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton6MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked1
        compteur2.augmenter();
    }//GEN-LAST:event_jButton6MouseClicked1

    private void jButton7MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked1
        compteur2.diminuer();
    }//GEN-LAST:event_jButton7MouseClicked1

    private void compteur2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_compteur2PropertyChange
        afficheurSalle2.setText(compteur2.getCompteur());
    }//GEN-LAST:event_compteur2PropertyChange

    private void jButton3MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked1
        compteur2.start();
    }//GEN-LAST:event_jButton3MouseClicked1

    private void jButton4MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked1
        compteur2.stop();
    }//GEN-LAST:event_jButton4MouseClicked1

    private void jButton5MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked1
        compteur2.raz();
    }//GEN-LAST:event_jButton5MouseClicked1

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton8MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked1
        compteur3.augmenter();
    }//GEN-LAST:event_jButton8MouseClicked1

    private void jButton9MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked1
        compteur3.diminuer();
    }//GEN-LAST:event_jButton9MouseClicked1

    private void compteur3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_compteur3PropertyChange
        afficheurSalle3.setText(compteur3.getCompteur());
    }//GEN-LAST:event_compteur3PropertyChange

    private void jButton3MouseClicked2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked2
        compteur3.start();
    }//GEN-LAST:event_jButton3MouseClicked2

    private void jButton4MouseClicked2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked2
        compteur3.stop();
    }//GEN-LAST:event_jButton4MouseClicked2

    private void jButton5MouseClicked2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked2
        compteur3.raz();
    }//GEN-LAST:event_jButton5MouseClicked2

    private void jButton1MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked1
        compteur4.augmenter();
    }//GEN-LAST:event_jButton1MouseClicked1

    private void jButton6MouseClicked2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked2
        compteur4.augmenter();
    }//GEN-LAST:event_jButton6MouseClicked2

    private void jButton8MouseClicked2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked2
        compteur4.augmenter();
    }//GEN-LAST:event_jButton8MouseClicked2

    private void jButton2MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked1
        compteur4.diminuer();
    }//GEN-LAST:event_jButton2MouseClicked1

    private void jButton7MouseClicked2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked2
        compteur4.diminuer();
    }//GEN-LAST:event_jButton7MouseClicked2

    private void jButton9MouseClicked2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked2
        compteur4.diminuer();
    }//GEN-LAST:event_jButton9MouseClicked2

    private void compteur4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_compteur4PropertyChange
        afficheurSalle4.setText(compteur4.getCompteur());
    }//GEN-LAST:event_compteur4PropertyChange

    private void jButton3MouseClicked3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked3
        compteur4.start();
    }//GEN-LAST:event_jButton3MouseClicked3

    private void jButton4MouseClicked3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked3
        compteur4.stop();
    }//GEN-LAST:event_jButton4MouseClicked3

    private void jButton5MouseClicked3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked3
        compteur4.raz();
    }//GEN-LAST:event_jButton5MouseClicked3

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
            java.util.logging.Logger.getLogger(Salle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private controleEntree.AfficheurSalle afficheurSalle1;
    private controleEntree.AfficheurSalle afficheurSalle2;
    private controleEntree.AfficheurSalle afficheurSalle3;
    private controleEntree.AfficheurSalle afficheurSalle4;
    private controleEntree.Compteur compteur1;
    private controleEntree.Compteur compteur2;
    private controleEntree.Compteur compteur3;
    private controleEntree.Compteur compteur4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private controleEntree.Porte porte1;
    private controleEntree.Porte porte2;
    private controleEntree.Porte porte3;
    private controleEntree.SalleDeConcert salleDeConcert1;
    // End of variables declaration//GEN-END:variables
}