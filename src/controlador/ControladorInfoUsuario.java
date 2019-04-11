
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import modelo.AcccesoLogin;
import static modelo.AcccesoLogin.cn;
import modelo.InformacionDelUsuario;


public class ControladorInfoUsuario {
    InformacionDelUsuario datos=new InformacionDelUsuario();
    private ResultSet rs;
    private PreparedStatement ps;
    public String nombre,mail,telef,usua,tiponi,estat;
    
    public void mostrarInformacionDelUsuario(int idusuario,JTextField nom,JTextField email,JTextField tel,JTextField usu,JTextField registropor,JComboBox tiponivel,JComboBox estatus){
        rs=datos.consultarInformacionUsuario(idusuario);
        
        try {
             while(rs.next()){
                   nom.setText(rs.getString("nombre_usuario"));
                   email.setText(rs.getString("email"));
                   tel.setText(rs.getString("telefono"));
                   usu.setText(rs.getString("username"));
                   registropor.setText(rs.getString("registrado_por"));
                   tiponivel.setSelectedItem(rs.getString("tipo_nivel"));
                   estatus.setSelectedItem(rs.getString("estatus"));
                  
                }
              rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
    
    public void actualizarIfoUsuario(int idusuario,JTextField nom,JTextField email,JTextField tel,JTextField usu,JComboBox tiponivel,JComboBox estatus){
        ps=datos.actualizarUsuario(idusuario);
        
        try {
                ps.setString(1, nom.getText().trim());
                ps.setString(2, email.getText().trim());
                ps.setString(3, tel.getText().trim());
                ps.setString(4, usu.getText().trim());
                ps.setString(5, (String) tiponivel.getSelectedItem());
                ps.setString(6, (String) estatus.getSelectedItem());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
    
    public void restaurarPassword(int idusuario,JPasswordField nuevapass){
        ps=datos.restaurarPassword(idusuario);
        
        try {
            ps.setString(1, nuevapass.getText().trim());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "se ha restablecido el password", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
    public void controlaBotonUpdateUsuario(int idusuario){
        rs=datos.consultarInformacionUsuario(idusuario);
        
        try {
            if(rs.next()){
                   nombre=rs.getString("nombre_usuario");
                   mail=rs.getString("email");
                   telef=rs.getString("telefono");
                   usua=rs.getString("username");
                   tiponi=rs.getString("tipo_nivel");
                   estat=rs.getString("estatus");
            }
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage()); 
        }
    }
}
