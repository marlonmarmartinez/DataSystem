
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static modelo.AcccesoLogin.cn;


public class RegistroUsuario {
    private PreparedStatement ps;
    private ResultSet rs;
    
    public PreparedStatement registrarUsuarios(){
        try {
                cn=Conexion.conectar();
                return ps=cn.prepareStatement("insert into usuarios values(?,?,?,?,?,?,?,?,?)");
     
            }catch (SQLException e) {
                System.err.println("Error en el boton Registrar : "+e.getMessage());
                JOptionPane.showMessageDialog(null,"error al iniciar sesion contacte al administrador: "+e.getMessage());
                
            }
    return null;
    }
    
    public ResultSet cargarTipoNivel(){
        try {
                cn=Conexion.conectar();
                ps=cn.prepareStatement("SELECT DISTINCTROW tipo_nivel FROM usuarios");
                return rs=ps.executeQuery();
     
            }catch (SQLException e) {
                System.err.println("Error en el Combobox : "+e.getMessage());
                JOptionPane.showMessageDialog(null,"error al iniciar sesion contacte al administrador: "+e.getMessage());
                
            }
    return null;
    }
}
