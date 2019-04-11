/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorAccesoLogin;
import controlador.FondoVentana;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.AcccesoLogin;

/**
 *3118505883
 * @author Lnv
 */
public class Login extends javax.swing.JFrame {

    public static String User="";//envia datos entre interfaces
    String pass="";
     String nombre;
     
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setSize(400,550);
        setResizable(false);
        setTitle("Acceso Al Sistema");
        setLocationRelativeTo(null);
        
        FondoVentana fondo=new FondoVentana();
        
        fondo.ImagenVentanaLogin(lLogo);
        fondo.FondoVentas(this);
    }
   
    @Override
    public Image getIconImage(){
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        lLogo = new javax.swing.JLabel();
        btnacceder = new javax.swing.JButton();
        lfooter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtuser.setBackground(new java.awt.Color(153, 153, 255));
        txtuser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtuser.setForeground(new java.awt.Color(255, 255, 255));
        txtuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtuser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 330, 210, 30));

        txtpass.setBackground(new java.awt.Color(153, 153, 255));
        txtpass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtpass.setForeground(new java.awt.Color(255, 255, 255));
        txtpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpassKeyTyped(evt);
            }
        });
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 370, 210, 30));
        getContentPane().add(lLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 270, 270));

        btnacceder.setBackground(new java.awt.Color(153, 153, 255));
        btnacceder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnacceder.setForeground(new java.awt.Color(255, 255, 255));
        btnacceder.setText("ACCEDER");
        btnacceder.setBorder(null);
        btnacceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaccederActionPerformed(evt);
            }
        });
        getContentPane().add(btnacceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 420, 210, 35));

        lfooter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lfooter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lfooter.setText("Creado por Marlon ®");
        getContentPane().add(lfooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 500, 210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaccederActionPerformed
        User=txtuser.getText().trim();
        pass=txtpass.getText().trim();
        
        if(!User.equals("") || !pass.equals("")){
            new ControladorAccesoLogin(User, pass);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "debe de llanar todos los campos");
            
        }
        
    }//GEN-LAST:event_btnaccederActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
       
    }//GEN-LAST:event_txtpassActionPerformed

    private void txtpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyTyped
        char teclapresionada=evt.getKeyChar();
        if(teclapresionada==KeyEvent.VK_ENTER){
            btnacceder.doClick();
        }
    }//GEN-LAST:event_txtpassKeyTyped
     
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacceder;
    private javax.swing.JLabel lLogo;
    private javax.swing.JLabel lfooter;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
