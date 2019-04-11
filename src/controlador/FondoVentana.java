
package controlador;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.FondoSwing;


public class FondoVentana extends JFrame{

   
    public void ImagenVentanaLogin(JLabel lLogo){
        try { 
            BufferedImage img = ImageIO.read(getClass().getResource("/images/DS.png"));
            FondoSwing fondo = new FondoSwing(img);
            lLogo.setBorder(fondo);
        } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void FondoVentas(JFrame p){
        
        try { 
            BufferedImage img = ImageIO.read(getClass().getResource("/images/wallpaperPrincipal.jpg"));
            FondoSwing fondo = new FondoSwing(img);
            JPanel panel = (JPanel) p.getContentPane();
            panel.setBorder(fondo);
        } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
