/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4_bottraud_boniol;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author guilenebottraud
 */
public class CelluleGraphique extends JButton{
    CelluledeGrille celluleAssociee;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png")) ;
    ImageIcon img_desint = new javax.swing.ImageIcon(getClass().getResource("/images/desintegrateur.png")) ;
    ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass().getResource("/images/jetonJaune.png")) ;
    ImageIcon img_jetonRouge = new javax.swing.ImageIcon(getClass().getResource("/images/jetonRouge.png")) ;
    ImageIcon img_trouNoir = new javax.swing.ImageIcon(getClass().getResource("/images/trouNoir.png")) ;
    
    
    public CelluleGraphique (CelluledeGrille uneCellule) {
        celluleAssociee = uneCellule;
         
        
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G); 
        if (celluleAssociee.presenceTrouNoir() == true) {
        setIcon (img_trouNoir); // on attribue l'image celluleVide.png 
        }
        else if (celluleAssociee.presenceDesintegrateur()== true) {
        setIcon (img_desint); 
        } 
        else String.couleur_jeton = celluleAssociee.lireCouleurDuJeton();
        switch (celluleAssociee.lireCouleurDuJeton()){
         
}}
