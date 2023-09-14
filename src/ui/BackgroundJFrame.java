/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tokobutik;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author Adit
 */
public class BackgroundJFrame extends JPanel{

   private final Image image;
     
     public BackgroundJFrame() {
         image = new ImageIcon(getClass().getResource("/asset/login1.jpg")).getImage();
     }
     @Override
	    protected void paintComponent(Graphics grphcs) {
	        super.paintComponent(grphcs);
	 
	        Graphics2D gd = (Graphics2D) grphcs.create();
	        gd.drawImage(image, 0, 0, getWidth(), getHeight(), null);
                gd.dispose();
    }
    
}
