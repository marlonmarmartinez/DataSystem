
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.AcccesoLogin;
import static modelo.AcccesoLogin.cn;
import modelo.RegistroUsuario;


public class ControladorRegistroUsuario {
    ResultSet rs;
    PreparedStatement ps;
    RegistroUsuario registrar=new RegistroUsuario();
   
    public void registrarUsuarios(String nombre,String correo,String telefono,String username,String pass,JComboBox tiponivel,String registradopor){
        ps=registrar.registrarUsuarios();
        
            try {
                ps.setString(1,"0");
                ps.setString(2, nombre.trim());
                ps.setString(3, correo.trim());
                ps.setString(4, telefono.trim());
                ps.setString(5, username.trim());
                ps.setString(6, pass.trim());
                ps.setString(7, (String) tiponivel.getSelectedItem());
                ps.setString(8, "activo");
                ps.setString(9, registradopor);
                ps.executeUpdate();
                ps.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"error al conectar con la BBDD contacte al administrador: "+e.getMessage());
            }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
    }
    public void cargaTipoNivel(JComboBox tiponivel){
         rs=registrar.cargarTipoNivel();
        
        try {
            while(rs.next()){
                tiponivel.addItem(rs.getString("tipo_nivel"));
                
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"error al conectar con la BBDD contacte al administrador: "+e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
    
}
