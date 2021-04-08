package szamologep;

/**
 *
 * @author brandonberenyi
 */
public class egyenicalc extends javax.swing.JFrame {
    int a = 3;
    int b = 3;
    double osztas_eredmeny = ((double)a)/b;
    public egyenicalc() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btn_uj_feladat = new javax.swing.JButton();
        btn_megoldas = new javax.swing.JButton();
        btn_ellenorzes = new javax.swing.JButton();
        lbl_muvelete = new javax.swing.JLabel();
        lbl_visszajelzes = new javax.swing.JLabel();
        lbl_kerdesek_szama = new javax.swing.JLabel();
        lbl_osszeadas = new javax.swing.JLabel();
        lbl_kivonas = new javax.swing.JLabel();
        lbl_szorzas = new javax.swing.JLabel();
        lbl_osztas = new javax.swing.JLabel();
        lbl_probalkozasok = new javax.swing.JLabel();
        lbl_prob_osszeadas = new javax.swing.JLabel();
        lbl_prob_kivonas = new javax.swing.JLabel();
        lbl_prob_szorzas = new javax.swing.JLabel();
        lbl_prob_osztas = new javax.swing.JLabel();
        lbl_eredmeny = new javax.swing.JLabel();
        txtf_megoldas = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_fajl = new javax.swing.JMenu();
        menu_fajl_mentes = new javax.swing.JCheckBoxMenuItem();
        menu_fajl_megnyitas = new javax.swing.JCheckBoxMenuItem();
        menu_fajl_kilepes = new javax.swing.JCheckBoxMenuItem();
        menu_muveletek = new javax.swing.JMenu();
        menu_muv_osszeadas = new javax.swing.JRadioButtonMenuItem();
        menu_muv_kivonas = new javax.swing.JRadioButtonMenuItem();
        menu_muv_szorzas = new javax.swing.JRadioButtonMenuItem();
        menu_muv_osztas = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_uj_feladat.setText("Új feladat");

        btn_megoldas.setText("Megoldás");

        btn_ellenorzes.setText("Ellenőrzés");
        btn_ellenorzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ellenorzesActionPerformed(evt);
            }
        });

        lbl_muvelete.setText("11 + 11 =");

        lbl_visszajelzes.setText("Visszajelzés");

        lbl_kerdesek_szama.setText("Össz kérdések száma:");

        lbl_osszeadas.setText("Összeadás");

        lbl_kivonas.setText("Kivonás");

        lbl_szorzas.setText("Szorzás");

        lbl_osztas.setText("Osztás");

        lbl_probalkozasok.setText("Össz próbálkozások száma:");

        lbl_prob_osszeadas.setText("Összeadás");

        lbl_prob_kivonas.setText("Kivonás");

        lbl_prob_szorzas.setText("Szorzás");

        lbl_prob_osztas.setText("Osztás");

        lbl_eredmeny.setText("Eredmény %");

        menu_fajl.setText("Fájl");

        menu_fajl_mentes.setSelected(true);
        menu_fajl_mentes.setText("Mentés");
        menu_fajl.add(menu_fajl_mentes);

        menu_fajl_megnyitas.setSelected(true);
        menu_fajl_megnyitas.setText("Megnyitás");
        menu_fajl.add(menu_fajl_megnyitas);

        menu_fajl_kilepes.setSelected(true);
        menu_fajl_kilepes.setText("Kilépés");
        menu_fajl.add(menu_fajl_kilepes);

        jMenuBar1.add(menu_fajl);

        menu_muveletek.setText("Műveletek");

        buttonGroup1.add(menu_muv_osszeadas);
        menu_muv_osszeadas.setText("Összeadás");
        menu_muveletek.add(menu_muv_osszeadas);

        buttonGroup1.add(menu_muv_kivonas);
        menu_muv_kivonas.setText("Kivonás");
        menu_muveletek.add(menu_muv_kivonas);

        buttonGroup1.add(menu_muv_szorzas);
        menu_muv_szorzas.setText("Szorzás");
        menu_muveletek.add(menu_muv_szorzas);

        buttonGroup1.add(menu_muv_osztas);
        menu_muv_osztas.setText("Osztás");
        menu_muv_osztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_muv_osztasActionPerformed(evt);
            }
        });
        menu_muveletek.add(menu_muv_osztas);

        jMenuBar1.add(menu_muveletek);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_kerdesek_szama)
                                    .addComponent(lbl_osszeadas)
                                    .addComponent(lbl_kivonas)
                                    .addComponent(lbl_szorzas)
                                    .addComponent(lbl_osztas))
                                .addGap(117, 117, 117)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_prob_osszeadas)
                                    .addComponent(lbl_probalkozasok)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbl_prob_kivonas)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_prob_osztas)
                                            .addComponent(lbl_prob_szorzas)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_muvelete)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtf_megoldas, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_ellenorzes, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_visszajelzes))
                                .addGap(138, 138, 138)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_uj_feladat)
                                    .addComponent(btn_megoldas)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(lbl_eredmeny)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ellenorzes)
                            .addComponent(txtf_megoldas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_muvelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_visszajelzes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btn_uj_feladat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_megoldas)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_kerdesek_szama)
                    .addComponent(lbl_probalkozasok))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_osszeadas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_prob_osszeadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_kivonas)
                    .addComponent(lbl_prob_kivonas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_szorzas)
                    .addComponent(lbl_prob_szorzas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_osztas)
                    .addComponent(lbl_prob_osztas))
                .addGap(18, 18, 18)
                .addComponent(lbl_eredmeny)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ellenorzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ellenorzesActionPerformed
        ellenorzes();
    }//GEN-LAST:event_btn_ellenorzesActionPerformed

    private void menu_muv_osztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_muv_osztasActionPerformed
        osztas();
    }//GEN-LAST:event_menu_muv_osztasActionPerformed

    private void osztas(){
        lbl_muvelete.setText(a + " / " + b + " = ");
        
    }
    private void ellenorzes(){
        int szamok = Integer.parseInt(txtf_megoldas.getText());
        
        if (osztas_eredmeny == szamok) {
            lbl_visszajelzes.setText("Helyes válasz!");
            btn_ellenorzes.setEnabled(false);
        }else{
            lbl_visszajelzes.setText("Helytelen válasz!");
        }
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
            java.util.logging.Logger.getLogger(egyenicalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(egyenicalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(egyenicalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(egyenicalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new egyenicalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ellenorzes;
    private javax.swing.JButton btn_megoldas;
    private javax.swing.JButton btn_uj_feladat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_eredmeny;
    private javax.swing.JLabel lbl_kerdesek_szama;
    private javax.swing.JLabel lbl_kivonas;
    private javax.swing.JLabel lbl_muvelete;
    private javax.swing.JLabel lbl_osszeadas;
    private javax.swing.JLabel lbl_osztas;
    private javax.swing.JLabel lbl_prob_kivonas;
    private javax.swing.JLabel lbl_prob_osszeadas;
    private javax.swing.JLabel lbl_prob_osztas;
    private javax.swing.JLabel lbl_prob_szorzas;
    private javax.swing.JLabel lbl_probalkozasok;
    private javax.swing.JLabel lbl_szorzas;
    private javax.swing.JLabel lbl_visszajelzes;
    private javax.swing.JMenu menu_fajl;
    private javax.swing.JCheckBoxMenuItem menu_fajl_kilepes;
    private javax.swing.JCheckBoxMenuItem menu_fajl_megnyitas;
    private javax.swing.JCheckBoxMenuItem menu_fajl_mentes;
    private javax.swing.JRadioButtonMenuItem menu_muv_kivonas;
    private javax.swing.JRadioButtonMenuItem menu_muv_osszeadas;
    private javax.swing.JRadioButtonMenuItem menu_muv_osztas;
    private javax.swing.JRadioButtonMenuItem menu_muv_szorzas;
    private javax.swing.JMenu menu_muveletek;
    private javax.swing.JTextField txtf_megoldas;
    // End of variables declaration//GEN-END:variables
}
