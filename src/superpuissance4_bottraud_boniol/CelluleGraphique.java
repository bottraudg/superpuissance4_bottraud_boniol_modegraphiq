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
    public CelluleGraphique (CelluledeGrille uneCellule) {
        celluleAssociee = uneCellule;
         
        
    @Override
    public void paintComponent (Graphics G) {
        super.paintComponent(G); 
        setIcon (img_vide); // on attribue l'image celluleVide.png 
        
    }
        }
}
