
package controlador;

import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.AcccesoLogin;
import static modelo.AcccesoLogin.cn;
import modelo.UsuariosClientesRegistrados;
import vista.InformacionDelCliente;
import vista.InformacionDelUsuario;


public class ControladorUsuariosClientesRegistrados {
     private ResultSet rs;
     UsuariosClientesRegistrados usuarios=new UsuariosClientesRegistrados();
     private boolean validar;
     
     public void mostrarUsuariosRegistrados(JTable tabla,String tiponivel){
         validar=tiponivel.equals("Administrador");
         rs=usuarios.mostrarUsuariosRegistrados(tabla,validar);
         
         try {
             Object[] datos = new Object[5];
             while (rs.next()) {
                 for (int i = 0; i < 5; i++) {
                     datos[i] = rs.getString(1 + i);
                 }
                 usuarios.model.addRow(datos);
             }
             rs.close();
         }catch(SQLException e){
              JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
         }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
     }
    
     public void setEventoMouseClicked(JTable tabla,String username){
      
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
 
        @Override
        public void mouseClicked(MouseEvent e) {
            usuarios.eventoMouseClicked(e, tabla);
            if (validar == true) {
                new InformacionDelUsuario(usuarios.nombreusuario, usuarios.idusuario, username).setVisible(true);
            } else {
                new InformacionDelCliente(usuarios.nombreusuario, usuarios.idusuario, username).setVisible(true);
            }
        }
  
        });
    }
     public String validarUsername(){
         rs = usuarios.validarUsername();
         String validarusername = "";
         try {
             while (rs.next()) {
                 validarusername = rs.getString("username");
             }
             rs.close();
         } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
         }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
         return validarusername;
     }
}
