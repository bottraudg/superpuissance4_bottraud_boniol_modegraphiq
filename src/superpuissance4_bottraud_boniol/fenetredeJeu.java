/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package superpuissance4_bottraud_boniol;

import java.util.Random;
import java.util.Scanner;

/** 
 *
 * @author guilenebottraud
 */
public class fenetredeJeu extends javax.swing.JFrame {

    private joueur[] ListeJoueurs = new joueur[2];
    private joueur JoueurCourant;
    private PlateauDeJeu plateau;

    /**
     * Creates new form fenetredeJeu
     */
    public fenetredeJeu() {
        initComponents();
        panneau_info_joueurs.setVisible(false);
        panneau_info_partie.setVisible(false);

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(PlateauDeJeu.CelluledeGrille[i][j]);
                panneau_grille.add(cellGraph);

            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        panneau_info_partie = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_jcourant = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        panneau_création_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nom_joueur2 = new javax.swing.JTextField();
        nom_joueur1 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_info_joueurs = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_j2_nom = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        lbl_j2_desint = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_j1_nom = new javax.swing.JLabel();
        lbl_j1_desint = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 76, 676, 530));

        panneau_info_partie.setBackground(new java.awt.Color(204, 255, 204));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Joueur courant :");
        panneau_info_partie.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel10.setText("Joueur 2 :");
        panneau_info_partie.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lbl_jcourant.setText("nomJoueur");
        panneau_info_partie.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        panneau_info_partie.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 220, 90));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel11.setText("Info Jeu :");
        panneau_info_partie.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, -1));

        getContentPane().add(panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 270, 130));

        panneau_création_partie.setBackground(new java.awt.Color(204, 255, 204));
        panneau_création_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Joueur 2: ");
        panneau_création_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        panneau_création_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 20));

        jLabel3.setText("Nom Joueur 1: ");
        panneau_création_partie.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        panneau_création_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        nom_joueur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur1ActionPerformed(evt);
            }
        });
        panneau_création_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        btn_start.setText("Démarrer partie ");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_création_partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        getContentPane().add(panneau_création_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 270, 130));

        panneau_info_joueurs.setBackground(new java.awt.Color(204, 255, 204));
        panneau_info_joueurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("Info joueur :");
        panneau_info_joueurs.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setText("Joueur 1 : ");
        panneau_info_joueurs.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel7.setText("Joueur 2 :");
        panneau_info_joueurs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lbl_j2_nom.setText("nomJoueur2: ");
        panneau_info_joueurs.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jLabel8.setText("Desintegrateurs :");
        panneau_info_joueurs.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel9.setText("Couleur :");
        panneau_info_joueurs.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lbl_j2_couleur.setText("CouleurJoueur2:");
        panneau_info_joueurs.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        lbl_j2_desint.setText("nbdesintjoueur2:");
        panneau_info_joueurs.add(lbl_j2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jLabel14.setText("Desintegrateurs :");
        panneau_info_joueurs.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel15.setText("Couleur :");
        panneau_info_joueurs.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, -1, 20));

        lbl_j1_nom.setText("nomJoueur1: ");
        panneau_info_joueurs.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        lbl_j1_desint.setText("nbdesintjoueur1:");
        panneau_info_joueurs.add(lbl_j1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        lbl_j1_couleur.setText("CouleurJoueur1:");
        panneau_info_joueurs.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));
        panneau_info_joueurs.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 230, 10));

        getContentPane().add(panneau_info_joueurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 260, 260));

        btn_col_0.setText("1");
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btn_col_1.setText("2");
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 30, -1, -1));

        btn_col_2.setText("3");
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 30, -1, -1));

        btn_col_3.setText("4");
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 30, -1, -1));

        btn_col_4.setText("5");
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 30, -1, -1));

        btn_col_5.setText("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        btn_col_6.setText("7");
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nom_joueur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur1ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        // TODO add your handling code here:
        panneau_info_joueurs.setVisible(true);
        panneau_info_partie.setVisible(true);
        initialiserPartie();
        panneau_grille.repaint();
        btn_start.setEnabled(false);
        
        
    }//GEN-LAST:event_btn_startActionPerformed

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
            java.util.logging.Logger.getLogger(fenetredeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetredeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetredeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetredeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetredeJeu().setVisible(true);
            }
        });
    }
public void initialiserPartie() {
     plateau = new PlateauDeJeu();
        plateau.viderGrille(); // créé et afficher grille

        String nomJoueur1 = nom_joueur1.getText();
        joueur J1 = new joueur(nomJoueur1);
        
        
         String nomJoueur2 = nom_joueur2.getText();
        joueur J2 = new joueur(nomJoueur2);
        
        
        ListeJoueurs[0] = J1;
        ListeJoueurs[1] = J2; 
        
        attribuerCouleursAuxJoueurs();
        lbl_j1_nom.setText(nomJoueur1);
        lbl_j2_nom.setText(nomJoueur2);
        
        lbl_j1_couleur.setText(J1.Couleur);
        lbl_j2_couleur.setText(J2.Couleur);
                
        lbl_j1_desint.setText(J1.nombreDesintegrateurs+"");
        lbl_j2_desint.setText(J2.nombreDesintegrateurs+"");
                
                
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nom du premier joueur :");
        joueur joueur1 = new joueur(sc.nextLine());
        System.out.println("Entrer le nom du deuxième joueur :");
        joueur joueur2 = new joueur(sc.nextLine());
        ListeJoueurs[0] = joueur1;
        ListeJoueurs[1] = joueur2;

 }
public void attribuerCouleursAuxJoueurs(){
    Random alea = new Random(); // attribution des joueurs au hasard
    boolean ChoixJoueur;
    ChoixJoueur = alea.nextBoolean();
    if (ChoixJoueur == true){
        ListeJoueurs[0].couleur = "Jaune";
        ListeJoueurs[1].couleur = "Rouge";
    }
    else {
        ListeJoueurs[0].couleur = "Rouge";
        ListeJoueurs[1].couleur = "Jaune";
        lbl_jcourant.setText(JoueurCourant.nom );
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_desint;
    private javax.swing.JLabel lbl_j1_nom;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_desint;
    private javax.swing.JLabel lbl_j2_nom;
    private javax.swing.JLabel lbl_jcourant;
    private javax.swing.JTextArea message;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JPanel panneau_création_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_joueurs;
    private javax.swing.JPanel panneau_info_partie;
    // End of variables declaration//GEN-END:variables
}
